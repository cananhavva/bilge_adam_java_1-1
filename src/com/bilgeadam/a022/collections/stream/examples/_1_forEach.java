package com.bilgeadam.a022.collections.stream.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// L�STE:LAV:
// LinkedList : Araya yerle�me ve Silme
// ArrayList : Ekleme veya arama
// Vector

// K�ME: SET: HLT Tekrars�z verileri
// HashSet: kar���k verileri ekliyord
// LinkedHashSet:ekledi�imiz s�rada g�r�yoruz
// TreeSet: k���kten b�y�ye

// Map: HHLT
// <K,V>
// HashMap
// LinkedHashMap
// TreeMap
public class _1_forEach {
	public static void main(String[] args) {
		String[] dizi = { "Adana", "Nev�ehir", "�stanbul", "Mu�" };
		// Diziyi Liste �evirdik
		List<String> listem_0 = Arrays.asList(dizi);
		//////////////////////////////////////////////
		List<String> listem = Arrays.asList("Adana", "Nev�ehir", "�stanbul", "Mu�");
		/////////////////////////////////////////////
		List<String> listem2 = new ArrayList<String>();
		listem2.add("Adana");
		listem2.add("Nev�ehir");
		listem2.add("�stanbul");
		listem2.add("Mu�");
		listem2.stream().forEach(System.out::print);
		System.out.println("\n//////////");
		listem2.forEach(System.out::print);
		
	}
}
