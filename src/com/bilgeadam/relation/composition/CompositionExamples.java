package com.bilgeadam.relation.composition;

import java.util.ArrayList;

public class CompositionExamples {
	/*
	 * 2 objede birbirine k�r� k�r�ne ba�l�
	 * biri olmadan di�er ya�ayam�yor.
	 */
	
	// 1 avm n d�kkan
	// Avm
	// D�kkan
	
	// kitap yazar
	
	public static void main(String[] args) {
		// 1
		Avm avm = new Avm("avm adi", "Nev�ehir");
		avm.setDukkanList(new ArrayList<Dukkan>());
		System.out.println(avm);
		System.out.println("*************************************************************************************");
		
		// N
		Dukkan dukkan = new Dukkan("elektronik d�kkan", "Beyaz e�ya");
		dukkan.setAvm(avm);
		dukkan.getAvm().getDukkanList().add(dukkan);
		
		Dukkan dukkan2 = new Dukkan("restaurant d�kkan", "�skender");
		dukkan2.setAvm(avm);
		dukkan2.getAvm().getDukkanList().add(dukkan2);
		
		for (Object temp : dukkan.getAvm().dukkanList) {
			System.out.println(temp);
		}
		
		System.out.println("***************************************************************************************");
	}
	
}
