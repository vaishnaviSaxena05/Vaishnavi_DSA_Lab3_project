package com.java.dsabinarysearchtreepairsum;

public class BinarySearchTreePairFinderTest {
public static void main(String[] args) {
		
		pairFinderTest(130);
		
	}
static void pairFinderTest(int sum) {
				
		
		BinarySearchTree sampleTree 
			= BinarySearchTreeTest.sampleBinaryTree1();
		
		BinarySearchTreeTest test = new BinarySearchTreeTest();
		BinarySearchTree sampleTree2 = test.sampleBinaryTree1();

		BinarySearchTreePairFinder finder =
			new BinarySearchTreePairFinder(sampleTree2);
		
		finder.findPair(sum);
		System.out.println("--------------------------------------");
	}
}
