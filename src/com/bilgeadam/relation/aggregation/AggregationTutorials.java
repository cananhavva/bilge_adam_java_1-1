package com.bilgeadam.relation.aggregation;

public class AggregationTutorials {
	// �li�ki tek y�nl�yse
	// iki yap� aras�nda:
	// bir bile�en olmazsa ya�ayabilir mi
	// ba��ms�z: ba��ml�
	// anne:
	// �ocuk: x
	// �ocuk anneye ba�l�
	// ba�l�: �ocuk
	// ba��ms�z:anne
	
	// pi*r*r
	
	public static void main(String[] args) {
		Daire daire = new Daire();
		double sonuc = daire.daireAlanHesabi(10);
		System.out.println(sonuc);
	}
}
