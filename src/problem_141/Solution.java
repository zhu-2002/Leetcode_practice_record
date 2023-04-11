package problem_141;

import java.util.HashMap;
// 环形链表
public class Solution {
    public boolean hasCycle(ListNode head) {
        HashMap<ListNode,Integer> map = new HashMap<ListNode,Integer>() ;
        for (ListNode i = head ; i != null ; i = i.next ) {
            if ( map.containsKey(i)) {
                return true ;
            }
            map.put(i,1) ;
        }
        return false ;
    }
}
// 追击
//public class Solution {
//    public boolean hasCycle(ListNode head) {
//        if (head == null || head.next == null) {
//            return false;
//        }
//        ListNode slow = head;
//        ListNode fast = head.next;
//        while (slow != fast) {
//            if (fast == null || fast.next == null) {
//                return false;
//            }
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//        return true;
//    }
//}