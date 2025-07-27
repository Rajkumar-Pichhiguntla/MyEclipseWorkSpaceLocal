package com.sortplayersbyscore;

public class Player implements Comparable<Player> {
	String name;
	int score;
	
	public Player() {
		
	}
	
	public Player(String aName,int aScore) {
		this.name=aName;
		this.score=aScore;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
	
	public void setScore(int score) {
		this.score=score;
	}
	public int getScore() {
		return this.score;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", score=" + score + "]";
	}

	@Override
	public int compareTo(Player player) {
		
//		return Integer.compare(this.score,player.score);
		
		return (this.score==player.score)?0:(this.score>player.score)?-1:1;
	}

	
}
