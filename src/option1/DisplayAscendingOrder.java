package option1;

import java.util.Scanner;

import lockerme.LockerMeMenu;

public class DisplayAscendingOrder {
	Scanner sc = new Scanner(System.in); 
	
	int choice;
		
	public void display() {
		//Sub menu - Option 1 
		do {
			System.out.println("\n1. Display file names in Ascending Order");
			System.out.println("2. Go to main Menu");
			
			//Accepting User input
			System.out.print("Enter Choice : ");
			choice = sc.nextInt();
			
			//Performing User Functions
			switch(choice) {
				case 1:
					System.out.println("Add");
					break;
				case 2:
					LockerMeMenu l = new LockerMeMenu();
					l.menu();
					break;
				default:
					System.out.println("Invalid Option. Please enter valid option.");
					break;
			}
			
		}
		while(choice!=2);		
	}
}

