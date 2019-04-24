package br.com.xti.logica;
/**
* Constantes
* @author Roberto de Souza
* Modificador final
* Nomeclatura
*
* CLASS WRAPPER
* Double preco = new Double("12.45");
* double d = preco.doubleValue();
* int i = preco.intValue();
* byte b = preco-byteValue();
* Boolean solteiro = new Boolean("true");
*
* CONVERSÃO ESTATICA
* double d1 = Double.parseDouble("123.45");
* int i1 = Interger.parseInt("123");
* float f1 = Float.parseFloat("3.14F");
*
* int i2 = Interger.valueOf("101011", 2);
*/

public class Constantes{
	public static void main(String[] args){
		int populacaoBrasileira = 203429773;
		populacaoBrasileira = 123; // funciona não é constante
		
		final double PI = 3.1415265358979323846; // usa o final constante
		//PI = 123; com isto dá erro, pois é constante
		final char SEXO_MASCULINO = 'M';
		final char SEXO_FEMININO = 'F';
		
		System.out.println(PI);
		System.out.println(populacaoBrasileira);
	}
}