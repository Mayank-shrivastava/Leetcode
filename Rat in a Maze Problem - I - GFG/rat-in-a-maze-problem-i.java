// { Driver Code Starts
// Initial Template for Java

import java.util.*;
class Rat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();

            Solution obj = new Solution();
            ArrayList<String> res = obj.findPath(a, n);
            Collections.sort(res);
            if (res.size() > 0) {
                for (int i = 0; i < res.size(); i++)
                    System.out.print(res.get(i) + " ");
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
    }
}
// } Driver Code Ends


// User function Template for Java

// m is the given matrix and n is the order of matrix
class Solution {
    public static ArrayList<String> findPath(int[][] m, int n) {
        // Your code here
        ArrayList<String> list = new ArrayList<>();
        int[][] visited = new int[n][n];
        helper(m, 0,0, n-1,n-1,"",list, visited);
        return list;
        
    }
    
    public static void helper(int[][] m, int cr, int cc, int dr,
                                      int dc, String ans, ArrayList<String> list, int[][] visited) {
                                          
                                          
        if(cr < 0 || cr > dr || cc < 0 || cc > dc || m[cr][cc] == 0 || visited[cr][cc] == 1) {
            return;
        }
        if(cr == dr && cc == dc) {
            list.add(ans);
            return;
        }
        visited[cr][cc] = 1;
        helper(m, cr-1, cc, dr,dc, ans+"U", list, visited);
        helper(m, cr+1, cc, dr,dc, ans+"D", list, visited);
        helper(m, cr, cc-1, dr, dc, ans+"L", list, visited);
        helper(m, cr, cc+1, dr, dc, ans+"R", list, visited);
        visited[cr][cc] = 0;
    }
}