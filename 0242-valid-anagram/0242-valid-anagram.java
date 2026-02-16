class Solution {
    public boolean isAnagram(String s, String t) {
     char chars[]=s.toCharArray();
     char chars1[]=t.toCharArray();
     Arrays.sort(chars);
     Arrays.sort(chars1);
     String s1=new String(chars);
     String s2=new String(chars1);
     return (s1.equals(s2))?true:false;
    }

}