package com.zoho.javaprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindTheLeaderNumbers {

	public static void main(String[] args) {
		FindTheLeaderNumbers findTheLeaderNumbers = new FindTheLeaderNumbers();
		System.out.println(findTheLeaderNumbers.checkTheNumberWhichIsLeader().toString());
		
	}

	private List<Integer> checkTheNumberWhichIsLeader() {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the arraySize");
		int arraySize = reader.nextInt();
		
		Integer array[] = new Integer[arraySize];
		
		
		
		System.out.println("Enter arrayValus");
		for(int index =0;index<arraySize;index++)
		{
			array[index] = reader.nextInt();
		}
		List<Integer>leaderNumbers = new ArrayList<Integer>();
		for(int index =1;index<arraySize;index++)
		{
			if(array[index-1]< array[index])
			{
				leaderNumbers.add(array[index]);
			}
		}
		leaderNumbers.add(array[arraySize-1]);
		return leaderNumbers;
		
	}

}
