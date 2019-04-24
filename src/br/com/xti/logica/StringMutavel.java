package br.com.xti.logica;

public class StringMutavel {

	public static void main(String[] args) {
		StringBuffer s0 = new StringBuffer();
		StringBuilder s1 = new StringBuilder("Java");
		
		s1.toString();
		
		s1.length();
		System.out.println(s1.length());
		
		s1.capacity();		
		System.out.println(s1.capacity());
		
		//s1.reverse();
		System.out.println(s1);
		
		s1.append(" Trabalhando ");
		char[] c = {'c', 'o', 'm'};
		s1.append(c).append(" Texto.");
		System.out.println(s1);

	}

}
