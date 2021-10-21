package com.bilgeadam.clientserver2;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.util.Base64;
import java.util.Base64.Decoder;

public class _Server3_DecoderEncoder {
	
	// �ifre ��z�c�
	public static String decoderSocket(String value) {
		Decoder decoder = Base64.getDecoder();
		String explainPassword = new String(decoder.decode(value));
		return explainPassword;
	}
	
	public static void main(String[] args) {
		int port = 7777;
		String clientValue; // Cliennten gelen String yap�
		System.out.println("Server haz�r ");
		// veri alacagim
		try (DataInputStream dataInputStream = new DataInputStream(new ServerSocket(port).accept().getInputStream())) {
			// �ifrelenmi� data geldi
			clientValue = dataInputStream.readUTF();
			String explain = decoderSocket(clientValue);
			System.out.println("�ifreli: " + clientValue + " �ifrelenmi� data ��z�m�: " + explain);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
