public static int dynamic(int[][] books, int shelfWidth, int prevH, int remWid, int i,int[][] Dp) {
        if (i >= books.length) {
            return prevH;
        }

        if(Dp[i][remWid] != -1){
            return Dp[i][remWid];
        }

        int a = Integer.MAX_VALUE;
        if (books[i][0] <= remWid) {
            a = dynamic(books, shelfWidth, Math.max(prevH, books[i][1]), remWid - books[i][0], i + 1,Dp);
        }
        int b = prevH + dynamic(books, shelfWidth, books[i][1], shelfWidth - books[i][0], i + 1,Dp);

        return Dp[i][remWid] = Math.min(a, b);
    }

    public int minHeightShelves(int[][] books, int shelfWidth) {
        int[][] Dp = new int[books.length][shelfWidth + 1];
        for (int i = 0; i < books.length; i++) {
            Arrays.fill(Dp[i], -1);
        }
        return dynamic(books, shelfWidth, 0, shelfWidth, 0,Dp);
    }
