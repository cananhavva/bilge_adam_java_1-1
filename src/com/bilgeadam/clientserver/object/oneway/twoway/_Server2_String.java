package com.bilgeadam.clientserver.object.oneway.twoway;

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
public class _Server2_String {
	
	public static void main(String[] args) {
		
		// 65536
		int port = 7777;
		
		// Cliennten gelen String yap�
		String clientValue, smallLetter, bigLetter;
		
		System.out.println("Server haz�r ");
		// veri alacagim
		try (DataInputStream dataInputStream = new DataInputStream(new ServerSocket(port).accept().getInputStream())) {
			clientValue = dataInputStream.readUTF();
			smallLetter = clientValue.toLowerCase();
			bigLetter = clientValue.toUpperCase();
			System.out.println("k���k harf: " + smallLetter);
			System.out.println("b�y�k harf: " + bigLetter);
			System.out.println("length: " + clientValue.length());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
