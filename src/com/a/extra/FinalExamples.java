package com.a.extra;

// de�i�ken final : sabitler yani buna yeni de�erler atamay�z
// metot final : @Override
// class final: extends yapamay�z

// POJO
public class FinalExamples {
	
	private String adi;
	
	public String getAdi() {
		return adi;
	}
	
	public void setAdi(String adi) {
		this.adi = adi;
	}
	
	public static void main(String[] args) {
		final int sayi = 55;
		// sayi = 66;
		System.out.println(sayi);
	}
}
