package SearchingElements;

import java.util.Scanner;

public class AgnosticBinarySearch {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter length of the array ");
		int n = in.nextInt();
		System.out.println("Add numbers to your array in ascending or descending order");
		int[] array = new int[n];
		for (int i = 0; i < array.length; i++) {
			array[i] = in.nextInt();
		}
		System.out.println("Enter the target value to find in the array");
		int target = in.nextInt();
		in.close();
		System.out.println("index number of your target is " + orderAgnosticBS(array, target));
	}

	static int orderAgnosticBS(int[] array, int target) {
		int start = 0;
		int end = array.length - 1;
		// find whether array is sorted in ascending or descending order.
		boolean isAsc = array[start] < array[end] ? true : false;
		System.out.println(isAsc);
		while (start <= end) {
			int middle = start + (end - start) / 2;
			if (array[middle] == target) {
				return middle;
			}
			if (isAsc) {
				if (target < array[middle]) {
					end = middle - 1;
				} else {
					start = middle + 1;
				}
			} else {
				if (target > array[middle]) {
					end = middle - 1;
				} else {
					start = middle + 1;
				}

			}
		}
		return -1;
	}
}
