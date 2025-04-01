class Solution {
    public boolean isAnagram(String s, String t) {
        char[] ch=s.toCharArray();
        char[] vh=t.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(vh);
        return Arrays.equals(ch,vh);
    }
}