package br.com.xti.logica;
/**
* Operadore Matematicos
* @author Roberto de Souza
* Operador Logico - && (E) - || (OU) - ! (NOT)
*/

import java.util.Scanner;

public class Operadores{
	public static void main(String[] args){
		
		String x = "9" + "4";		
		double y = 7 - 4 + 3 * 2;
		double d = 4 % 2; //Imprime o resultadoda divisão
		
		//Operador Ternario
		int idade = 26;
		String s = (idade >= 18) ? "Maior de idade" : "Menor de idade";
		System.out.println(s);
		
		//O usuario entra com valor do raio
		Scanner r = new Scanner(System.in);
		System.out.println("Informe o Raio");
		double raio = r.nextDouble();
		
		//Calcular diametro : 2r
		//double raio = 10; // valor fixo no sistema
		double diametro = 2 * raio; 
		System.out.println("Diametro = " + diametro);
		
		//Circunferencia : 2 PI raio
		double pi = Math.PI;
		double circunferencia = 2 * pi * raio;
		System.out.println("Circuferencia = " + circunferencia);
		
		//Area PI r2
		double area = pi * (raio * raio);
		System.out.println("Area = " + area);
		
		Integer i = 6; //Class Wrapper objeto
		System.out.println(i instanceof Integer); // Metodo Instanceof só compara objetos
	}
}