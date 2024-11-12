class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Character> mappedBrackets = new HashMap<>();
        mappedBrackets.put(')', '(');
        mappedBrackets.put(']', '[');
        mappedBrackets.put('}', '{');
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (mappedBrackets.containsKey(c)) {
                if (stack.empty() || stack.pop() != mappedBrackets.get(c)) {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.empty();
    }
}