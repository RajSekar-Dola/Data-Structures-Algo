/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public TreeNode createBinaryTree(int[][] descriptions) {
        HashMap<Integer, TreeNode> res = new HashMap<>();
        HashSet<Integer> children = new HashSet<>();
        for (int i = 0; i < descriptions.length; i++) {
            int parent = descriptions[i][0];
            int child = descriptions[i][1];
            boolean leftChild = descriptions[i][2] == 1;

            TreeNode parNode = res.getOrDefault(parent, new TreeNode(parent));
            TreeNode childNode = res.getOrDefault(child, new TreeNode(child));

            if (leftChild) {
                parNode.left = childNode;
            } else {
                parNode.right = childNode;
            }

            res.put(parent,parNode);
            res.put(child,childNode);
            children.add(child);
        }
        
        TreeNode root = new TreeNode();
        for(int key : res.keySet()){
            if(!children.contains(key)){
               root = res.get(key);
               break;
            }
        }

        return root;
    }
}
