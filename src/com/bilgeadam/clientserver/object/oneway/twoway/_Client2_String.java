package com.bilgeadam.clientserver.object.oneway.twoway;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

import javax.swing.JOptionPane;

// client demek istemde bulunan demektir.
// request: istek
public class _Client2_String {
	
	// main
	public static void main(String[] args) {
		Scanner klavye = null;
		String nameSurname;
		
		// DNS IP
		// localhost ==> 127.0.0.1
		String ipAddress = "localhost";
		
		// 65536
		int port = 7777;
		
		// veri g�nderce�im.
		try (DataOutputStream dataOutputStream = new DataOutputStream(new Socket(ipAddress, port).getOutputStream())) {
			// klavye = new Scanner(System.in);
			// System.out.println("L�tfen bir say� giriniz");
			// number = klavye.nextLine();
			nameSurname = JOptionPane.showInputDialog("L�tfen ad�n�z� soyad�n�z giriniz");
			dataOutputStream.writeUTF(nameSurname);
		} catch (IOException io) {
			System.out.println("Hata meydana geldi");
			io.printStackTrace();
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
}
