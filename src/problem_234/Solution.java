package problem_234;

import java.util.Stack;

// 234. 回文链表
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode temp = head;
        Stack<Integer> stack = new Stack();
        while (temp != null) {
            stack.push(temp.val);
            temp = temp.next;
        }
        while (head != null) {
            if (head.val != stack.pop()) {
                return false;
            }
            head = head.next;
        }
        return true;
    }
}
// 首先通过快慢指针找到链表的中点，然后翻转后面的链表（需要考虑到链表的长度的奇偶性）
//    public boolean isPalindrome(ListNode head) {
//        ListNode fast = head, slow = head;
//        //通过快慢指针找到中点
//        while (fast != null && fast.next != null) {
//            fast = fast.next.next;
//            slow = slow.next;
//        }
//        //如果fast不为空，说明链表的长度是奇数个
//        if (fast != null) {
//            slow = slow.next;
//        }
//        //反转后半部分链表
//        slow = reverse(slow);
//
//        fast = head;
//        while (slow != null) {
//            //然后比较，判断节点值是否相等
//            if (fast.val != slow.val)
//                return false;
//            fast = fast.next;
//            slow = slow.next;
//        }
//        return true;
//    }
//
//    //反转链表
//    public ListNode reverse(ListNode head) {
//        ListNode prev = null;
//        while (head != null) {
//            ListNode next = head.next;
//            head.next = prev;
//            prev = head;
//            head = next;
//        }
//        return prev;
//    }

