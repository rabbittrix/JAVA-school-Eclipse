package br.com.xti.logica;
/** 
 * @author Robero de Souza
 * Array Multidimenssional
 */
 
 public class ArrayMulti {
	 public static void main (String[] args){
		 // Array de uma dimenssão
		 String[] uma = {"Ricardo", "Sandra", "Beatriz", "Roberto", "Laura", "Juliana"};
		 System.out.println(uma[0]); // acessando o elemento
		 System.out.println(uma.length); // quantos elementos tem
		 
		 // Array de duas dimenssões
		 String[][] duas = {
			 {"Ricardo", "M", "SP"},
			 {"Sandra", "F", "MG"},
			 {"Beatriz", "F", "BA"},
			 {"Roberto", "M", "SP"},
			 {"Laura", "F", "RJ"},
			 {"Juliana", "F", "SC"}
		 };
		 System.out.println(duas[0][0]); // acessando o primeiro elemento
		 System.out.println(duas.length); // quantos elementos tem
		 System.out.println(duas[0].length); // quantos elementos tem dentro do array interno
	 }
 }
 