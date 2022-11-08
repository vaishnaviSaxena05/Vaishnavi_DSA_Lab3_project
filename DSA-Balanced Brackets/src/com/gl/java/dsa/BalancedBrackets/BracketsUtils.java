package com.gl.java.dsa.BalancedBrackets;
import java.util.HashSet;
import java.util.Set;

public class BracketsUtils {
static Set<Pair> PairSet = new HashSet<>(); 
static {
	Pair one = new Pair('(', ')');
	Pair two = new Pair('[', ']');
	Pair three = new Pair('{', '}');
	
	
	PairSet.add(one);
	PairSet.add(two);
    PairSet.add(three);
	

}
static Pair getBracketPair(Character closeBracketChar){
	
	for (Pair aBracketPair : PairSet) {
		
		if (aBracketPair.getCloseChar().equals(closeBracketChar)) {
			
			return aBracketPair;
		}
	}
	return null;
}

static Set<Character> getOpenBrackets(){

	Set<Character> results = new HashSet<>();
	
	for (Pair aBracketPair : PairSet) {
		
		results.add(aBracketPair.getOpenChar());
		
	}
	return results;

}

static Set<Character> getCloseBrackets(){

	Set<Character> results = new HashSet<>();
	
	for (Pair aBracketPair : PairSet) {			
		results.add(aBracketPair.getCloseChar());			
	}
	return results;

}


}
