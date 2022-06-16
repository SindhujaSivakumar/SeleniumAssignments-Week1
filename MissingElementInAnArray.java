package week1.day2;

import java.util.Arrays;

public class MissingElementInAnArray {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8};
		Arrays.sort(arr);
		int l=arr.length;
		for (int i=0;i<l;i++) {
			int n = i+1;
			if(n!=arr[i]) {
				System.out.println("Number " + n + " is missing" );
				break;
			}
				
		}

	}

}
