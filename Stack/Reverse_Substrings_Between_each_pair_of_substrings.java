class Solution {
    public static void reverse(StringBuilder x, int start, int end) {
        int l = start, r = end;
        while (l < r) {
            char c = x.charAt(l);
            x.setCharAt(l, x.charAt(r));
            x.setCharAt(r, c);
            l++;
            r--;
        }
    }

    public static String reverseParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        StringBuilder x = new StringBuilder(s);
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == '(') {
                st.push(i);
            } else if (x.charAt(i) == ')') {
                int a = st.pop();
                reverse(x, a + 1, i - 1);
                x.deleteCharAt(i);
                x.deleteCharAt(a);
                i -= 2; 
            }
        }
        return x.toString();
    }
}
