package br.com.xti.logica;
/**
* Array Simples
* @author Roberto de Souza
* 
*/

import java.util.Arrays;

public class ArraySimples{
	public static void main(String[] args){
		//Array de Inteiros inicializado
		int[] impares = new int[5];
		impares[0] = 1;
		impares[1] = 3;
		impares[2] = 5;
		impares[3] = 7;
		impares[4] = 9;
		System.out.println(impares.length);
		System.out.println(Arrays.toString(impares)); // apresenta tudo que esta no array
		
		//Array de String
		String[] paises = {"Brasil", "India", "China", "Russia"};		
		paises[0] = "BRASIL"; // Alterando o valor do array na posição 0
		System.out.println(paises[0]);
		
		System.out.println(paises.length); //Le a quantidade de posições doarray
		System.out.println(Arrays.toString(paises));
		
		//pesquisa dentro do array
		int posicao = Arrays.binarySearch(paises, "Russia");
		System.out.println(posicao);
		
		//Ordenar array
		Arrays.sort(paises.length);
		System.out.println(Arrays.toString(paises));
		
		//Acessar um metodo dentro de um objeto array
		Double[] valores = {12.35, 3456.3456};
		System.out.println(valores[0].doubleValue());
	}
}