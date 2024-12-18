import java.util.*;

public class HybridSort {
	public static void main(String[] args) {
                //you can try with different arrays, of course

		int[] A = {-10, -5, -3, -9, -8, -7, -6, -2, -10, -6, -3, -1, -11, -5, -4};

		System.out.println("Original array: " + Arrays.toString(A));
		System.out.println();

		A = hybridSort(A);

		System.out.println("Array sorted: " + Arrays.toString(A));
		System.out.println();
	}

	public static int[] hybridSort(int[] A) {
		int n = A.length;
		int t = A.length-1;
		int c = 0;
		int temp;
		int temp2;
		boolean swapped = true;
		//this implements the bubble sort algorithm
		while(swapped){
			swapped = false;
			for(int i = 0; i < n-1; i++){
				if(A[i] > A[i+1]){ //swap if this is true
					temp = A[i+1];
					A[i+1] = A[i];
					A[i] = temp;
					swapped = true;
					//this implements part of the selection sort algorithm
					if(A[c] >= A[t]){ //swap if this is true
						temp2 = A[t];
						A[t] = A[c];
						A[c] = temp2;
					}else {
						t -= 1;
					}
				}
			}
			System.out.println("another iteration " + Arrays.toString(A));
		}n =-1;
		return A; //returns the sorted array
	}
}

