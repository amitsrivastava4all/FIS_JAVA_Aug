import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		final int PORT = 9001;
		final String SERVER_NAME = "localhost";
		Socket socket  = new Socket(SERVER_NAME,PORT);
		System.out.println("Client Comes...");
		InputStream is = socket.getInputStream();
		int singleByte = is.read();
		while(singleByte!=-1){
			System.out.print((char)singleByte);
			singleByte = is.read();
		}
		is.close();
		socket.close();
	}

}
