class Solution {
    public static String reverse(String s) {
        StringBuilder x = new StringBuilder(s);
        int l = 0, r = s.length() - 1;
        while (l < r) {
            char c = x.charAt(l);
            x.setCharAt(l, x.charAt(r));
            x.setCharAt(r, c);
            l++;
            r--;
        }
        return x.toString();
    }

    public static int greedy(String s, int x, int y) {
        int ab = 0, ba = 0, res = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                ab++;
            } else if (s.charAt(i) == 'b') {
                if (ab > 0) {
                    res += x;
                    ab--;
                } else {
                    ba++;
                }
            } else {
                res += y * Math.min(ab, ba);
                ab = 0;
                ba = 0;
            }
        }
        res += Math.min(ab, ba) * y;
        return res;
    }

    public int maximumGain(String s, int x, int y) {
        if (y > x) {
            s = reverse(s);
            return greedy(s, y, x);
        }

        return greedy(s, x, y);
    }
}
