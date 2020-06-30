package lockerme;

import java.util.Scanner;

public class LockerMeMenu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int choice;
		
		do {
			System.out.println("LockerMe.com");
			System.out.println("Menu : ");
			System.out.println("1. Display File Names in Ascending Order");
			System.out.println("1. Display File Names in Ascending Order");
			System.out.println("1. Display File Names in Ascending Order");
			System.out.println("3. Close");
			System.out.println("Enter Choice : ");
			choice = sc.nextInt(); 
		}
		while( choice!=3 );

	}

}
