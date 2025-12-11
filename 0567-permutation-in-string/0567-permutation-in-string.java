
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        // Use maps (arrays) to store character counts for s1 and the current window in s2
        int[] s1Map = new int[26];
        int[] s2Map = new int[26];

        // Initialize maps with the first s1.length() characters
        for (int i = 0; i < s1.length(); i++) {
            s1Map[s1.charAt(i) - 'a']++;
            s2Map[s2.charAt(i) - 'a']++;
        }

        // Slide the window across the rest of s2
        // The loop condition is correct to cover all starting positions of the window
        for (int i = 0; i < s2.length() - s1.length(); i++) {
            // Check if the current window matches s1's character counts
            if (matches(s1Map, s2Map)) {
                return true;
            }

            // Slide the window: add the new character entering the window
            s2Map[s2.charAt(i + s1.length()) - 'a']++;
            // Slide the window: remove the character leaving the window
            s2Map[s2.charAt(i) - 'a']--;
        }

        // After the loop, check the very last window
        return matches(s1Map, s2Map);
    }

    // Helper method to compare the two character count maps
    private boolean matches(int[] s1Map, int[] s2Map) {
        for (int i = 0; i < 26; i++) {
            if (s1Map[i] != s2Map[i]) {
                return false;
            }
        }
        return true;
    }
}

