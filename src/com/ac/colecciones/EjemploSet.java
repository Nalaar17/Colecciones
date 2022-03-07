package com.ac.colecciones;

import java.util.*;

public class EjemploSet {

	public static void main(String[] args) {
		Set<String> days = new HashSet<>();
		days.add("=lunes");
		days.add("1viernes");
		days.add("Martes");
		days.add("Martes"); // No admite elementos duplicados
		days.add("0Jueves");
		days.add("Sábado");
		System.out.println(days);
		Set<String> sortedDays = new TreeSet<>(days);
		System.out.println(sortedDays);
		System.out.println(sortedDays.contains("Martes"));
		for (String day: sortedDays) {
			System.out.println(day);
			System.out.println();
		}
		sortedDays
			.stream()
			.parallel()
			.filter(d->d.length()>6)
			.skip(2)
			.forEach(s->System.out.println(s));
		
	}

}
