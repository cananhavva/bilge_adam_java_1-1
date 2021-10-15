package com.bilgeadam.a022.collections.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _1_forEach {
	public static void main(String[] args) {
		
		// Diziyi ForEach yaparak veri almak
		// 1.G�sterim
		String[] dizi = { "Malatya", "�stanbul", "Ankara" };
		Arrays.asList(dizi).stream().forEach(System.out::println);
		
		// 2.G�sterim
		List<String> liste1 = Arrays.asList("Malatya", "�stanbul", "Ankara");
		liste1.forEach(System.out::println);
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
		// 3.G�sterim
		List<String> list = new ArrayList<>();
		list.add("malatya");
		list.add("istanbul");
		list.add("ankara");
		list.add("elaz��");
		List<String> list2 = list.stream().sorted().collect(Collectors.toList());
		list2.stream().forEach(System.out::println);
		
	}
}
