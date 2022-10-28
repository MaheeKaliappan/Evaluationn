package com.zoho.javaprograms;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Anagram {

	public static void main(String[] args) {
		Anagram anagram = new Anagram();
		System.out.println(anagram.findTheNumberOfPairs());

	}

	private int findTheNumberOfPairs() {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter The String");
		String  anagramString = reader.next();
		//Stack<Character> anagram = new Stack<Character>();
		char anagramChar[] = anagramString.toCharArray();
		for(int index = 0;index<anagramString.length();index++)
		{
			for(int innerIndex =0;innerIndex<anagramString.length();innerIndex++)
			{
				if((anagramChar[index]== anagramChar[innerIndex]) && (anagramChar[index]!= ' ') && (innerIndex != index))
				{
					anagramChar[index]= ' ';
					anagramChar[innerIndex] =' ';
					break;
				}
			}
		}
		
		for(int index = 0;index<anagramString.length();index++)
		{
			if(anagramChar[index] != ' ')
			{
				return 0;
			}
			
		}
		return anagramString.length();
		
	}

}
