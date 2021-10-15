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

public class _3_filter {
	
	public static void main(String[] args) {
		
		List<String> orginalList = new ArrayList<String>();
		orginalList.add("malatya");
		orginalList.add("malatya");
		orginalList.add("malatya");
		orginalList.add("nev�ehir");
		orginalList.add("malatya");
		orginalList.add("bitlis");
		for (int i = 0; i < orginalList.size(); i++) {
			System.out.println(orginalList.get(i));
		}
		
		System.out.println();
		String search = "malatya";
		// listenin i�indeki ge�en malatyalar� g�sterin
		List<String> listem = orginalList.stream().filter((temp) -> "malatya".equals(temp))
				.collect(Collectors.toList());
		listem.forEach(System.out::println);
		System.out.println(listem.size() + " tane eleman var");
		System.out.println("");
		
		// listenin i�indeki ge�en malatyalar� olmas�n
		List<String> listem2 = orginalList.stream().filter((Ali) -> "malatya".equals(Ali)).collect(Collectors.toList());
		listem2.forEach(System.out::println);
		System.out.println(+listem2.size() + " tane eleman var");
		
	}
	
}
