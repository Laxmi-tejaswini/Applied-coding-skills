class Solution {
    public boolean isValid(String str) {
        Stack<Character> s = new Stack<>();
        for (char c : str.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                s.push(c);
            } else {
                if (s.isEmpty())
                    return false;
                if ((c == ')' && s.pop() != '(') ||
                    (c == ']' && s.pop() != '[') ||
                    (c == '}' && s.pop() != '{'))
                    return false;
            }
        }
        return s.isEmpty();
    }
}