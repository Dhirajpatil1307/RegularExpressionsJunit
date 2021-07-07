package com.bridglabz.regular_expressions.s;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationUsingJunit {
	Scanner SC = new Scanner(System.in);

	boolean FirstEntity() {
		String i;
		System.out.println("Enter Your First Name :-");
		i = SC.next();
		Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2}$");// Regex sintax
		Matcher matcher = pattern.matcher(i);// Regex sintax

		boolean matchFound = matcher.matches();// Use for identification of correct or incorrect.
		if (matchFound) {
			System.out.println("According To Pattern Matcher is Correct");
		} else {
			System.out.println("According To Pattern Matcher is Inorrect");
		}
		return matchFound;
	}
}