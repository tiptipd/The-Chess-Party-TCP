import java.net.*;
import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Client {

    // initialize socket and input output streams
    private Socket socket;
    private DataInputStream input;
    private DataOutputStream out;
    private String serverIP;
    private int port;
    private static Scanner scan = new Scanner(System.in);

    // constructor to put ip address and port
    public Client(String address, int port) {
        // establish a connection
        try {
            setSocket(new Socket(address, port));
            System.out.println("Connected at address" + getServerIP() + " on port" + getPort());

            // takes input from terminal
            setInput(new DataInputStream(System.in));

            // sends output to the socket
            setOut(new DataOutputStream(socket.getOutputStream()));
        } catch (UnknownHostException u) {
            System.out.println(u.getMessage());
        } catch (IOException i) {
            System.out.println(i.getMessage());
        }
    }

    public void runClient() {
        // string to read message from input
        String line = "";

        // keep reading until "Over" is input
        while (!line.equals("TERMINATE")) {
            try {
                BufferedReader d
                        = new BufferedReader(new InputStreamReader(getInput()));
                line = d.readLine();
                getOut().writeUTF(line);
            } catch (IOException i) {
                System.err.println("Error occurred in the runClient method" + i);
            }
        }

        // close the connection
        try {
            getInput().close();
            getOut().close();
            getSocket().close();
        } catch (IOException i) {
            System.out.println(i);
        }
    }

    public static String setUpIp() {
        String input = "";
        String zeroTo255
                = "(\\d{1,2}|(0|1)\\"
                + "d{2}|2[0-4]\\d|25[0-5])";

        // Regex for a digit from 0 to 255 and
        // followed by a dot, repeat 4 times.
        // this is the regex to validate an IP address.
        String regex
                = zeroTo255 + "\\."
                + zeroTo255 + "\\."
                + zeroTo255 + "\\."
                + zeroTo255;

        // Compile the ReGex
        Pattern p = Pattern.compile(regex);
        try {
            System.out.println();
            while (true) {
                System.out.println("Enter the ip address you wish to connect to...");
                input = getScan().nextLine();
                Matcher m = p.matcher(input);

                if (m.matches()) {
                    System.out.println("valid ip!!");
                    break;
                } else {
                    System.out.println("ip is invalid please try again..");
                }
            }
        } catch (Exception e) {
            System.err.println("error occurred in setUpIp method" + e.getStackTrace());
        }
        return input;
    }

    public static int setUpPort() {
        String input;
        int port = 0;
        String portReg = "(\\d{1,5})";
        Pattern p = Pattern.compile(portReg);
        try {
            while (true) {
                System.out.println("Enter the port number you wish to connect with...");
                input = getScan().nextLine();
                Matcher m = p.matcher(input);

                if (m.matches()) {
                    System.out.println("valid port bust out the port!!");
                    port = Integer.parseInt(input);
                    break;
                } else {
                    System.out.println("port is invalid you dummy try again..");
                }
            }
        } catch (Exception e) {
            System.err.println("Error occurred in setUpPort method " + e.getStackTrace());
        }
        return port;
    }

    //-------------- main access method -------------------------

    public static void main(String args[]) {
        String clientIp = setUpIp();
        int clientPort = setUpPort();
        Client client = new Client(clientIp, clientPort);
        client.getServerIP();
    }

    //--------- Getters and setters -----------------------------

    public Socket getSocket() {
        return socket;
    }

    public void setSocket(Socket socket) {
        this.socket = socket;
    }

    public DataInputStream getInput() {
        return input;
    }

    public void setInput(DataInputStream input) {
        this.input = input;
    }

    public DataOutputStream getOut() {
        return out;
    }

    public void setOut(DataOutputStream out) {
        this.out = out;
    }

    public String getServerIP() {
        return serverIP;
    }

    public void setServerIP(String serverIP) {
        this.serverIP = serverIP;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public static Scanner getScan() {
        return scan;
    }
}
