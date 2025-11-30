// Problem: Group Anagrams
// Idea: Two strings are anagrams if they have EXACTLY the same character frequency.
// So for each word, we create a "frequency key" and group words with the same key.

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        // If input array is empty, simply return an empty list.
        if (strs.length == 0) {
            return new ArrayList<>();
        }

        // Map to store the result.
        // Key = a string representing character frequency
        // Value = list of words that match this frequency
        Map<String, List<String>> ansMap = new HashMap<>();

        // Array to count frequency of 26 lowercase letters for each string
        int[] count = new int[26];

        // Loop through each word in the input array
        for (String s : strs) {
            
            // Reset frequency count for new word
            Arrays.fill(count, 0);

            // Count characters in the string
            for (char c : s.toCharArray()) {
                count[c - 'a']++; // Increase count of that letter
            }

            // Build a key based on character counts
            // Example for "eat" => "#1#0#0#0...#1#0#1" etc.
            StringBuilder sb = new StringBuilder("");
            
            for (int i = 0; i < 26; i++) {
                sb.append("#");      // separator to keep counts distinct
                sb.append(count[i]); // append frequency of each character
            }

            String key = sb.toString(); // final frequency key

            // If this key doesn't exist, create a new list
            if (!ansMap.containsKey(key)) {
                ansMap.put(key, new ArrayList<>());
            }

            // Add the current string to its anagram group
            ansMap.get(key).add(s);
        }

        // Return all grouped anagrams
        return new ArrayList<>(ansMap.values());
    }
}
