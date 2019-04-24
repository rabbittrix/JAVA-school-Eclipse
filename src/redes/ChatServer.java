package redes;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChatServer {
	
	List<PrintWriter> escritores = new ArrayList<>();
	
	public ChatServer() {
		ServerSocket server;
		//Scanner leitor;
		try {
			server = new ServerSocket(5002);
			while(true) {
				Socket socket = server.accept();
				new Thread(new EscutaCliente(socket)).start();
				PrintWriter p = new PrintWriter(socket.getOutputStream());
				escritores.add(p);
				//leitor = new Scanner(s.getInputStream());
				//System.out.println(leitor.nextLine());
				
			}
		} catch (IOException e) {			
			e.printStackTrace();
		}
		
	}

	private void encaminharTodos(String texto) {
		for (PrintWriter w : escritores) {
			try {
				w.println(texto);
				w.flush();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	private class EscutaCliente implements Runnable{
		
		Scanner leitor;
		public EscutaCliente(Socket socket) {
			try {
				leitor = new Scanner(socket.getInputStream());
			} catch (IOException e) {				
				e.printStackTrace();
			}
		}

		@Override
		public void run() {
			try {
				String texto;
				while((texto = leitor.nextLine()) != null) {
					System.out.println(texto);
					encaminharTodos(texto);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
		}
		
	}
	public static void main(String[] args) {
		new ChatServer();

	}

}
