package com.cg.healthify.main;

import java.util.Scanner;

import com.cg.healthify.services.WeightLogServiceImpl;

public class WeightLogMenu {
	Scanner sc = new Scanner(System.in);
	String ContChoice;
	WeightLogServiceImpl weight = new WeightLogServiceImpl();

	void menu() {
		System.out.println("1. ADD WEIGHT LOG");
		System.out.println("2. UPDATE WEIGHT LOG");
		System.out.println("3. DELETE WEIGHT LOG");
		System.out.println("4. FIND WEIGHT LOG");
		System.out.println("5. EXIT");
	}

	public void weightLogMenu() {
		// menu();
		do {
			System.out.println("Enter the Choice: ");
			menu();
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				weight.addWeightLog();
				break;
			case 2:
				weight.UpdateWeightLog();
				break;
			case 3:
				weight.DeleteWeightLog();
				break;
			case 4:
				weight.findWeightLog();
				break;
			case 5:
				System.exit(0);
			}
			System.out.println("Wants to continue weightLog operation.");
			ContChoice = sc.next();
		} while (ContChoice.equalsIgnoreCase("Y"));
	}
}
