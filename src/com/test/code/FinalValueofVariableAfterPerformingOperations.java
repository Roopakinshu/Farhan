package com.test.code;

public class FinalValueofVariableAfterPerformingOperations {
	
	public int finalValueAfterOperations(String[] operations) {
		int x=0;
		for(int i=0; i<operations.length; i++) {
			
			String op = operations[i];
//			System.out.println(op.toLowerCase());
			if(op.toLowerCase().startsWith("-")) {
				
				x=--x;
			}
			else if(op.toLowerCase().startsWith("+")) {
				x=++x;
			}
			else if(op.toLowerCase().endsWith("+"))
			{
				x=x+1;
			} else if(op.toLowerCase().endsWith("-")) {
				x=x-1;
			}
		}
		return x;
	}

	public static void main(String[] args) {
		String[] operations = { "--X", "X++", "X++" };
		FinalValueofVariableAfterPerformingOperations finalValueofVariableAfterPerformingOperations = new FinalValueofVariableAfterPerformingOperations();
		int val = finalValueofVariableAfterPerformingOperations.finalValueAfterOperations(operations);
		System.out.println(val);
	}

}
