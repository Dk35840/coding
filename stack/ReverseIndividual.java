package stack;

import java.util.ArrayDeque;
import java.util.Deque;

//https://www.geeksforgeeks.org/reverse-individual-words/
public class ReverseIndividual {

	
	public static String reverseIndividual(String str) {
		StringBuilder sb= new StringBuilder();
		String mainString = null;
		char[] ch= str.toCharArray();
		Deque word= new ArrayDeque();
		for(int i=0;i<ch.length;i++) {
			
			if(ch[i]==' ') {
				while(!word.isEmpty()) {
					sb.append(word.pop());
					
				}
				sb.append(" ");
			
			}else {
				word.push(ch[i]);
			}
			
			// it is not necessary that there must be space after last world
			while(!word.isEmpty()) {
				sb.append(word.pop());
				
			}
		}
		
		
		return sb.toString();
	}
	public static void main(String[] args) {
		System.out.println(reverseIndividual("Hello Worldd"));
	}

}
