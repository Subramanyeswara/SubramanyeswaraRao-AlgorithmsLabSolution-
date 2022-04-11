package com.greatlearning.PayMoney;
import java.util.Scanner;


public class PaymentProcessor {

	private static int noofTargets(int [] transactions , int target) {
		
		
		int accumulator = 0;
		for(int i = 0;i < transactions.length;i++) {
			
			accumulator = accumulator + transactions[i];
			if(accumulator >= target) {
				
				
				return (i+1);
			}
		}
		return -1;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of transaction array");
		int size = sc.nextInt();
		
		int[] transactions = new int[size];
		System.out.println("Enter the values of array:");
		for(int j =0;j<transactions.length;j++) {
			System.out.println("Enter element at position: "+j);
			transactions[j] = sc.nextInt();
		}
		System.out.println("Enter the total no of targets that needs to be achieved");
		int noOfTargets = sc.nextInt();
		for(int k =1;k<=noOfTargets;k++) {
			System.out.println("Enter the value of target ");
			int target = sc.nextInt();
			int iterations = noofTargets(transactions, target);
			if(iterations != -1) {
				System.out.println("Target "+target+" achieved after "+iterations+" Iterations");
				}
			else {
				System.out.println("Target "+target+" not achieved");
				}
		}
		
		sc.close();
		
		
		
	}
}
