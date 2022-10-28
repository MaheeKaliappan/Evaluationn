package com.zoho.javaprograms;

import java.util.Scanner;

public class FindTheOccurence {

	public static void main(String[] args) {
		FindTheOccurence findTheOccurence = new FindTheOccurence();
		findTheOccurence.findTheNumber();

	}

	private void findTheNumber() {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the arraySize");
		int arraySize = reader.nextInt();
		int array[]=new int[arraySize];
		System.out.println("Enter ouccureneceCount");
		int occurence = reader.nextInt();
		System.out.println("Enter arrayValus");
		for(int index =0;index<arraySize;index++)
		{
			array[index] = reader.nextInt();
		}
		
		Integer findingIndex = null;
		Integer findNumber = 0;
		int tempFind =0;
		int count =1;
		
		
		for(int outerIndex = 0;outerIndex<arraySize;outerIndex++)
		{
			
			count=1;
			for (int innerIndex = outerIndex+1; innerIndex < arraySize; innerIndex++) {

				if(array[outerIndex]==array[innerIndex])
				{
					count++;
					tempFind = innerIndex;
					
					
				}
				
			}
			if(count>=occurence)
			{
				if(findingIndex == null)
				{
					findingIndex = tempFind;
					findNumber=array[outerIndex];
				}
				if(findingIndex>tempFind)
				{
					findingIndex = tempFind;
					findNumber=array[outerIndex];
					
				}
				
				
			}

			tempFind = 0;
			
		}
		System.out.println("Number : "+findNumber);
		System.out.println("index  : "+findingIndex);
		
	}

}
