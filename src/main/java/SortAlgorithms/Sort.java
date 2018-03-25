package SortAlgorithms;

import java.util.Arrays;

public class Sort {
	
	int arr[] = {10,2,6,4,8};
	
	public void sort(int arr[]) {
		System.out.println("Array before sorting: ");
		System.out.println(Arrays.toString(arr));
	}
	
	//Package-private method
	void print(int arr[]) {
		System.out.println(Arrays.toString(arr));
		System.out.println("--------------------------");
	}
	
	public static void main(String[] args) {
		BubbleSort bs = new BubbleSort();
		bs.sort(bs.arr);
		
		SelectionSort ss = new SelectionSort();
		ss.sort(ss.arr);
		
		InsertionSort is = new InsertionSort();
		is.sort(is.arr);
	}

}
