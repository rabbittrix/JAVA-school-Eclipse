package br.com.xti.poo;

public enum Medida {
	
	MM("Milimetro"), CM("Centimetro"), M("Metro");
	
	public String titulo;
	
	Medida(String titulo)
	{
		this.titulo = titulo;
	}
}
