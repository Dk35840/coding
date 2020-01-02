class Main{
	public static void main(String[] Str){
		int arr[] = { 2, 3, 4, 10, 40 };  
	    int x = 1; 
	      
	    int result = search(arr, x); 
	    System.out.println(result);

	}

	static int  search(int[] arr, int x){
		for(int i=0; i<arr.length;i++){
			if(x==arr[i])
				return i;
		}

		return -1;
	}
}