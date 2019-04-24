package redes;

import java.net.Socket;
import java.util.Scanner;

public class Cliente {

	public static void main(String[] args) throws Exception{
		Socket socket = new Socket("127.0.0.1", 5001);
		Scanner s = new Scanner(socket.getInputStream());
		System.out.println(s.nextLine());
		s.close();
		
	}

}
