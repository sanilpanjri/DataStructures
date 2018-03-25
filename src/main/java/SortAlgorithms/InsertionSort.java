package SortAlgorithms;

public class InsertionSort extends Sort{
	
	public void sort(int [] sortArray) {
		super.sort(sortArray);
		int bucket;
		for(int i=1; i< sortArray.length; i++) {
			bucket = sortArray[i];
			int j= i-1;
			while(j>=0 && sortArray[j] > bucket) {
				sortArray[j+1] = sortArray[j];
				j--;
			}
			sortArray[j+1]=bucket;
		}
		print(sortArray);
	}
	
	void print(int arr[]) {
		System.out.println("Array after sorting: [Insertion Sort]");
		super.print(arr);
	}

}
