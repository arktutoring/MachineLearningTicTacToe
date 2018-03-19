package main;

import java.util.HashSet;
import java.util.Set;

public class TrainMachine {
	private final Machine machine;

	public TrainMachine(Machine m) {
		this.machine = m;
	}
	
	public void generateFinalPatterns() {
		
	}

	public void generatePotentialPatterns() {
		// TODO: Have this method do all of the comparisons, requires that the
		// method "getOverlappingPatterns" is coded.
	}

	public Set<Integer> getOverlappingPatterns(int prior, int after) {
		// TODO: Have this method get set of potential patterns based on the two
		// numbers
		return new HashSet<Integer>();
	}
}
