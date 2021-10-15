package com.bilgeadam.a022.collections.stream.examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _2_Sorted {
	public static void main(String[] args) {
		
		// sorted: k���kten b�y��e s�ralama
		// collect: gunun sonuda verileri paketle liste olarak g�ster (Yemegi
		// muhurledim)
		List<String> listem = Arrays.asList("malatya", "nev�ehir", "elaz��", "bitlis").stream().sorted()
				.collect(Collectors.toList());
		
		listem.forEach(System.out::println);
		System.out.println();
		System.out.println();
		Arrays.asList("malatya", "nev�ehir", "elaz��", "bitlis").stream().sorted().collect(Collectors.toList())
				.forEach(System.out::println);
		String[] kelime = { "malatya", "nev�ehir", "elaz��", "bitlis" };
		Arrays.asList(kelime).stream().sorted().collect(Collectors.toList()).forEach(System.out::println);
		
	}
}
