package com.zoho.javaprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LargestSubArray {

	public static void main(String[] args) {
		LargestSubArray largestSubArray = new LargestSubArray();
		largestSubArray.findTheLargestSubArray();

	}

	private void findTheLargestSubArray() {
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the arraySize");
		int arraySize = reader.nextInt();
		
		Integer array[] = new Integer[arraySize];
		
		
		
		System.out.println("Enter arrayValus");
		for(int index =0;index<arraySize;index++)
		{
			array[index] = reader.nextInt();
		}
		
		List<Integer> largestSubArray = new ArrayList<Integer>();
		List<Integer> tempSubArray = new ArrayList<Integer>();
		int sum =0;
		Integer strtIndex =null;
				int endIndex =0;
		for(int index = 0;index<array.length;index++)
		{
			for(int innerIndex = index;innerIndex<arraySize-1;innerIndex++)
			{
				sum = array[innerIndex]+array[innerIndex+1];
				if(sum == 0)
				{ 
					 if(strtIndex == null)
					 {
						 strtIndex =innerIndex;
					 }
					
					tempSubArray.add(array[innerIndex]);
					tempSubArray.add(array[innerIndex+1]);
				}
				else
				{
					if(largestSubArray.size()<tempSubArray.size())
					{
						largestSubArray.addAll(tempSubArray);
						tempSubArray.clear();
					}
				}
				
			}
			
		}
		System.out.println(largestSubArray);
	}

}
