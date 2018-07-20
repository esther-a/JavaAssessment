package assessmentMain;

public class River {
	
		//Attributes//
		private String riverColour;
		private String riverName;
		
		
		///Constructors///
		public River(String riverColour, String riverName) 
		{
		this.riverColour = riverColour;
		this.riverName = riverName;
		}
		
	

		///Methods////
		public void setRiverColour (String riverColour) 
		{
			this.riverColour = riverColour;
		}
		
		public String getRiverColour () 
		{
			return this.riverColour;
		}
		
		
		public void setRiverName (String riverName) 
		{
			this.riverName = riverName;
		}
		
		public String getRiverName () 
		{
			return this.riverName;				
		}
}

/* this class was for creating river objects that would be found in a river array and be called upon in the swamp class.*/