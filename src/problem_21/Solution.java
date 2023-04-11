package problem_21;
// 21. 合并两个有序链表

import problem_21.ListNode ;

class Solution {
    //  空间溢出，在实际比赛中这种额外开辟空间去放数据的做法往往不可行
//    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//        if( list1 == null ){
//            return list2 ;
//        }
//        if( list2 == null ){
//            return list1 ;
//        }
//        ListNode head = new ListNode(-1) ;
//        ListNode anc = head ;
//        while( list1 != null || list2 != null ){
//            if ( list1 != null && list2 != null){
//                if( list1.val >= list2.val ){
//                    anc.val = list2.val ;
//                }
//                else{
//                    anc.val = list1.val ;
//                }
//            }else if( list1 != null ){
//                anc.val = list1.val  ;
//            } else if ( list2 != null ) {
//                anc.val = list2.val ;
//            }
//            anc.next = new ListNode() ;
//            anc = anc.next ;
//        }
//        return head.next ;
//    }
    // 评论区这种方法就很是巧妙，定义指针，递归两个链表中的值，让小的值被res指着，小的值的链表往下移一个节点，在递归调用修改后的两个链表，不得不说真的很巧妙
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode res = l1.val < l2.val ? l1 : l2;
        res.next = mergeTwoLists(res.next, l1.val >= l2.val ? l1 : l2);
        return res;
    }
}