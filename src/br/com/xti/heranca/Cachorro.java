package br.com.xti.heranca;

public class Cachorro extends Animal{
	
	public Cachorro()
	{
		super(30, "Carne");
	}
	
	void fazerBarulho() {
		System.out.println("Au, Au, Au Au");
	}
}
