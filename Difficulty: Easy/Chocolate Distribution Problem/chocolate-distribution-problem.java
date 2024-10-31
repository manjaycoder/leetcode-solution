//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> arr = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                arr.add(Integer.parseInt(token));
            }

            int m = Integer.parseInt(br.readLine());
            Solution ob = new Solution();

            System.out.println(ob.findMinDiff(arr, m));
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int findMinDiff(ArrayList<Integer> arr, int m) {
      int n = arr.size();
         if (m > n || n == 0) {
            return -1; // or throw an exception
        }
        // Use Integer.MAX_VALUE for the initial value
         // Use arr.size() instead of arr.length

        // Convert ArrayList to an array for sorting
      int minDiff = Integer.MAX_VALUE;
       Collections.sort(arr);

        // Iterate through the sorted array
        for (int i = 0; i <= n - m; i++) {
            int currentDiff = arr.get(i + m - 1) - arr.get(i);
            minDiff = Math.min(minDiff, currentDiff);
        }

        return minDiff;
    }
}