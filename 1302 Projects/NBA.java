import java.util.*;
import java.lang.Math;

public class NBA{
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		String ifAddPlayer;
		String playerName;
		System.out.println("Creat the NBA team of Heats ...... ");
		NBATeam heat = new NBATeam ("Heat");
		System.out.println("Add a play to Heat? (Yes/No) "); //Asks user to add play to heat
		ifAddPlayer = input.next();
		while(ifAddPlayer.equalsIgnoreCase("Yes")) { //Asks user a series of questions if a play is added
			System.out.println("What is the name to be added?"); //Prompts user to enter a name
			playerName = input.next();
			heat.addPlayer(playerName);
			System.out.println("Add one more play to Heat? (Yes/No) "); //Asks user if they want to add another play
			ifAddPlayer = input.next();
		}
		System.out.println("Creat the NBA team of Spurs ...... ");
		NBATeam spurs = new NBATeam ("Spurs");
		System.out.println("Add a play to Spurs? (Yes/No) "); //Asks user to add play to spurs
		ifAddPlayer = input.next();
		while(ifAddPlayer.equalsIgnoreCase("Yes")) { //Asks user a series of questions if a play is added
			System.out.println("What is the name to be added?"); //Prompts user to enter a name
			playerName = input.next();
			spurs.addPlayer(playerName);
			System.out.println("Add one more play to Spurs? (Yes/No) "); //Asks user if they want to add another play 
			ifAddPlayer = input.next();
		}
		
		for(int i = 0; i <= 7; i++) { //Runs for 7 or less games
            if(Math.random() < 0.5){ //Generates random number and assigns a win to either team
                spurs.setWin(1);
                heat.setLoss(1);
            }
            else {
            	 heat.setWin(1);
                 spurs.setLoss(1);
            }
        }
		
		if(spurs.getWin() < heat.getWin()) //Determines which team won the series
			System.out.println(spurs.getSTeamName() + "***Wins the series!***"); 
		else 
			System.out.println(heat.getSTeamName() + "***Wins the series!***");
		
		//Prints out the name of the player and their wins and losses 
		System.out.println(heat.getSTeamName() + heat.getPlayerName() + "number of wins: [" + heat.getWin() + "] number of losses: " + heat.getLoss());
		System.out.println(spurs.getSTeamName() + spurs.getPlayerName() + "number of wins: [" + spurs.getWin() + "] number of losses: " + spurs.getLoss());
}
}