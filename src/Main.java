import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class Main {
    public static void main(String[] args) {

        Socket client = null;
        int portnumber = 1234;
        if (args.length >= 1) {

            portnumber = Integer.parseInt(args[0]);
        }

        for (int i = 0; i < 10; i++) {
            try {
                String msg = "";

                client = new Socket(InetAddress.getLocalHost(), portnumber);
                System.out.println("Client socket is created " + client);

                OutputStream clientOut = client.getOutputStream();
                PrintWriter pw = new PrintWriter(clientOut, true);
                

            } catch (Exception e) {
                System.out.println("I/O error " + e);
            }

        }

    }
}