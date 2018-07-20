package assessmentTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import assessmentMain.Tree;

public class TreeTest {
	
	@Test
	public void testTree () 
	{
		Tree testT = new Tree (2, "black" , "dummy tree");
		assertEquals("this is the wrong tree", testT.getColour(), "black");	
	}

}
