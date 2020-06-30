package lockerme;

import java.util.Scanner;

import option1.DisplayAscendingOrder;
import option2.DisplayDetails;

public class LockerMeMenu {
	Scanner sc = new Scanner(System.in);
	int choice;
	
	public static void main(String[] args) {
		//Welcome Screen displaying Developer Name and Application Details
		System.out.println("---- LockerMe.com ----");
		System.out.println("- Developed By - Company Lockers Pvt. Ltd.");
		
		LockerMeMenu l = new LockerMeMenu();
		l.menu();
	}
	public void menu() {
		//Menu displaying Options 
		do {			
			System.out.println("\nMenu : ");
			System.out.println("1. Display File Names in Ascending Order");
			System.out.println("2. Display Details of User Interface");
			System.out.println("3. Close");
			
			//Accepting User Input
			System.out.print("Enter Choice : ");
			choice = sc.nextInt();
			
			//Performing Functions as per User Input
			switch(choice) {
				case 1:
					DisplayAscendingOrder d = new DisplayAscendingOrder();
					d.display();
					break;
				case 2:
					DisplayDetails d1 = new DisplayDetails();
					d1.dispplayDets();
					break;
				case 3:
					System.out.println("Thank you for using our application!");
					break;
				default:
					System.out.println("Invalid Option. Please enter valid option.");
			}
		}
		while( choice!=3 );


		}
	}


