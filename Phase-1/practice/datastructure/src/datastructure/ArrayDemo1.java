package datastructure;
import java.util.Arrays;
import java.util.Scanner;

@SuppressWarnings("unused")
public class ArrayDemo1 {
	public static void main(String[] args) {
		int[] arr = { 12, 2, 1, 5, 78, 5, 3 };

		var sc = new Scanner(System.in);
		while(true) {
			System.out.println("Please enter kth element to search in array:");
			int k = sc.nextInt();
			
			int result = ArrayDemo1.kthSmallestElement(arr, k);
			System.out.println("result:" + result);	
		}
		

	}

	static int kthSmallestElement(int[] arr, int k) {
		Arrays.sort(arr);
		return arr[k - 1];
	}
}
