package com.greatlearning.lab2.question2;

public class NotesCount {

	public void noteCounterImplementation(int notes[], int amount) {
		int[] notecounter = new int[notes.length];
		try {

			for (int i = 0; i < notes.length; i++) {
				if (amount >= notes[i]) {

					notecounter[i] = amount / notes[i];
					amount = amount - notecounter[i] * notes[i];

				}
			}
			if (amount > 0) {
				System.out.println("\nExact amount can't be paid in highest denomination");
			} else {
				System.out.println("\nYour payment approach in order to give minimim number of notes will be: ");
				for (int i = 0; i < notes.length; i++) {
					if (notecounter[i] != 0) {
						System.out.println(notes[i] + " : " + notecounter[i]);
					}
				}
			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e + "Notes of denomination 0 are invalid");

		}

	}

}
