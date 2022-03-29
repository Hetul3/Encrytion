package Encrypt;

import java.util.Scanner;

public class CeasearShift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String plaintext = getText();
		plaintext = clean(plaintext);
		System.out.println("Cleaning up text:");
		System.out.println(plaintext);
		String cipher = encrypt(plaintext);
		System.out.println("\nCeasear Shifted:");
		System.out.println(cipher);
	}

	static String encrypt(String text) {
		// TODO Auto-generated method stub
		String code = "";
		int shift = 3;
		for(int i = 0; i < text.length(); i++) {
			char letter = text.charAt(i);
			if(letter >= '0' && letter <= '9') {
				code += letter;
				continue;
			}
			letter += shift;
			if(letter > 'Z') {
				letter-=26;
			}
			code += letter;
		}
		return code;
	}

	static String clean(String text) {
		String cleanText = "";
		text = text.toUpperCase();
		for(int i = 0; i < text.length(); i++) {
			char letter = text.charAt(i);
			if(letter >= 'A' && letter <= 'Z') {
				cleanText = cleanText + letter;
			}
			if(letter >= '0' && letter <= '9') {
				cleanText = cleanText + letter;
			}
		}
		
		return cleanText;
	}
	
	static String getText() {
		Scanner input = new Scanner(System.in);
		System.out.println("Message to be Encrypted:");
		String text = input.nextLine();	
		return text;
	}
}