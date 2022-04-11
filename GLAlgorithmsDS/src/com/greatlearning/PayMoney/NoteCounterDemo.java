package com.greatlearning.PayMoney;

import java.util.Scanner;

public class NoteCounterDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of currency denominations");
		int sizeOfDenomination = sc.nextInt();
		int[] notes = new int[sizeOfDenomination]; ;
		System.out.println("Enter the currency denominations value");
		for(int j =0;j< sizeOfDenomination;j++) {
			notes[j] = sc.nextInt();
		}
		//int[] notes = {100,50,20,10};
		System.out.println("Enter the amount you want to pay");
		int amount = sc.nextInt();
		int [] noteCounter = new int[notes.length];
		
		for(int i=0; i<notes.length;i++) {
			if(amount >= notes[i]) {
				noteCounter[i] = amount / notes[i];
				amount = amount - noteCounter[i] * notes[i];
				
			}
		}
		if(amount > 0) {
			System.out.println("Cannot tender exact change : Balance is "+amount);
			
		}else {
			
			for(int loop = 0; loop< notes.length;loop++) {
			
				if(noteCounter[loop] != 0) {
					System.out.println("Your payment approach in order to give min no of notes will be");
					System.out.println(noteCounter[loop]+":"+notes[loop]);
					System.out.println("Notes:"+notes[loop]+" number"+" "+noteCounter[loop]);	
				}
			}
		}
	}

}
