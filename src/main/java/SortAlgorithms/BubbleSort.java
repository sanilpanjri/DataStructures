package SortAlgorithms;

public class BubbleSort extends Sort {
	
	public void sort (int[] sortArray) {
		super.sort(sortArray);
		int bucket;
		for (int i = 0; i <sortArray.length -1 ; i++) {
			for(int j = 0; j < sortArray.length -1 - i; j++) {
				if(sortArray[j] > sortArray[j+1]) {
					bucket = sortArray[j];
					sortArray[j] = sortArray[j+1];
					sortArray[j+1] = bucket;
				}
			}
		}
		
		print(sortArray);
	}
	
	void print(int arr[]) {
		System.out.println("Array after sorting: [Bubble Sort]");
		super.print(arr);
	}
}
