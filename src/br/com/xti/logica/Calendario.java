package br.com.xti.logica;
// 2. Suggest an alternative to the class Calendar as a map key and explain you opinion
//regarding the previous question and respective solution.
/**

 * Imprimindo a data e Hora do sistema com formatação 
 * e separadas, Pegando a Data e depois a hora.
 * 
 * @author Robero de Souza
 *
 */

import java.text.SimpleDateFormat;

import java.util.Calendar;

public class Calendario{ 

  public static void main(String args[]){ 

    

    Calendar hoje = Calendar.getInstance();

    SimpleDateFormat formataData = new SimpleDateFormat("dd 'de' MMMM 'de' yyyy");

    SimpleDateFormat formataHora = new SimpleDateFormat("hh:mm:ss");


    String dataDeHoje = formataData.format( hoje.getTime() );

    String horaAgora = formataHora.format( hoje.getTime() );

     

     

    System.out.println( dataDeHoje );

    System.out.println( horaAgora );

  } 

} 