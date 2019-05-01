package stack;

public class MaxProductofIndex {

	// https://www.geeksforgeeks.org/maximum-product-of-indexes-of-next-greater-on-left-and-right/
	// we have to find previous and next greater index not gretest element

	public static int maxProductNGE(int[] arr) {
		int l[] = new int[arr.length];
		int r[] = new int[arr.length];

		int max = 0;

		for (int i = 0; i < arr.length; i++) {
			l[i] = 0;
			r[i] = 0;
		}

		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[j] > arr[i]) {
					l[i] = j + 1;
					// we have to find closest so no break
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] > arr[i]) {
					r[i] = j + 1;
					break;
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (l[i] * r[i] > max) {
				max = l[i] * r[i];

			}
		}

		return max;
	}

	public static void main(String[] args) {
		int arr[] = { 5, 4, 3, 4, 5 };
		int arr2[] = { 1, 1, 1, 1, 0, 1, 1, 1, 1 };
		System.out.println(maxProductNGE(arr));

		System.out.println(maxProductNGE(arr2));
	}

}
