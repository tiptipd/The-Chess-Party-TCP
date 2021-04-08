import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientHandler implements Runnable {

    private Socket client;
    private BufferedReader in;
    private PrintWriter out;

    public ClientHandler(Socket clientSocket) throws IOException {
        this.client = clientSocket;
        setIn(new BufferedReader(new InputStreamReader(client.getInputStream())));
        setOut(new PrintWriter(client.getOutputStream(), true));
    }

    @Override
    public void run() {
        try {
            while (true) {
                String request = getIn().readLine();
                if (request.contains("name")) {
                    getOut().println("conenction was made in handler");
                } else {
                    getOut().println("Type 'tell me a name' to get a random name");
                }
            }
        } catch (IOException e) {
            System.err.println("IO Exception in client handler");
            System.err.println(e.getStackTrace());
        } finally {
            getOut().close();
            closeConnection();
        }
    }

    public void closeConnection(){
        try {
            getIn().close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //-------------- getters and setters ---------------------

    public Socket getClient() {
        return client;
    }

    public void setClient(Socket client) {
        this.client = client;
    }

    public BufferedReader getIn() {
        return in;
    }

    public void setIn(BufferedReader in) {
        this.in = in;
    }

    public PrintWriter getOut() {
        return out;
    }

    public void setOut(PrintWriter out) {
        this.out = out;
    }
}
