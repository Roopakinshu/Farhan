package com.test.code;

public class GoalParserInterpretation {
    public String interpret(String command) {
    	String newCommand = "";
		for(int i=0; i<command.length(); i++) {
			if(command.charAt(i)=='(' || command.charAt(i)==')') {
				break;
				} else {
					newCommand= newCommand+command.charAt(i);
					break;
				}
			}
			return command;
		}
		
        
    
    public static void main(String[] args) {
			String command = "G()(al)";
			String newCommand = "";
			newCommand = command.replace(" ", "");
//			if(command.contains("()")) {
//				newCommand = command.replace("()", "o");
//				}
        GoalParserInterpretation solution = new GoalParserInterpretation();
        System.out.println(solution.interpret(newCommand));		
	}
}
