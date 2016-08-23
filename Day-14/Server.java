import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		final int PORT = 9001;
		ServerSocket server = new ServerSocket(PORT);
		System.out.println("Server Start and Waiting for the Client to Connect...");
		Socket socket = server.accept();
		System.out.println("Enter the Message Send to the Client");
		Scanner scanner =new Scanner(System.in);
		String message = scanner.nextLine();
		OutputStream out = socket.getOutputStream();
		out.write(message.getBytes());
		System.out.println("Data Send it to Client...");
		scanner.close();
		out.close();
		socket.close();
		

	}

}
