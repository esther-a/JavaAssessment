package assessmentTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import assessmentMain.River;

public class riverTest {
	@Test

	public void testRiver ()
	{
		River testR = new River( "grey", "thames");
		assertEquals( "this is the wrong river",  testR.getRiverColour(), "grey");
	}

}

