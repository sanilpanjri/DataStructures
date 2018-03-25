package SortAlgorithms;

public class SelectionSort extends Sort{
	
	public void sort(int [] sortArray) {
		super.sort(sortArray);
		int bucket;
		int minIndex;
		for(int i = 0; i < sortArray.length - 1; i++) {
			minIndex = i;
			for(int j = i+1; j < sortArray.length; j++) {
				if(sortArray[j] < sortArray[minIndex]) {
					minIndex=j;
				}
			}
			bucket = sortArray[minIndex];
			sortArray[minIndex] = sortArray[i];
			sortArray[i] = bucket;
		}
		print(sortArray);
	}
	
	 void print(int arr[]) {
		System.out.println("Array after sorting: [Selection Sort]");
		super.print(arr);
	}
}
