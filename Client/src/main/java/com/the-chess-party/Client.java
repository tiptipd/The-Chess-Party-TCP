import java.net.*;
import java.io.*;

public class Client {

    // initialize socket and input output streams
    private Socket socket;
    private DataInputStream input;
    private DataOutputStream out;

    // constructor to put ip address and port
    public Client(String address, int port) {
        // establish a connection
        try {
            setSocket(new Socket(address, port));
            System.out.println("Connected");

            // takes input from terminal
            setInput(new DataInputStream(System.in));

            // sends output to the socket
            setOut(new DataOutputStream(socket.getOutputStream()));
        } catch (UnknownHostException u) {
            System.out.println(u.getMessage());
        } catch (IOException i) {
            System.out.println(i.getMessage());
        }

        // string to read message from input
        String line = "";

        // keep reading until "Over" is input
        while (!line.equals("TERMINATE")) {
            try {
                line = getInput().readLine();
                getOut().writeUTF(line);
            } catch (IOException i) {
                System.out.println(i);
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

    //-------------- main access method -------------------------

    public static void main(String args[]) {
        Client client = new Client("127.0.0.1", 5000);
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
}
