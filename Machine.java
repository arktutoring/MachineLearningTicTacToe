package main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Machine {
	
	private Set<Integer> potentialPatterns;
	private ArrayList<Match> wins;
	private ArrayList<Match> ties;
	private ArrayList<Match> losses;

	public Machine() {
		potentialPatterns = new HashSet<Integer>();
		wins = new ArrayList<Match>();
		ties = new ArrayList<Match>();
		losses = new ArrayList<Match>();
	}
	
	public Set<Integer> getPotentialPatterns() {
		return potentialPatterns;
	}
	
	public void addPatterns(Set<Integer> set) {
		potentialPatterns.addAll(set);
	}

}
