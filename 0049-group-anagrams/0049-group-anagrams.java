// Problem: Group Anagrams
// Idea: Two strings are anagrams if they contain exactly the same characters
// in any order. If we sort both strings, they will become identical.
// Example: "eat", "tea", "ate" -> after sorting -> "aet"

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
     HashMap<String,List<String>> map=new HashMap<>();
     for(String word:strs){
        int[] count=new int[26];
        for(char c:word.toCharArray()){
            count[c-'a']++;
        }
        StringBuilder sb=new StringBuilder();
        for(int num:count){
            sb.append("#");
            sb.append(num);
        }
        String key=sb.toString();
        if(!map.containsKey(key)){
            map.put(key,new ArrayList<>());
        }
        map.get(key).add(word);
     }
     return new ArrayList<>(map.values());
      
    }
}
