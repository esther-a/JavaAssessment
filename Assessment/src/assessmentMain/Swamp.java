package assessmentMain;

import java.util.ArrayList;

public abstract class Swamp {

	///Attributes///
		
	public String player;
    public ArrayList<Tree> treeLocation;
    public ArrayList<River> riverLocation;

    
    ///Constructor///
    
    public Swamp (String player)
    {
    this.player = player;
    this.treeLocation = new  ArrayList<Tree>();
    this.riverLocation = new ArrayList<River>();
    }
    
    
    ///Methods////
    public void setPlayer (String player) 
    {
    	this.player = player;
    }
	
	public String getPlayer ()
	{
		return this.player;
	}
		
	
	public void addTree (Tree newTree)
	{
		this.treeLocation.add(newTree);
	}
	
	public Tree getTree () 
	{
		return this.treeLocation.get(0);
	}

	public void addRiver (River newRiver)
	{
		this.riverLocation.add(newRiver);
	}
	
	public River getRiver () 
	{
		return this.riverLocation.get(0);
	}
	
}
/* this class was created as an abstract class that contains all the classes found in the swamp, the tree, river and magic compass*/
