package com.bilgeadam.a022.collections.stream.examples;

import java.util.Arrays;

// Java 8
// @FunctionalInterface
// Stream()
// Method referances ::
public class WhatISStream {
	// Stream() Ak��t�r
	// kodlar�m�z� daha az yazmak �ok u�ra�mamakt�r
	// IO: InputStream() OuttputStream() ile Stream() kar��t�rmay�n
	
	public static void iterativeArray() {
		String[] dizi = { "Malatya", "Sivas", "Edirne", "Mara�" };
		for (int i = 0; i < dizi.length; i++) {
			System.out.print(dizi[i] + " ");
		}
	}
	
	// Stream ancak collectiondan kulan�yoruz bunun i�in diziyi liste �evirmemiz
	// laz�m
	public static void streamArray() {
		String[] dizi = { "Malatya", "Sivas", "Edirne", "Mara�" };
		Arrays.asList(dizi).stream().forEach(System.out::print);
	}
	
	public static void main(String[] args) {
		System.out.println("�terative For");
		iterativeArray();
		System.out.println("\n********************************");
		System.out.println("Stream For");
		streamArray();
	}
	
}
