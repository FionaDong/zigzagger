package com.fiona.test;

public class BubbleSortTest {

	public static void main(String[] args) {

		int[] a = { 3, 4, 6, 1, 2 };
		BubbleSort.Sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}

class BubbleSort {

	public static void Sort(int[] a) {

		int i, j;

		if (a == null)
			System.out.println("array needs to be initialed");

		for (i = 0; i < a.length - 1; i++) {
			for (j = 0; j < a.length - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}

			}
		}

	}

	public static int binarySearch(int[] array, int value) {

		int low = 0;
		int high = array.length - 1;
		int middle;

		while (low <= high) {

			middle = (low + high) / 2;
			if (array[middle] == value) {

				return middle;
			}

			if (value < array[middle]) {

				high = middle - 1;
			}

			if (value > array[middle]) {

				low = middle + 1;
			}
		}
		return -1;

	}
}
