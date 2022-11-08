package com.gl.java.dsa.BalancedBrackets;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class BalancedBracketsChecker {

	private String brackets;

	private Set<Character> openBracketsSet;
	private Set<Character> closedBracketsSet;

	private Stack<Character> BracketsStack;
	public BalancedBracketsChecker(String brackets) {
		this.brackets = brackets;
		closedBracketsSet = new HashSet<>();
		BracketsStack = new Stack<>();
	}
	public boolean check() {

		if (brackets.length()==0) {
			return false;
		}
		if (brackets.length() %2 !=0) {
			return false;
		}
		openBracketsSet = BracketsUtils.getOpenBrackets();
		closedBracketsSet = BracketsUtils.getCloseBrackets();
		for(int index =0; index<brackets.length(); index++) {
			char acharacter = brackets.charAt(index);

			if(openBracketsSet.contains(acharacter)) {
				BracketsStack.push(acharacter);
			}else if (closedBracketsSet.contains(acharacter)) {
				Pair bracketPairObj 
				= BracketsUtils.getBracketPair(acharacter);

				Character openBracketCharFromStack = BracketsStack.pop();
				if (bracketPairObj.getOpenChar().equals(openBracketCharFromStack)) {

				}else {
					return false;
				}
			}else {
				System.out.println("Invalid character -" + acharacter);
			}
		}
		boolean successCondition = BracketsStack.isEmpty();
		if (successCondition) {
			return true;
		}else {
			return false;
		}
	}
}
