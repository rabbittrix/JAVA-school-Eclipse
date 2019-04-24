package br.com.xti.poo;

public class CarroTest {

	public static void main(String[] args) {
		
		Carro ferrari = new Carro();
		ferrari.modelo = "Ferrari Enzo";
		ferrari.velocidadeMaxima = 349;
		ferrari.segundosZeroACem = 3.2;
		Motor v12 = new Motor();
		v12.tipo = "v12";
		v12.potencia = 660;
		ferrari.motor = v12; // adiciona o motor ao carro
		
		Carro k = new Carro("koenigsegg CCXR ", 430, 3.1, v12);
		Motor v8 = new Motor("v8", 1018);
		k.motor = v8;
		
		System.out.println(k.modelo + k.velocidadeMaxima + k.segundosZeroACem);
		System.out.println(k.motor.potencia);

	}

}
