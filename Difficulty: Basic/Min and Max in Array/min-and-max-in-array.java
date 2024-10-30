//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;


// } Driver Code Ends


class Solution {
    public Pair<Long, Long> getMinMax(int[] arr) {
        long min=arr[0];
        long max=arr[0];
        for(int i:arr){
            if(min>i){
                min=i;
            }
            if(max<i){
                max=i;
            }
        }
        return new Pair<Long,Long>(min,max);
    }
}
//{ Driver Code Starts.

class Pair<K, V> {
    private final K key;
    private final V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() { return key; }

    public V getValue() { return value; }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;

            Solution ob = new Solution();
            Pair<Long, Long> pp = ob.getMinMax(arr);
            System.out.println(pp.getKey() + " " + pp.getValue());
        
System.out.println("~");
}
    }
}

// } Driver Code Ends