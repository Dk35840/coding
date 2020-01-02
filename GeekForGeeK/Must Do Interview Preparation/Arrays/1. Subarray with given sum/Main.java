class Main{
	public static void main(String[] str) {
		int arr[] = {1,2,3,5,6,7};
		int length = 7;
		System.out.println(missingNumber(arr, length));
	}
	
	
	static int missingNumber(int[] arr,int length) {
		int result=(1+length)*length/2;
		for(int i=0;i<length-1;i++) {
			result-=arr[i];
		}
	return result;
	}
}