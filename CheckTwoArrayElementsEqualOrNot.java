package com.zoho.javaprograms;

import java.util.Arrays;
import java.util.Scanner;

public class CheckTwoArrayElementsEqualOrNot {

	public static void main(String[] args) {
		CheckTwoArrayElementsEqualOrNot checkTwoArrayElementsEqualOrNot = new CheckTwoArrayElementsEqualOrNot();
		System.out.println(checkTwoArrayElementsEqualOrNot.checkTheArrayElements());
	}

	private String checkTheArrayElements() {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the arraySize");
		int arraySize = reader.nextInt();
		
		Integer firstArray[] = new Integer[arraySize];
		Integer secondArray[]= new Integer[arraySize];
		
		
		System.out.println("Enter first arrayValus");
		for(int index =0;index<arraySize;index++)
		{
			firstArray[index] = reader.nextInt();
		}
		System.out.println("Enter second arrayValus");
		for(int index =0;index<arraySize;index++)
		{
			secondArray[index] = reader.nextInt();
		}
		Arrays.sort(firstArray);
		Arrays.sort(secondArray);
		for(int index =0;index<arraySize;index++)
		{
			if(firstArray[index]!=secondArray[index])
			{
				return "Not Equal";
				
			}
		}
		return "Equal";
		
		
	}

}
