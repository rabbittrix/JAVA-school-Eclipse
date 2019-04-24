package br.com.xti.poo;

public class MatematicaTest {

	public static void main(String[] args) {
		
		Matematica m = new Matematica();
		
		int resultado = m.maior(10, 20);
		System.out.println(resultado);
		
		//double so = m.soma(10, 20);
		//System.out.println(so);
		double total = m.soma(2, 4, 6, 8, 10);
		
		int raiz = m.raiz(276);
		System.out.println(raiz);
		System.out.println(Math.sqrt(276)); 
		System.out.println("Total = " + total);

	}

}
