class Solution {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if (!isMatchedPair(top, c)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static boolean isMatchedPair(char o, char cl) {
        return (o == '(' && cl == ')') || (o == '{' && cl == '}') || (o == '[' && cl == ']');
    }
}