package day12;

public class ArrayFunc {
	static int[] concat(int arr1[], int arr2[]) {
		int arr3[] = new int[arr1.length + arr2.length];
		int size = 0;
		for(int i=0; i<arr1.length; i++) {
			arr3[i]=arr1[i]; 
			size++;
		}
		for(int i=0; i<arr2.length; i++) {
			arr3[size]=arr2[i];
			size++;
		}
		
		return arr3;
	}
}
