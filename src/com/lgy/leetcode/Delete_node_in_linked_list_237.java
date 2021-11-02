package com.lgy.leetcode;
class ListNode_237 {
      int val;
      ListNode_237 next;
      ListNode_237(int x) { val = x; }
 }
public class Delete_node_in_linked_list_237 {
    public void deleteNode(ListNode_237 node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
