package stack;

import java.util.ArrayDeque;

//https://www.geeksforgeeks.org/expression-evaluation/
public class Expression_evaluation {
	public static int evaluate(String exressions) {
		char[] tokens = exressions.toCharArray();
		ArrayDeque<Integer> value = new ArrayDeque<>();
		ArrayDeque<Character> operator = new ArrayDeque<>();
		for (int i = 0; i < tokens.length; i++) {

			// tokens is empty
			if (' ' == tokens[i]) {
				continue;
			}

			// A number: push it onto the value stack.
			else if (tokens[i] >= '0' && tokens[i] <= '9') {
				StringBuilder integer = new StringBuilder();
				while (i < tokens.length && tokens[i] >= '0' && tokens[i] <= '9') {
					integer.append(tokens[i]);
					i++;
				}
				value.push(Integer.parseInt(integer.toString()));
				// System.out.println(value);
			}
			// A variable: get its value, and push onto the value stack.
			else if ('-' == tokens[i] || '+' == tokens[i] || '*' == tokens[i] || '/' == tokens[i]) {
				while (!operator.isEmpty() && hasPresidence(tokens[i], operator.peek())) {
					value.push(operateStack(value.pop(), value.pop(), operator.pop()));

				}
				operator.push(tokens[i]);
			}
			// A left parenthesis: push it onto the operator stack.
			else if ('(' == tokens[i]) {
				operator.push(tokens[i]);
			}
			// A right parenthesis:
			else if (')' == tokens[i]) {
				while (operator.peek() != '(') {

					value.push(operateStack(value.pop(), value.pop(), operator.pop()));
					//
				}
				operator.pop();
			}

		}
		while (!operator.isEmpty()) {
			value.push(operateStack(value.pop(), value.pop(), operator.pop()));
		}
		return value.pop();
	}

	private static boolean hasPresidence(char op1, char op2) {
		if (op2 == '(' || op2 == ')')
			return false;
		if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-'))
			return false;
		else
			return true;
	}

	public static int operateStack(int num2, int num1, char operator) {
		switch (operator) {
		case '*':
			return num1 * num2;
		case '+':
			return num1 + num2;
		case '-':
			return num1 - num2;
		case '/':
			if (num2 == 0)
				throw new ArithmeticException();
			else
				return num1 / num2;
		}
		return 0;

	}

	public static void main(String[] args) {

		System.out.println(evaluate("100 * 2 + 14"));
		System.out.println(evaluate("100 * ( 2 + 12 )"));
		System.out.println(evaluate("100 * ( 2 + 12 ) /14 "));
	}

}
