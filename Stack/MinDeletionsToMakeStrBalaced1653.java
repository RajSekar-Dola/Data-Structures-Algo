public int minimumDeletions(String s) {
        if (s.length() == 1) {
            return 0;
        }

        Stack<Character> st = new Stack<>();
        int count = 0;
        st.push(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                if (st.isEmpty()) {
                    st.push('a');
                } else if (st.peek() == 'a') {
                    st.push('a');
                } else {
                    st.pop();
                    count++;
                }
            } else {
                st.push('b');
            }
        }

        return count;
    }
