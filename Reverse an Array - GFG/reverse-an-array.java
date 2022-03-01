/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws Exception{
		//code
		
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while(t-->0) {
		    int n = scn.nextInt();
		    int[] arr = new int[n];
		    for(int i = 0; i < n; i++) {
		        arr[i] = scn.nextInt();
		    }
		    int left = 0;
		    int right = n-1;
		    while(left < right) {
		        int temp = arr[left];
		        arr[left] = arr[right];
		        arr[right] = temp;
		        left++;
		        right--;
		    }
		    for(int i = 0; i < n; i++) {
		        System.out.print(arr[i] + " ");
		    }
		    System.out.println();
		}
	}
}