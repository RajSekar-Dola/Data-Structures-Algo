public int minimumPushes(String word) {
        Integer [] count = new Integer[26];
        Arrays.fill(count,0);

        int res = 0, minPush = 0;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            count[c - 'a']++;
            if (count[c - 'a'] == 1) {
                res++;
            }
        }

        if (res <= 8) {
            return word.length();
        }

        Arrays.sort(count,(a,b) -> b-a);

        for (int i = 0; i < 26; i++) {
            if (i < 8) {
                minPush = minPush + count[i];
            } else if (i < 16) {
                minPush = minPush + 2 * count[i];
            } else if (i < 24) {
                minPush = minPush + 3 * count[i];
            } else {
                minPush = minPush + 4 * count[i];
            }
        }

        return minPush;
    }
