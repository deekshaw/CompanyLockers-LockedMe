package option2;

import java.util.Scanner;

import lockerme.LockerMeMenu;
import option1.AddFile;
import option1.DeleteFile;

public class DisplayDetails {
	Scanner sc = new Scanner(System.in); 
	
	int choice;
	
	public void dispplayDets() {
		//Sub menu - Option 1 
		do {			
			System.out.println("\n1. Add file to the existing directory");
			System.out.println("2. Delete a file from the list");
			System.out.println("3. Search for a file");
			System.out.println("4. Go to main Menu");
			
			//Accepting User input
			System.out.print("Enter Choice : ");
			choice = sc.nextInt();
			
			//Performing User Functions
			switch(choice) {
				case 1:
					AddFile a = new AddFile();
					a.addingFile();					
					break;
				case 2:
					DeleteFile d = new DeleteFile();
					d.deletingFile();
					break;
				case 3:
					System.out.println("Search");
					break;
				case 4:
					LockerMeMenu l = new LockerMeMenu();
					l.menu();
					break;
				default:
					System.out.println("Invalid Option. Please enter valid option.");
					break;
			}
			
		}
		while(choice!=4);		
	}
}
