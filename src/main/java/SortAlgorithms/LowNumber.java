package SortAlgorithms;

public class LowNumber {

	public static void main(String[] args) {
		
		int arr[] = {9,6,3,7,8};
		int bucket;
		for (int j = arr.length; j >0; j--) {
		for(int i = 0; i < j -1; i++) {
			if(arr[i] > arr[i+1]) {
				bucket = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = bucket;
			}
		}
		}
		for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i]);
		}
	}

	
}
