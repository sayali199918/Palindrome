package com.brigelabz;
import java.util.Scanner;
public class Palindrome
{	
	public static void main(String[] args)
	{
		//scanner class declaration
		Scanner sc = new Scanner(System.in);
		//input from user
		System.out.print("Enter a String : ");				
		String st = sc.next();
		//string function for calculating length of the string
		int len = st.length();
		//string variable to store reversed string 
		String st1 = "";
		for(int i = 0 ; i < len ; i++)
		{
			//string function for getting character at a particular index
			char ch = st.charAt(i);
			st1 = ch + st1;	
		}
		//condition for checking palindrome by using string function
		if(st.equals(st1))
			System.out.print("Palindrome");
		else
			System.out.print("Not Palindrome");
		//closing scanner class(not compulsory, but good practice)
		sc.close();													
	}
}