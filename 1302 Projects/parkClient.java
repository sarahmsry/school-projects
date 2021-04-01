public class parkClient{
	public static void main(String[] args) {
		int ParkID = 49;
		Park parkAr [] = new Park [5]; //Creates parkAr array to store 5 parks
		parkAr[0] = new Park("CSC1302", ParkID, "Circle", 5);
		parkAr[1] = new Park("CSC1302", ParkID+3, "Square", 6);
		parkAr[2] = new Park("Park 3", ParkID+6, "Circle", 7);
		parkAr[3] = new Park("Park 4", ParkID+9, "Square", 8);
		parkAr[4] = new Park("Park 5", ParkID+12, "Circle", 9);
		
		int LPark = 0; //Largest park in the array is stored 
	    for(int i = 0; i < parkAr.length; ++i){ //Finds park with largest length
	        if(parkAr[i].ParkLengthGetter() > parkAr[LPark].ParkLengthGetter()){
	            LPark = i;
	}
}
	    //Displays all information about the largest park
	    Park largestPark = parkAr[LPark];
	    System.out.println("Park Shape: "+largestPark.ParkShape);
        System.out.println("Park Name: "+largestPark.ParkNameGetter());
        System.out.println("Park ID: "+ largestPark.ParkIDGetter());
        System.out.println("Park Length: "+largestPark.ParkLengthGetter());
	}
}
