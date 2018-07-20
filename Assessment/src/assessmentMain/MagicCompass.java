package assessmentMain;

public class MagicCompass {

	///Attributes///
	public String North;
	public String South;
	public String East;
	public String West;
	
	
	
	//Constructors///
	public void Swamp (String North, String South, String East, String West )
	{
		this.North = North;
		this.South = South;
		this.East = East;
		this.West = West;	
	}
	
	
	//Method//
	public void goNorth (String North, String userInput) 
	{
		if(userInput.equals ("North"))
		System.out.println("You have chosen to go North!");	
	}
	
	
	public void goSouth (String South, String userInput) 
	{
		if(userInput.equals ("South"))
		System.out.println("You have chosen to go South!");	
	}
	
	
	public void goEast (String East, String userInput) 
	{
		if(userInput.equals ("East"))
		System.out.println("You have chosen to go East!");	
	}
	
	
	public void goWest (String West, String userInput) 
	{
		if(userInput.equals ("West"))
		System.out.println("You have chosen to go West!");	
	}
	
}

/* this class was for creating a methods for directions that would be called upon in the main method to allocate the location of the player in relation to the other objects in the swamp .*/
