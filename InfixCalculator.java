import java.util.Stack;
public class InfixCalculator{
	public static void main(String[] args) {
		String InfixExpression = "10*(2+15)/17";
		Assignment2 index = new Assignment2();
		System.out.println(index.evaluate(InfixExpression));
	}
	public int evaluate(String expression) {
		Stack<Integer> numbers = new Stack<>(); //number stack 
		Stack<Character> operations = new Stack<>(); //operator stack
		for(int i = 0; i< expression.length(); i++) {
			char ch = expression.charAt(i);
			if(Character.isDigit(ch)) {
				int num = 0; //input can be 1 or more digit number
				while(Character.isDigit(ch)) {
					num = num * 10 + (ch - '0');
					i++;
					if(i < expression.length())
						ch = expression.charAt(i);
					else
						break;
				}
				i--;
				numbers.push(num); 
			}else if(ch =='(') {
				operations.push(ch); //push to operator stack 
			}
			else if(ch == ')') { //evaluate entire brace after close parenthesis 
				while(operations.peek()!='(') {
					int output = performOperation(numbers, operations);
					numbers.push(output);
				}
				operations.pop();
			}
			else if(isOperator(ch)) { //If current operator has higher precedence than current top of stack
									  // then current operator goes in the stack
				
									  //Otherwise, continue performing operation after popping operator from stack
									  //until a) stack is empty or b)current operator has higher precedence  
				while(!operations.isEmpty() && precedence(ch) <= precedence(operations.peek())) {
					int output = performOperation(numbers, operations);
					numbers.push(output); //push back to stack 
				}
				operations.push(ch); //current operator pushed to stack 
			}
		} //The expression has now been processed, so continue performing operations to numbers stack
		while(!operations.isEmpty()) {
			int output = performOperation(numbers, operations);
			numbers.push(output);
		}
		return numbers.pop();
	}
	
	static int precedence(char ch) {
		switch (ch) {
		case'+':
		case'-':
			return 1;
		case'*':
		case'/':
			return 2;
		case'^':
			return 3;
		}
		return -1;
	}
	
	public int performOperation(Stack<Integer> numbers, Stack<Character> operations) {
		int a = numbers.pop();
		int b = numbers.pop();
		char operation = operations.pop();
		switch(operation) {
			case'+':
				return a+b;
			case'-':
				return b-a;
			case'*':
				return a*b;
			case'/':
				if(a == 0) 
					System.out.println("Invalid; cannot divide by zero");
				return a/b;
		}
		return 0;
	}
	
	public boolean isOperator(char ch) {
		return (ch == '+' || ch == '-' || ch == '/' || ch == '*' || ch == '^');
	}
}
