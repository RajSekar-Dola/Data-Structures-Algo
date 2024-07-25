class Solution {
    public static Node traverse(int l,int r,int [] nums){
        if(l > r){
            return null; 
        }
        
        int mid = (l+r)/2;
        Node root = new Node(nums[mid]);
        root.left = traverse(l,mid-1,nums);
        root.right = traverse(mid+1,r,nums);
        return root;
    }
    public Node sortedArrayToBST(int[] nums) {
        return traverse(0,nums.length-1,nums);
    }
}
