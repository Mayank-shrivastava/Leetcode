// { Driver Code Starts
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int arr[]= new int[N];
            for(int i = 0; i < N; i++)
                arr[i] = Integer.parseInt(input_line[i]);
            int sum = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            if(ob.isSubsetSum(N, arr, sum))
            System.out.println(1);
            else
            System.out.println(0);

            
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    
    static Boolean isSubsetSum(int N, int arr[], int sum){
        // code here
       Boolean[][] dp = new Boolean[N+1][sum+1];
    //   for(Boolean[] dp1 : dp) {
    //       Arrays.fill(dp1, false);
    //   }
       return helper(N,arr,sum,dp);
    }
    
    static Boolean helper(int N, int[] arr, int sum, Boolean[][] dp) {
       if(sum == 0) {
           return true;
       }
       
       if(N == 0) {
           return false;
       }
       
       if(dp[N][sum] != null) {
           return dp[N][sum];
       }
       
       if(arr[N-1] <= sum) {
           return dp[N][sum] = helper(N-1,arr,sum-arr[N-1], dp) || helper(N-1,arr,sum, dp);
       } else {
           return dp[N][sum] = helper(N-1,arr,sum,dp);
       }
    }
}