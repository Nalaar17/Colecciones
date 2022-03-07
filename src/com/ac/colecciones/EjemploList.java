package com.ac.colecciones;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class EjemploList {

	public static void main(String[] args) {
		var nombre = "String";
		// 1- Podemos crear la lista con una instancia de ArrayList
		// Es recomendable indicar el genérico de nuestra lista
		List<String> list1 = new ArrayList<>(8);
		/*l.add("Text");
		l.add(new Integer(2));
		System.out.println(l);*/
		// Usando tipo inferido:
		list1.add("A"); // 0
		list1.add("B"); // 1
		list1.add("C"); // 2
		list1.add("D"); // 3 - 4
		list1.add("E"); // 4 - 5
		list1.add("F"); // 5 - 6
		list1.add(3,"H"); // 3
		list1.remove(0);
		list1.remove("C");
		//list1.add(4, null);
		//list1.add(6,"Z"); // No me deja incrementar la dimensión de la lista tras eliminarla
		
		// 2- Podemos crear la lista desde el método asList() de la Clase Arrays
		// IMPORTANTE: estas listas nos permiten modificar su contenido, pero no podemos añadir ni eliminar datos
		Integer [] nums = new Integer[] {1,2,3,4,5};
		List<Integer> numsList1 = Arrays.asList(nums);
		List<Integer> numsList2 = Arrays.asList(11,22,31,17,45);
		numsList1.set(0, 10);
		//numsList1.forEach(System.out::print); // Referencia a método
		                                        //for (Integer integer : numsList1) {System.out.println(integer);}
		// numsList1.add(33); No permitido
		// numsList2.remove(15); No permitido
		
		// 3- Podemos crear la lista con métodos de factoria (of, no es un constructor como tal pero los llama para crear instancias, no permite null)
		// IMPORTANTE: las listas son inmutables
		String letra = list1.set(2, "S");
		list1.set(1, "J");
		List<String> list3 = List.copyOf(list1).subList(1, 3);
		List<String> list4 = List.of("N","M","R","S");
		System.out.println(letra);
		list1.forEach(System.out::print);
		System.out.println();
		list3.forEach(System.out::print);
		var sizeList = list1.size();
		System.out.println("\n" + sizeList);
		System.out.println(list1.get(list1.size()-1));
		System.out.println(list1.addAll(list4));
		//System.out.println(list1.addAll(numsList2));
		System.out.println(list1);
		
		int n = numsList2.set(0, numsList2.get(1));
		int n2 = numsList2.get(2);
		int n3 = numsList2.get(0);
		System.out.println(n2-n3);
		System.out.println(n3);
		
		String letra2 = list1.remove(0);
		boolean boo = list1.remove("F");
		//boolean boo2 = list1.remove("Z");
		//boolean boo3 = list1.remove("R");
		//list1.removeAll(list4);
		System.out.println(list1);
		System.out.println(letra2);
		System.out.println(boo);
		//list1.removeAll(list1);
		//System.out.println(list1);
		
		var list2 = new ArrayList<Integer>();
		list2.addAll(numsList1);
		System.out.println(list2);
		//Integer inter = 5;
		//boolean boo4 = list2.remove(new Integer(5));
		//boolean boo4 = list2.remove((Integer)5);
		System.out.println(list2);
		
		
		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		System.out.println();
		for (var el : list1) { // (String el : list1)
			System.out.println(el);
		}	
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		removeIfInt(list2, n); //new EjemploList().
		sc.close();		
	}
	static void removeIfInt(List<Integer> list, int n){
		//AtomicInteger n1 = new AtomicInteger(n);
		//var list2 = list;
		/*for (var el : list2) { 
		//list.remove(Integer.valueOf(n));
			if (el == n) {
				list.remove(Integer.valueOf(n));
			}
			
		}*/
		list.remove(Integer.valueOf(n));
		System.out.println(list);
		
	}
}


