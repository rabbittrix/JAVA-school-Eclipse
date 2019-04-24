package br.com.xti.logica;
/** 
 * @author Robero de Souza
 * ArrayList
 * Cartas de baralho
 */
 import java.util.ArrayList;
 
 public class ArraysLista {
	 public static void main(String[] args){
		 
		 ArrayList<String> nipes = new ArrayList<>();
		 
		 nipes.add("Espadas");
		 nipes.add("Paus");
		 nipes.add(0, "Copas"); // força a mudança de posição para zero
		 nipes.add("Ouros");
		 nipes.add("Preto");
		 		 
		 System.out.println(nipes.toString()); // mostra tudo dentro do Array
		 System.out.println("Tamanho = " + nipes.size()); // Mostra o tamanho do Array
		 System.out.println("Valor do Indice = " + nipes.get(3)); // Recupera o valor no indice 2
		 System.out.println("Indice do Paus = " + nipes.indexOf("Paus")); // Retorna o Index do valor indicado
		 nipes.remove("Preto"); // Remove a cor preto
		 System.out.println(nipes.toString());
		 //nipes.contains("Preto"); //Verifica se existe o valor indicado no Array
		 System.out.println("Tem cor Preto = " + nipes.contains("Preto"));
		 System.out.println("Tem Espadas = " + nipes.contains("Espadas"));
		 
	 }
 }