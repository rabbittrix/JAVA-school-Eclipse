package br.com.xti.logica;
//final class named Orders that manages a map of Order objects.
//As key should be used a Calendar object with the associated day.
//The class Orders must have two methods:
//void pushOrder( Order order, java.util.Date date) 
//Insertion method of a object Order in the map using as key the date argument.
//Order[] getOrders()
//Returns the array of all the objects in the map in ascending order of the key

/**
 * @author Roberto de Souza
 *
 */

import java.util.*;
import java.util.Map;
import java.util.HashMap;
 
public class Ordens {
 
  public static void main(String[] args) {
	  
	  Map<String,Object[]>mapa = new HashMap<String,Object[]>();
	  String[] semana = {"Segunda", "Terca", "Quarta", "Quinta", "Sexta"};
	  String[] mes = {"Janeiro", "Fevereiro", "Marco", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
	  Object[] calendario = {semana, mes};
	  mapa.put("date", calendario);
	  
	  Object[] recDados = mapa.get("date");
	  for (int i = 0; i < recDados.length; i++){
		  System.out.println(i);
		  //Collections.sort(i);
		  
		  for (String s : (String[])recDados[i])
			  {
                    System.out.println(s); // imprime o item para cada array de strings
                 }
	  }	  
        
  }
 
}