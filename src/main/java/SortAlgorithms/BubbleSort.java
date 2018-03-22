package SortAlgorithms;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int [] arr = {8, 10, 4, 2, 6};
		System.out.println(String.format("Array before Sorting = %s \n", Arrays.toString(arr)));
		bubbleSort(arr);
		System.out.println(String.format("Array after Sorting = %s \n", Arrays.toString(arr)));
	}
	
	static void bubbleSort(int [] arr) {		
		int bucket;
		for(int i=0; i<arr.length -1; i++)
			for(int j=0; j< arr.length - 1 - i; j++)
			{
				if(arr[j]>arr[j+1]) {
					bucket = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = bucket;
				}
			}
	}
}
