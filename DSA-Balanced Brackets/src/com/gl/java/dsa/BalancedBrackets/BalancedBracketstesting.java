package com.gl.java.dsa.BalancedBrackets;

public class BalancedBracketstesting {
	public static void main(String[] args) {
		
	
		test("([[{}]])");
		
		test("([[{}]]))");

		}

static void test(String brackets) {
		
		BalancedBracketsChecker checker = new BalancedBracketsChecker(
			brackets);
		
		boolean result = checker.check();
		if (result) {
			System.out.println("Bracket expression " + brackets + " The entered String has Balanced Brackets");
		}else {
			System.out.println("Bracket expression " + brackets + " The entered Strings do not contain Balanced Brackets");			
		}		
	}
}
