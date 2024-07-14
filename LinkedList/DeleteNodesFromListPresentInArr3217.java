/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            hs.add(nums[i]);
         }
        ListNode dummy = new ListNode(0);
        ListNode prev = dummy;
        ListNode temp = head;
        
        while(temp != null){
            while( temp != null && hs.contains(temp.val)){
                temp = temp.next;
             }
            
            if(temp != null){
                prev.next = temp;
                prev = prev.next;
                temp = temp.next;
             }
        }
        
        prev.next = null;
        return dummy.next;
    }
}
