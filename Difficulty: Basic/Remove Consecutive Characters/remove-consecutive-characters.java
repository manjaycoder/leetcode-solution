//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            
            String S = read.readLine().trim();
            
            Solution ob = new Solution();
            String ans = ob.removeConsecutiveCharacter(S);
            
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    public String removeConsecutiveCharacter(String S){
 
        if (S.length() <= 1) {
            return S;
        }
   
        StringBuilder result = new StringBuilder();
        
   
        char prevChar = S.charAt(0);
        result.append(prevChar);  
        
        for (int i = 1; i < S.length(); i++) {
            char currentChar = S.charAt(i);
            if (currentChar != prevChar) {
                result.append(currentChar);  
            }
            prevChar = currentChar;  
        }
        
        return result.toString();  
    }

}