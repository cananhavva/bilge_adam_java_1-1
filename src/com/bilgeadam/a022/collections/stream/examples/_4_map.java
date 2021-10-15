package com.bilgeadam.a022.collections.stream.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// stream(): ak�s�n basladigi yerdir
// sorted(): s�ralama
// collect(): muhurluyor
// forEach(): Ekrana listeli gostermek
// filter(): verilerden istediklerimi almak kullan�yoruz

// filterde Lmabda expression kullan�yoruz.
// () = parametre
// -> ok y�n�
// {}

// Java 10 var de�i�keni

// map: her bir eleman� teker teker dola�arak i�lem yapar

public class _4_map {
	
	// Student bir class�m olsun datasetlerimiz ekliyelim
	// Verilerin i�eri�inde H ile ba�alayan ka� tane Hamit
	// olan verilerden sadece 3 tanesini bana versin
	public static void main(String[] args) {
		List<Student> listem = new ArrayList<Student>();
		listem.add(new Student("Hamit", "M�zrak"));
		listem.add(new Student("Hamit", "M�zrak"));
		listem.add(new Student("Hamit", "M�zrak"));
		listem.add(new Student("Hamit", "M�zrak"));
		listem.add(new Student("Hamit", "M�zrak"));
		listem.add(new Student("Hamit", "M�zrak"));
		listem.add(new Student("Hamit1", "M�zrak"));
		listem.add(new Student("Hamit2", "M�zrak"));
		listem.add(new Student("Hamit3", "M�zrak"));
		listem.add(new Student("Hamit4", "M�zrak"));
		listem.add(new Student("Hamit5", "M�zrak"));
		listem.add(new Student("Hamit4", "M�zrak"));
		listem.add(new Student("Hamit4", "M�zrak"));
		listem.add(new Student("Hamit4", "M�zrak"));
		
		List<String> listem2 = listem.stream().map(Student::getAdi).filter(tp -> tp.startsWith("Hamit")).limit(55)
				.collect(Collectors.toList());
		listem2.forEach(System.out::println);
		
	}
	
}
