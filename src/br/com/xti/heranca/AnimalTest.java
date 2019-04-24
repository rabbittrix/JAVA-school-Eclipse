package br.com.xti.heranca;

public class AnimalTest {
	
	//Usando Polimorfismo
	public static void barulho(Animal animal) {
		animal.fazerBarulho();
	}

	public static void main(String[] args) {
		
		Animal generico = new Animal(0, null);
		Cachorro toto = new Cachorro();
		toto.Comida = "Carne";
		toto.dormir();
		
		Galinha carijo = new Galinha();
		carijo.dormir();
		
		toto.fazerBarulho();
		carijo.fazerBarulho();
		generico.fazerBarulho();
		
		System.out.println(toto instanceof Cachorro);
		System.out.println(toto instanceof Animal);
		System.out.println(carijo instanceof Animal);
		System.out.println(toto.equals(carijo));
		System.out.println(toto.getClass());
		
		barulho(toto);
		barulho(carijo);

	}

}
