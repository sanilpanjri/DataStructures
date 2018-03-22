package SortAlgorithms;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = {8, 10, 4, 2, 6};
		System.out.println(String.format("Array before Sorting = %s \n", Arrays.toString(arr)));
		selectionSort(arr);
		System.out.println(String.format("Array after Sorting = %s \n", Arrays.toString(arr)));		
	}
	
	static void selectionSort(int[] arr) {
		int minIndex, bucket;
		for(int i=0; i<arr.length-1; i++) {
			minIndex = i;
			for(int j=i+1; j< arr.length; j++) {
				if(arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
				bucket = arr[i];
				arr[i]= arr[minIndex];
				arr[minIndex] = bucket;
			
		}
	}

}
