package redes;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {

	public static void main(String[] args) throws Exception {
		ServerSocket server = new ServerSocket(5001);
		while(true) {
			Socket socket = server.accept();
			try(PrintWriter w = new PrintWriter(socket.getOutputStream())){
				w.println("Server on PORT: " + server);
			}		
			
		}
		
	}

}
