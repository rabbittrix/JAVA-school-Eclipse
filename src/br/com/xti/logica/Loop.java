package br.com.xti.logica;
/**
* Loop for e for each, while e do while
* @author Roberto de Souza
*/
import java.util.ArrayList;
import java.util.Scanner;

public class Loop{
	public static void main(String[] args){
		
		int tamanho = 12;
		for(int x = 0; x < tamanho; x++){
			for (int i = 0; i < tamanho; i++){
				System.out.print("* ");
			}
			System.out.println();
		}
		
		//Estrutura foreach
		int[] pares = {2,4,6,8,10};
		for(int i=0; i<pares.length; i++){
			int par = pares[i];
			System.out.print(par + ", ");
			
		}
		System.out.println();
		
		//Estrutura resumida
		for(int par : pares){
			System.out.print(par + ", ");
		}
		System.out.println();
		
		//preenchendo o Array com o for
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < 15; i++){
			list.add(i);
		}
		for (Integer numero : list){
			System.out.print(numero + ", ");
		}
		System.out.println();
		
		//While
		ArrayList<String> produtos =  new ArrayList<>();
		Scanner s = new Scanner(System.in);
		System.out.println("Liste seus produtos : Para sair digite FIM");
		
		String produto;
		while(!"FIM".equals(produto = s.nextLine())){
			produtos.add(produto);
		}
		System.out.println(produtos.toString());
	}
	
}