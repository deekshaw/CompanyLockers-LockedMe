package option1;

import java.io.File;
import java.util.Scanner;

public class DeleteFile {
	Scanner sc = new Scanner(System.in);
	
	String fileName;
	
	public void deletingFile() {
		//Accepting name of the file from the user 
		System.out.print("Enter file name : ");
		fileName = sc.next();
		
		//Calling CreateFile function to create the file 
		DeleteFile d = new DeleteFile();
		d.deleteFile(fileName);
	} 
	
	//Deleting file from the Directory
	public void deleteFile(String fileName) {
		File dir = new File ("C:\\Users\\Deeksha\\eclipse-workspace\\CompanyLockers\\CompanyLockersFile");		
		File file = new File(dir, fileName); 
		
		if (file.delete())
			System.out.println("File Deleted : " + file.getName());      
	    else
	    	System.out.println("File not found.");
	}
	}

