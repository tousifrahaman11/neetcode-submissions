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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode();
        ListNode dm = dummy;
        
        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                dm.next = list1;
                list1 = list1.next;
            } else{
                dm.next = list2;
                list2 = list2.next;
            }
            dm = dm.next;
        }
        if(list1 != null){
            dm.next = list1;
        }
        if(list2 != null){
            dm.next = list2;
        }

        return dummy.next;
    }
}