package assessmentMain;

public class Tree 
{

	//Attributes//
	private int size;
	private String colour;
	private String treeName;
	
	
	///Constructors///
	public Tree(int size, String colour, String treeName) 
	{
	this.size = size;
	this.colour = colour;
	this.treeName = treeName;
	}
	


	///Methods///
	public void setSize(int size) 
	{
		this.size = size;
	}
	
	public int getSize() 
	{
		return this.size;
	}
	
	
	public void setColour (String colour) 
	{
		this.colour = colour;
	}
	
	public String getColour () 
	{
		return this.colour;
	}
	
	
	public void setTreeName (String treeName) 
	{
		this.treeName = treeName;
	}
	
	public String getTreeName () 
	{
		return this.treeName;
	}

	
}

/* this class was for creating tree objects that would be found in a tree array and be called upon in the swamp class.*/
