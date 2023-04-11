package problem_160;

import java.util.HashMap;

// 交叉链表
public class Solution {
    public ListNode getIntersectionNode( ListNode headA , ListNode headB ){
        ListNode tmp = headA ;
        HashMap<ListNode,Integer> map = new HashMap<ListNode,Integer>() ;
        while( tmp != null ){
            map.put(tmp,1) ;
            tmp = tmp.next ;
        }
        tmp = headB ;
        while( tmp != null ){
            if( map.containsKey(tmp) ){
                return tmp ;
            }
            tmp = tmp.next ;
        }
        return null ;
    }
}
