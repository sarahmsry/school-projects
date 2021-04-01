import java.util.ArrayList;

public class NBATeam{
	private String sTeamName; //Variables are called and initialized
	private int nWin = 0;
	private int nLoss = 0;
	
	private ArrayList<String> playerArr = new ArrayList<>(); //Array list for player array
	
	NBATeam(String teamName){
		this.setSTeamName(teamName); //setSTeamName and teamName are equal to each other 
}
	
	public String getPlayerName() {
	    String playerList = "[ ";
	    for(int i=0; i< playerArr.size();i++)
	        playerList = playerList + playerArr.size() + " ";
	        playerList = playerList + "]";
	    return playerList;
}
	
	public void setSTeamName(String s) { //Sets setSTeamName to s
		sTeamName = s;
}

	public String getSTeamName() { //Returns sTeamName
		return sTeamName;
}

	public void setWin(int n) { //Increases win 
		nWin++;
}

	public int getWin() { //Returns win
		return nWin;
}

	public void setLoss(int n) { //Increases loss 
		nLoss++;
}

	public int getLoss() { //Returns loss
		return nLoss;
}

	public void addPlayer(String playerName) { //Displays player name
		System.out.println(playerName);
}
}