class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        //create an array to count character frequencies
        int[] charCounts = new int[26];
        //Increment count for erach chracater in 's' and decrement for each in 't'
        for(int i=0;i<s.length();i++){
            charCounts[s.charAt(i)-'a']++;
            charCounts[t.charAt(i)-'a']--;

        }
            //check if all counts are zero
        for(int count :charCounts){
            if(count != 0){
                return false;
            }
    
        }
        return true;
    }    
    }
