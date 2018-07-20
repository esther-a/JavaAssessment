package assessmentMain;

import java.util.Scanner;

public class Main {

public static void main (String [] args) {
	
		
		Scanner sc = new Scanner(System.in);
		String userinput = ("");
		
		System.out.println("Hi there!");
		
		if (userinput.equals ("")); 
		{
			System.out.println ("Welcome to Bareen Moor. Please enter your name!");
			userinput = sc.nextLine();
			System.out.println (userinput + " Let's get started!");  //this sets up the user 
			
		}
		
		System.out.println ("Where would you like to go? 'Try north', 'east', 'west', 'south'");
		userinput = sc.nextLine();
		
		//this ensures that user enters correct string values of north, south, east, and west.///
		while (!userinput.equals("north") && !userinput.equals("east")
					&& !userinput.equals("west") && !userinput.equals("south"))
				{
					System.out.println("Try again");
					userinput = sc.nextLine();
				}
	sc.close();	
	
	}

	

}
