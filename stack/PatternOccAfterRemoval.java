package stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class PatternOccAfterRemoval {

	// https://www.geeksforgeeks.org/pattern-occurrences-stack-implementation-java/

	// "Occurrences found at means at which steps does it found
	public static void main(String[] args) {

		System.out.println(PatternOccrAR("ABABCABCC", "ABC"));
	}

	public static int PatternOccrAR(String string, String ptr) {
		int occr = 0;

		Deque str = new ArrayDeque();
		char[] stringchar = string.toCharArray();
		char[] ptrchar = ptr.toCharArray();

		for (int i = 0; i < string.length(); i++) {
			int k = 0;
			int l = i;
			if (stringchar[l] == ptrchar[k]) {
				while (k < ptrchar.length - 1 && stringchar[++l] == ptrchar[++k]) {
					str.push(stringchar[i]);
					if (k == ptrchar.length - 1) {
						++occr;
						while (k != 0) {
							str.pop();	
						}

					}

				}
				while (k >= 8 ) {
					str.pop();	
					--k;
				}
			}

		}

		return occr;
	}

}
