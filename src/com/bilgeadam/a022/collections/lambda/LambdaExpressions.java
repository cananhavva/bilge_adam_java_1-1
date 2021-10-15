package com.bilgeadam.a022.collections.lambda;
// Lombok

// Lambda Expression
// lambda: kodlar yazarken h�zl� kod yazmak i�in kullan�yoruz.
// lambda tek ba��na bir �ey ifade etmez
// lambda interface
// ()->{ System.out.println("Deneme"); }
// list,dizilerde

// Java 8: @FunctionalInterface

public class LambdaExpressions {
	
	// ne zaman bize lambda laz�m olur o zaman kendi lambda yaz�yoruz.
	// sadece 1 tane g�vdesiz metot yazabilirsiniz
	// returnlu,returnsuz
	@FunctionalInterface
	interface IZorunlu44 {
		public int deneme44();
	}
	
	public void deneme() {
		System.out.println("Deneme");
	}
	
	public static void main(String[] args) {
		// anonymous method
		// implement yapmadan interface �a��rd�m
		IZorunlu44 zorunlu44 = new IZorunlu44() {
			@Override
			public int deneme44() {
				System.out.println("Deneme 44");
				return 4;
			}
		};
		zorunlu44.deneme44();
		
		// Lambda ile g�sterimi
		IZorunlu44 zorunlu55 = () -> {
			return 44;
			// System.out.println("Merhabalar ben Lambday�m");
		};
		zorunlu55.deneme44();
	}
	
}
