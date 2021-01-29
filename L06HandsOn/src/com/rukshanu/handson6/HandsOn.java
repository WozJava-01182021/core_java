package com.rukshanu.handson6;
import java.io.*;

public class HandsOn {

	public static void main(String[] args) {

		// Given array
		String songs[] = {"Rock With You", "Smooth Criminal", "Wanna Be Startin' Something", "Thriller", "Beat It"};
		
		// Step 1 create a string composed of the text in array, separate with a comma.
		// Create a StringBuilder
		
	    StringBuilder sb = new StringBuilder();
	    
	    // Loop through array to create string
	    
	    for(int i = 0; i < songs.length; i++){
	    	
	        // Append songs to the string
	    	
	        sb.append(songs[i]);
	        
	        // Add a comma and space in between
	        // ((optionally/commented out) if not last element)
	     // if (i != songs.length - 1) {
	          sb.append(", ");
	     // }
	    }
	    //print string
	    System.out.println(sb);

	    // Take the previously built StringBuilder object and write the data inside of a file called songs.txt.
	    BufferedReader reader;
	    FileWriter writer;
	    String fileText = "";

	    // Add exception handling to the code to prevent errors from crashing the application.
	    try{
	    	// Create/open the file "songs.txt"
	    	writer = new FileWriter("songs.txt");
	    	
	    	// write the StringBuilder string inside of the file
	    	writer.write(sb.toString());
	    	
	    	// Close file
	    	writer.close();
	    	// Step 3 Verify that the StringBuilder object has been saved properly into the songs.txt
	    	// reading the contents
	    	reader = new BufferedReader(new FileReader("songs.txt"));
	    	String line;
	    	while ((line = reader.readLine()) != null) {
	    		fileText = fileText + line;
	    	}
	    	// Close the file
	    	reader.close();
	    }
	    // Errors should print the stack trace along with the message "Error when writing songs.txt."
	    catch(Exception e){
	    	System.out.println("Error when writing songs.txt.");
	    	e.printStackTrace();
	    }
	    finally{
	    	// Printing it to the console.
	    	System.out.println(fileText);
	    }
	}

}
