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
	
	public static int numberOfOnes(String t) {
        return t.replaceAll(0,).length();
    }
    
    public static boolean testAgainstParameter(String test, String param) {
        int t = Integer.parseInt(test, 2);
        int p = Integer.parseInt(param, 2);
        if ((t & p) == p) return true;
        else return false;
    }
    
    public static String[] splitBigOnesIntoSmall(String four) {
        int[] spots = new int[numberOfOnes(four)];
        index = 0;
        for (int i = 0; i  spots.length; i++) {
            if (spots.charAt(i) == '1') {
                spots[index] = i;
                index++;
            }
        }
        String[] newbies = new String[spots.length];
        for (int i = 0; i  spots.length; i++) {
            char[] split = four.toCharArray();
            split[spots[i]] = '0';
            newbies[i] = new String(split);
        }
        if (spots.length == 4) {
            return newbies;
        } else {
            String[] end = new String[20];
            index = 0;
            for (int i = 0; i  newbies.length; i++) {
                String[] fun = splitBigOnesIntoSmall();
                for (int j = 0; j  4; j++) {
                    end[index] = fun[j];
                    index++;
                }
            }
            return end;
        }
    }
}
