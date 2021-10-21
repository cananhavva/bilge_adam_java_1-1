package com.bilgeadam.clientserver2;

import java.io.DataInputStream;
import java.net.ServerSocket;

// server: hizmet veren clienttan gelen istekleri yerine getiren

// da��t�k sistemde: a� �zerinden �al��may� sa�l�yor.

// client:veri gonderecegim
// DataOutputStream dataOutputStream = new DataOutputStream(new
// Socket(ipAddress, port).getOutputStream())

// server
// DataInputStream dataInputStream = new DataInputStream(new
// ServerSocket(port).accept().getInputStream())

// �nemli not: once serveri �al��t�r�n sonras�nda client
public class _Server_Sayi {
	
	public static void main(String[] args) {
		
		// 65536
		int port = 7777;
		
		// Cliennten gelen String yap�
		String clientValue;
		
		// String bir yap�y� tam say�ya �evirmek "25" Math.sqrt(25)
		int stringToInteger;
		
		System.out.println("Server haz�r ");
		// veri alacagim
		try (DataInputStream dataInputStream = new DataInputStream(new ServerSocket(port).accept().getInputStream())) {
			clientValue = dataInputStream.readUTF();
			// toUpperCase length
			// String'ten int'e �evirsin
			stringToInteger = Integer.valueOf(clientValue);
			System.out.println(stringToInteger + " say�s�n�n Karek�k�: " + Math.sqrt(stringToInteger));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
