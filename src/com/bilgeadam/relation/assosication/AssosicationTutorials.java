package com.bilgeadam.relation.assosication;

public class AssosicationTutorials {
	// Classlar biribirinden ba��ms�z olmas�
	// aralar�ndaki ba�lant�s� zay�f
	
	// 1 Banka olmazsa insan ya�ar m�
	// 1 �nsan olmazsa banka ya�ar m�
	
	public static void main(String[] args) {
		Bank bank = new Bank("xyz bank", "Ankara");
		Employee employee = new Employee("Ad�m", "Soyad�m");
		
		System.out.println(bank.getBankName() + " adl� bankan�n:  " + employee.getEmployeeName());
	}
	
}
