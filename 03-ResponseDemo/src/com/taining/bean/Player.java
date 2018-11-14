package com.taining.bean;

public class Player {
	int playerId;
	String playerName;
	int noOfMatches;
	int totalRunsScored;
	int noOfWickets;
	boolean captain;
	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public int getNoOfMatches() {
		return noOfMatches;
	}
	public void setNoOfMatches(int noOfMatches) {
		this.noOfMatches = noOfMatches;
	}
	public int getTotalRunsScored() {
		return totalRunsScored;
	}
	public void setTotalRunsScored(int totalRunsScored) {
		this.totalRunsScored = totalRunsScored;
	}
	public int getNoOfWickets() {
		return noOfWickets;
	}
	public void setNoOfWickets(int noOfWickets) {
		this.noOfWickets = noOfWickets;
	}
	public boolean isCaptain() {
		return captain;
	}
	public void setCaptain(boolean captain) {
		this.captain = captain;
	}
	public Player(int playerId, String playerName, int noOfMatches,
			int totalRunsScored, int noOfWickets, boolean captain) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		this.noOfMatches = noOfMatches;
		this.totalRunsScored = totalRunsScored;
		this.noOfWickets = noOfWickets;
		this.captain = captain;
	}
	public Player() {
		super();
	}
	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", playerName=" + playerName
				+ ", noOfMatches=" + noOfMatches + ", totalRunsScored="
				+ totalRunsScored + ", noOfWickets=" + noOfWickets
				+ ", captain=" + captain + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + playerId;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		if (playerId != other.playerId)
			return false;
		return true;
	}
	
	public String getBatingRating()
	{
		double avg=this.totalRunsScored/this.noOfMatches;
		if(avg>90)
		{
		return "BEST";
		}
		else if(avg>70 && avg <90)
		{
			return "GOOD";
		}
		
		else if(avg >=25)
		{
			return "AVERAGE";
		}
		else 
			return "BAD";
			
}
	public String getBowlingRating() {
		double bow=this.noOfWickets/this.getNoOfMatches();
		if(bow > 50)
		{
			return "GOOD";
		}
		else if(bow < 50)
		{
		
			return "AVERAGE";
		}
		return "BAD";
		
	}
	
}