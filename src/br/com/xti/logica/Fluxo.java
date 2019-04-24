package br.com.xti.logica;
/** 
 * @author Robero de Souza
 * If e else . Condição
 * 
 */
 
 public class Fluxo {
	 public static void main(String[] args){
		 String tecnologia = "java";
		 switch(tecnologia){
			 case "java":
			 case "C#":
			 case "C++":
				System.out.println(" Linguagem de Programacao");
				break;
			 case "SQL":
			 case "MongoDB":
			 case "MySQL":
				System.out.println(" Banco de Dados");
				break;
			 default:
				System.out.println(" Tecnologia Desconhecida");
		 }
		 
		// Condição switch é mais rapido que o if else
		char sexo = 'M';
		 switch(sexo){
			 case 'M' :
				System.out.println(" Masculino");
				break;
			case 'F' :
				System.out.println(" Feminino");
				break;
			default:
				System.out.println(" Outros");
			
		 }
		 
		 // Avalia a nota
		 int nota = 3;
		 if(nota >= 7){
			 System.out.println(" Passou");
		 }else{
			 System.out.println(" Reprovou");
			 if(nota >= 6){
			 System.out.println(" Mais pode fazer a recuperacao");
			} 
		 }
		 
		 //Verifica a idade
		 int idade = 18;
		 if(idade <= 11){
			 System.out.println(" E uma Crianca");
		 }else if(idade > 11 && idade <= 18){
			 System.out.println(" E um Adolecente");
		 }else if(idade > 18 && idade <= 60){
			 System.out.println(" E um Adulto");
		 }else {
			 System.out.println(" E um Idoso");
		 }
		 
		 // Verifica se o numero é Par ou Impar
		 int numero = 11;
		 if((numero % 2)== 0){
			 System.out.println("Par");
		 } else{
			 System.out.println("Impar");
		 }
	 }
	}