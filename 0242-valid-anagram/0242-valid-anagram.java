class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
    char[] str=s.toCharArray();
        char[] st1=t.toCharArray();
        Arrays.sort(str);
        Arrays.sort(st1);
        if(Arrays.equals(str,st1)) {
            return true;
        }
        return false;
    }
}