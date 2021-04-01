public class Park{
	public String ParkName;
    public int ParkID;
    public String ParkShape;
    private double ParkLength;
    
    public Park(String ParkName, int ParkID, String ParkShape, double ParkLength){
        this.ParkName = ParkName;
        this.ParkID = ParkID;
        if(ParkShape == "Circle" || ParkShape == "Square") //Checks if ParkShape is a circle or square, other shapes invalid
            this.ParkShape = ParkShape;
        else
        {
            System.out.println("Wrong park shape");
            System.exit(10);
        }
        this.ParkLength = ParkLength;
    }
    
    public String ParkNameGetter() { //Method to get Park name
    	return this.ParkName;
    }
    public int ParkIDGetter(){ //Method to get Park ID
    	return this.ParkID;
    }
    public double ParkLengthGetter() { //Method to get Park length
    	return this.ParkLength;
    }
}