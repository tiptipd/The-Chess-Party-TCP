import java.net.*;
import java.io.*;

public class Server {

    //initialize socket and input stream
    private Socket socket;
    private ServerSocket server;
    private DataInputStream in;

    // constructor with port
    public Server(int port) {
        // starts server and waits for a connection
        try {
            setServer(new ServerSocket(port));
            System.out.println("Server started");

            System.out.println("Waiting for a client ...");

            setSocket(server.accept());
            System.out.println("Client accepted");

            // takes input from the client socket
            setIn(new DataInputStream(
                    new BufferedInputStream(socket.getInputStream())));

            String line = "";

            // reads message from client until "Over" is sent
            while (!line.equals("TERMINATE")) {
                try {
                    line = getIn().readUTF();
                    System.out.println(line);

                } catch (IOException i) {
                    System.out.println(i.getMessage());
                }
            }
            System.out.println("Closing connection");

            // close connection
            getSocket().close();
            getIn().close();
        } catch (IOException i) {
            System.out.println(i.getMessage());
        }
    }

    //-------------- main access method -----------------------

    public static void main(String args[]) {
        Server server = new Server(5000);
    }

    //-------------- Getters and Setters ----------------------

    public Socket getSocket() {
        return socket;
    }

    public void setSocket(Socket socket) {
        this.socket = socket;
    }

    public ServerSocket getServer() {
        return server;
    }

    public void setServer(ServerSocket server) {
        this.server = server;
    }

    public DataInputStream getIn() {
        return in;
    }

    public void setIn(DataInputStream in) {
        this.in = in;
    }
}