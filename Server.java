// The skeleton program for Server
import java.net.*;
import java.io.*;

public class Server
{
    //input stream defined
    private Socket mySocket = null;
    private ServerSocket server = null;
    private DataInputStream in = null;

    public Server(int port)
    {
       try {

        server = new ServerSocket(port);
        System.out.println("Server started");
        System.out.println("Waiting for a client to connect....");

        mySocket = server.accept();]
        System.out.println("Client connection accepted");

        in = new DataInputStream(new BufferedinputStream(mySocket.getInputStream()));
        String line = "";

        while(!line.equals("Done"))
        {
            try{
                line = in.readUTF();
                System.out.println(line);
            }
            catch(IOException i)
            {
              System.out.println(i);

            }
        }
      
        mySocket.close();
        in.close();
    }
          
        catch (Exception e)
         {
         System.out.println(i);
       }
    }
}

    public static void main(String args[])
    {
        Server server = new Server(5000);
    }


