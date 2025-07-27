package com.sortplayersbyscore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
	
	public static void main(String[] args) {
		
		List<Player> players=new ArrayList<Player>();
		
		players.add(new Player("Ramu",38));
		players.add(new Player("Ravi",82));
		players.add(new Player("Anil",95));
		
		
		Collections.sort(players);
		System.out.println(players);
	}

}
