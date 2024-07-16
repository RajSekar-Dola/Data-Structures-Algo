class Solution {
    public static boolean findPath(TreeNode root, int target, StringBuilder res) {
        if (root == null) {
            return false;
        }

        if (root.val == target) {
            return true;
        }

        res.append('L');
        if (findPath(root.left, target, res)) {
            return true;
        }
        res.deleteCharAt(res.length() - 1);

        res.append('R');
        if (findPath(root.right, target, res)) {
            return true;
        }
        res.deleteCharAt(res.length() - 1);

        return false;
    }

    public String getDirections(TreeNode root, int startValue, int destValue) {
        StringBuilder res1 = new StringBuilder("");
        StringBuilder res2 = new StringBuilder("");

        findPath(root, startValue, res1);
        findPath(root, destValue, res2);

        int i = 0, j = 0;
        while (i < res1.length() && j < res2.length() && res1.charAt(i) == res2.charAt(j)) {
            i++;
            j++;
        }

        StringBuilder result = new StringBuilder();
        for (int x = i; x < res1.length(); x++) {
            result.append('U');
        }

        result.append(res2.substring(j));

        return result.toString();
    }
}
