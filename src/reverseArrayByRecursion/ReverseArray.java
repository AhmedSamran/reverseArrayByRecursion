package reverseArrayByRecursion;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
		reverse(A, 0, A.length - 1);
		System.out.println(Arrays.toString(A));
	}

	public static void reverse(int[] A, int i, int j) {
		if (i < j) {
			int holder = A[i];
			A[i] = A[j];
			A[j] = holder;
			System.out.println(Arrays.toString(A));
			reverse(A, ++i, --j);
		}
	}
}
