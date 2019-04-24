package br.com.xti.poo;

public class Galinha {
	
	public static int ovosDaGranja;// variavel global
	
	public int ovos; //total de ovos do objeto Galinha
	
	public Galinha botar() {
		this.ovos++;
		Galinha.ovosDaGranja++;
		return this;
	}
	
	public static double mediaOvos(int galinhas) {
		return Galinha.ovosDaGranja / galinhas;
		
	}

}
