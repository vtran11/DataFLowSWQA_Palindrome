/*
 Group 1 - Assignment 4
 Name: Vy Tran, Zuodong Zhou
 A simple program to determine if a given phrase is a palindrome or not. 
 The program should also determine the length of the phrase.
 */
import java.util.*;

public class Palindrome{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String test;
		do {
			System.out.print("Enter your phase here: ");
			String inputString = scanner.nextLine(); //scan the input string
			
			//Return the length of the given phase
			System.out.println("Length of the phase: " + inputString.length());
			
			String newString = "";
			//Remove space and punctuation in the input and convert it to lower case
			for(int n=0; n < inputString.length(); n++) {
				if(Character.isLetter(inputString.charAt(n))) {
					newString += inputString.toLowerCase().charAt(n);
				}
			}
					
			//Reverse the new input string (lower case, no space and punctuation)
			String reverseString ="";
			for(int i = newString.length() -1; i>=0; i-- ) {
				reverseString = reverseString + newString.charAt(i);
			}
			System.out.println("The Reversed Phase of '" + newString + "' is '" + reverseString +"'");

			//Compare if the new input string is the same as the reverse string
			if(newString.equals(reverseString))
				System.out.println("The phase '" + inputString + "' is Palindrome!");			
			else
				System.out.println("The phase '" + inputString + "' is NOT Palindrome!");
			
			//if user wants to test new input for Palindrome
			System.out.print("Enter Y/Yes if you want to continue?");
			test = scanner.nextLine();
		}while (test.toLowerCase().equals("y")||test.toLowerCase().equals("yes"));
	}	
}
