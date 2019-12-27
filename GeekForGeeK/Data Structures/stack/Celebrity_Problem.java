package stack;

import java.util.ArrayDeque;
import java.util.Deque;

//https://www.geeksforgeeks.org/the-celebrity-problem/

public class Celebrity_Problem {

	static int MATRIX[][] = { { 0, 0, 0, 1, 0 }, { 0, 0, 0, 1, 0 }, { 0, 0, 0, 1, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 0, 1, 0 } };

	static boolean knows(int a, int b) {
		return MATRIX[a][b] == 0 ? false : true;
	}

	public static int findCelebrity(int n) {
		final int l=3;
		
		Deque<Integer> stack = new ArrayDeque<Integer>();
		for (int i = 0; i < n; i++) {
			stack.push(i);
		}

		// if stackcount==1
		while (stack.size() > 1) {
			int a = stack.pop();
			int b = stack.pop();
			// true
			if (knows(a, b)) {
				stack.push(b);
			} else
				stack.push(a);
		}

		// to check if celebrity does not know anyone
		boolean check = true;
		while (n > 0 && !knows(stack.peek(), n - 1)) {
			--n;
		}

		return n == 0 ? stack.pop() : -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findCelebrity(5));
	}

}
