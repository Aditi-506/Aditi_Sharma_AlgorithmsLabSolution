/**
 * 
 */
package com.greatlearning.lab2.question2;

//Algorithms Problem Statement -  Question 2

import java.util.Scanner;
import java.util.Arrays;

/**
 * @author Admin
 *
 */
public class CurrencyDenominationMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergeSortImplementation mergesortimplementation = new MergeSortImplementation();
		NotesCount notescount = new NotesCount();

		System.out.println("\n Enter the size of currency denominations: ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] notes = new int[size];
		System.out.println("\n Enter the currency denominations value:  ");
		for (int i = 0; i < size; i++) {
			notes[i] = sc.nextInt();
		}

		System.out.println("\n Enter the amount you want to pay: ");
		int amount = sc.nextInt();
		mergesortimplementation.sort(notes, 0, notes.length - 1);
		notescount.noteCounterImplementation(notes, amount);

		sc.close();
	}

}
