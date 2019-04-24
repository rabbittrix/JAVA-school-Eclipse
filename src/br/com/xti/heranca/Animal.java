package br.com.xti.heranca;

public class Animal {
	
	double peso;
	String Comida;
	
	public Animal(double peso, String comida) {
		this.peso = peso;
		this.Comida = comida;
	}
	
	void comer() {
		System.out.println();
	}
	
	void dormir(){
		System.out.println("Dormiu");
	}
	void fazerBarulho() {
		System.out.println("Fazer Barulho");
	}
	
	void movimentar() {
		System.out.println();
	}
}
