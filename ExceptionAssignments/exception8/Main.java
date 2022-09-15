package com.yash.exception8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void printStrongPass(String pass) throws PasswordFormatException {
		int n = pass.length();
		boolean hasLower = false, hasUpper = false, hasDigit = false, specialChar = false;

		Set<Character> set = new HashSet<Character>(Arrays.asList('!', '@', '#', '$', '%', '^', '&', '*'));

		for (char i : pass.toCharArray()) {
			if (Character.isLowerCase(i)) {
				hasLower = true;
			}
			if (Character.isUpperCase(i)) {
				hasUpper = true;
			}
			if (Character.isDigit(i)) {
				hasDigit = true;
			}
			if (set.contains(i)) {
				specialChar = true;
			}
		}
		System.out.println("Strength of password:-");
		if (hasLower && hasUpper && hasDigit && specialChar && (n > 8)
				|| hasLower && hasUpper && hasDigit && specialChar && (n > 8)) {
			System.out.println("Your password is Strong");
		} else {
			throw new PasswordFormatException("Your password is weak");
		}

	}

	public static void main(String[] args) throws PasswordFormatException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter password: ");
		String userPass = sc.nextLine();
		printStrongPass(userPass);
	}

}
