package com.bilgeadam.a023.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

// 1.SORU
// public static final String PATH="";
// 1.ad�m static bir path yapal�m de�eri C:\\bilgeadam\\dosya.txt
// 2.ad�m Kullan�c� taraf�ndan Bir�eyler yaz�p olu�turdu�umuz dosya i�isine
// yazal�m
// 3.ad�m dosya i�erisindeki yaz�lar� okuyal�m.
// 4.ad�m dosya i�erisindeki b�t�n a harflerini e yapal�m

// 2.SORU
// 2.ad�m c:s�r�c�s�n� alt�nda kullan�c� taraf�ndan "dizin" ad�ndan File ile
// java taraf�ndan dizin olu�tural�m

// 3.ad�m c:\\dizin alt�na kullan�c� taraf�ndan "bilgeadam.txt" dosya
// olu�tural�m bilgeadam.txt dosyas� olu�tural�m

// Se�enekli bir �ekilde
// 0-��k��
// 1-dosyaCreate
// 2-dizinCreate
// 3-Add(Yazma)
// 4-Read(Okuma)
// 5-Delete(Silmek)
// 6-Dosya �zellikleri
// 6.1 Dosya m�
// bu dizin mi ? dosya m�?
// yaz�labilrinir mi ? okunabilinir mi �al��abilinir mi?

// URL URI ara�t�rmak �devi

public class IOExamples {
	public static void deneme() {
		try {
			String path = "C:\\bilgeadam\\dosya.txt";
			File file = new File(path);
			System.out.println("�al��abilir miyim : " + file.canExecute());
			System.out.println("okuyabilir miyim : " + file.canRead());
			System.out.println("yazabir miyim : " + file.canWrite());
			System.out.println("////////////////////////////");
			System.out.println("dosya gizli mi? " + file.isHidden());
			System.out.println("dizin mi? " + file.isDirectory());
			System.out.println("dosya mi? " + file.isFile()); // dosya.txt
			
			if (file.createNewFile()) {
				System.out.println("Dosya yok ");
			} else {
				System.out.println("Dosya var");
			}
			
			// silmek
			if (file.exists()) {
				file.delete();
				System.out.println("Dosya Silindi");
			} else {
				System.out.println("Dosya Silinmedi");
			}
			
			System.out.println("path:" + file.toPath());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	// Dosyaya bir�eyler yazmak
	public static void fileWriterTryWithResources() {
		String adi = FilePath.FILE_PATH;
		
		try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(FilePath.FILE_PATH, true))) {
			String value = "";
			Scanner klavye = new Scanner(System.in);
			System.out.println("L�tfen bir�eyler yaz�n�z");
			bufferedWriter.write(klavye.nextLine());
			bufferedWriter.flush();
			System.out.println("Yaz�ld�");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void fileWriterTryWithResourcesManuel(String str) {
		String adi = FilePath.FILE_PATH;
		try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(FilePath.FILE_PATH, true))) {
			String value = "";
			bufferedWriter.write(str);
			bufferedWriter.flush();
			System.out.println("Yaz�ld�");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static String fileReaderTryWithResources() {
		String satir = "", toplamOkunanSatir = "";
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(FilePath.FILE_PATH))) {
			while ((satir = bufferedReader.readLine()) != null) {
				toplamOkunanSatir += satir + " \n";
			}
			System.out.println(toplamOkunanSatir);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return toplamOkunanSatir;
	}
	
	public static String changeLetter(String value) {
		String newValue = "";
		for (int i = 0; i < value.length(); i++) {
			if (value.charAt(i) == 'a' || value.charAt(i) == 'A') {
				newValue = value.replace("a", "e").replace("A", "e");
			}
		}
		System.out.println("ilk hali: " + value);
		System.out.println("de�i�mi� hali: " + newValue);
		
		return newValue;
	}
	
	public static void main(String[] args) {
		// fileWriterTryWithResources();
		// fileReaderTryWithResources();
		// String str = fileReaderTryWithResources();
		// changeLetter(str);
		// fileWriterTryWithResourcesManuel(changeLetter(str));
		
		deneme();
	}
	
}
