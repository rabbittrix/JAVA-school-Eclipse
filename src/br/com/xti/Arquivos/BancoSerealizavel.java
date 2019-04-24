package br.com.xti.Arquivos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import br.com.xti.poo.Conta;

public class BancoSerealizavel {

	public static void main(String[] args) throws Exception {
		Conta conta1 = new Conta("XTI", 555_888_777.44);
		Conta conta2 = new Conta("BRT", 222_666_444.44);
		
		//Escrita de objeto
		FileOutputStream fos = new FileOutputStream("D:/java/Files/Object.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(conta1);
		oos.writeObject(conta2);
		oos.close();
		
		//Leitura de objeto
		FileInputStream fis = new FileInputStream("D:/java/Files/Object.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Conta c1 = (Conta) ois.readObject();
		Conta c2 = (Conta) ois.readObject();
		ois.close();
		
		c1.exibeSaldo();
		c2.exibeSaldo();
	}

}
