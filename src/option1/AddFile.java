package option1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class AddFile {
	Scanner sc = new Scanner(System.in);
	
	String fileName;
	
	public void addingFile() {
		//Accepting name of the file from the user 
		System.out.print("Enter file name : ");
		fileName = sc.next();
		
		//Calling CreateFile function to create the file 
		AddFile a = new AddFile();
		a.createFile(fileName);
	}
	
	//Adding the file in the directory 
	public void createFile(String fileName) {
		File dir = new File ("C:\\Users\\Deeksha\\eclipse-workspace\\CompanyLockers\\CompanyLockersFile");
	    try {
	      File file = new File(dir, fileName);
	      
	      if (file.createNewFile()) {
	    	 System.out.println("File Created : " + file.getName());
	      } else {
	    	  System.out.println("File already exists. Please enter another name");
	    	  AddFile a = new AddFile();
	    	  a.addingFile();
	      }
	    } catch (IOException e) {
	    	System.out.println("An error occurred.");
	    	e.printStackTrace();
	    }
	  }
	
}
