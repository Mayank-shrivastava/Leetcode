// { Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;


class Array {
	public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int a[] = new int[n];
            
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }
            
            Solution ob = new Solution();
            
            System.out.println(ob.print2largest(a,n));
        }
        
	}
}// } Driver Code Ends


//User function Template for Java

class Solution
{ 
    public static int print2largest(int arr[],int N) 
    {
        //CODE HERE
        if(isSame(arr,N)) {
            return -1;
        }
        int largest = 0;
        int second_lar = 0;
        for(int i = 0; i < arr.length; i++) {
            if(largest < arr[i]) {
                second_lar = largest;
                largest = arr[i];
            } else if(arr[i] < largest && arr[i] > second_lar) {
                second_lar = arr[i];
            } 
        }
        return second_lar;
    }
    
    public static boolean isSame(int[] arr, int n) {
        for(int i = 1; i < n; i++) {
            if(arr[i-1] != arr[i]) {
                return false;
            } 
        }
        return true;
    }
}
        
