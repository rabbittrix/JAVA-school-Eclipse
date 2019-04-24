package redes;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatCliente extends JFrame{
	
	PrintWriter escritor;
	Socket socket;
	JTextField textoEnviar;
	String name;
	JTextArea textoRecebido;
	Scanner leitor;
	
	private class EscutaServidor implements Runnable{
		@Override
		public void run() {
			try {
				String texto;
				while((texto = leitor.nextLine()) != null) {
					textoRecebido.append(texto + "\n");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}		
			
		}
	}
	
	public ChatCliente(String name) {
		super("Chat " + name);
		this.name = name;
		
		Font fonte = new Font("Serif", Font.PLAIN, 26);
		textoEnviar = new JTextField();
		textoEnviar.setFont(fonte);
		JButton botao = new JButton("Send");
		botao.setFont(fonte);
		botao.addActionListener(new EnviarListener());
		
		Container envio = new JPanel();
		envio.setLayout(new BorderLayout());
		envio.add(BorderLayout.CENTER, textoEnviar);
		envio.add(BorderLayout.EAST, botao);
				
		textoRecebido = new JTextArea();
		textoRecebido.setFont(fonte);
		JScrollPane scroll = new JScrollPane(textoRecebido);
		
		getContentPane().add(BorderLayout.CENTER, scroll);
		getContentPane().add(BorderLayout.SOUTH, envio);
		
		configurarRede();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		setVisible(true);
	}
	
	private class EnviarListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			escritor.println(name + " : " + textoEnviar.getText());
			escritor.flush();
			textoEnviar.setText("");
			textoEnviar.requestFocus();
		}
	}

	private void configurarRede() {
		try {
			socket = new Socket("127.0.0.1", 5002);
			escritor = new PrintWriter(socket.getOutputStream());
			leitor = new Scanner(socket.getInputStream());
			new Thread(new EscutaServidor()).start();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		new ChatCliente("Roberto");
		new ChatCliente("Jessica");

	}

}
