package br.com.xti.Arquivos;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.util.ArrayList;

import br.com.xti.poo.Conta;

public class Banco {
	
//	private Path path = Paths.get("D:/java/Files/contas.txt");
//	private Charset utf8 = StandardCharsets.UTF_8;
	
	public void armazenarContas(ArrayList<Conta> contas) throws Exception {
		try(FileOutputStream fos = new FileOutputStream("D:/java/Files/Contas.ser")){
			try(ObjectOutputStream oos = new ObjectOutputStream(fos)){
				oos.writeObject(contas);
				
			}
		}
//		try (BufferedWriter writer = Files.newBufferedWriter(path, utf8)) { NÃO SERIALIZAVEL
//			for (Conta conta : contas) {
//				writer.write(conta.getCliente() + " = " + conta.getSaldo() + " ; \n");				
//			}
//			
//		} 
	}
	
	public ArrayList<Conta> recuperarContas() throws Exception, ClassNotFoundException{
		try(FileInputStream fis = new FileInputStream("D:/java/Files/Contas.ser")){
			try(ObjectInputStream ois = new ObjectInputStream(fis)){
				return (ArrayList<Conta>) ois.readObject();
			}
		}
//		ArrayList<Conta> contas = new ArrayList<>();
//		try(BufferedReader reader = Files.newBufferedReader(path, utf8)){
//			String line = null;
//			while ((line = reader.readLine()) != null) {
//				String[] token = line.split("=");	
//				Conta conta = new Conta(token[0], Double.parseDouble(token[1]));
//				contas.add(conta);
//			}
//		}
//		return contas;
	}

	public static void main(String[] args) throws Exception {
		ArrayList<Conta> contas = new ArrayList<>();
		contas.add(new Conta("Roberto", 60000.88));
		contas.add(new Conta("Jessica", 40000.22));
		contas.add(new Conta("Eduarda", 45000.03));
		contas.add(new Conta("Virgilio", 65000.08));
		contas.add(new Conta("Roberta", 72000.54));
		
		Banco operacao = new Banco();
		operacao.armazenarContas(contas);
		ArrayList<Conta> contas2 = operacao.recuperarContas();
		for (Conta conta : contas2) {
			conta.exibeSaldo();			
		}
		//Deleta arquivo
		//Files.deleteIfExists(path);
	}

}
