package queue;

import java.util.Deque;
import java.util.ArrayDeque;
public class Xchange {

public static boolean Findchange(int[] people) {
	Deque<Integer> fivech= new ArrayDeque<>();
	Deque<Integer> tench= new ArrayDeque<>();
	
	for(int i=0;i<people.length;i++) {
		System.out.println(fivech.size()+ " "+ tench.size());
		if(people[i]==5) {
			fivech.addLast(new Integer(5));
		}
		else if (people[i]==10){
			tench.push(new Integer(10));
			if(fivech.size()>0) {
				fivech.pop();
			}
			else return false;
		}
		else {
			if(tench.size()>=1 && fivech.size()>=1) {
				fivech.pop();
				tench.pop();
			}
			else if(fivech.size()>=3) {
				fivech.pop();
				fivech.pop();
				fivech.pop();
			}
			else return false;
		}
	}
	return true;
}
	public static void main(String[] args) {
		int queue1[]={5, 5, 5, 10, 20}; 
		int queue2[] = {5, 5, 5, 20,10};
		
		System.out.println(Findchange(queue1));
		System.out.println(Findchange(queue2));
	}

}
