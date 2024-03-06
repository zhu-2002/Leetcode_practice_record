package problem_484;

import java.util.Stack;

/*
* https://leetcode.cn/problems/find-permutation
*/

class Solution {
    public int[] findPermutation(String s) {
        Stack<Integer> stack = new Stack<>() ;
        int[] res = new int[s.length()+1] ;
        int index = 0 ;
        for (int i = 1; i <= s.length() ; i++) {
            if (s.charAt(i-1) == 'I' ){
                res[index++] = i ;
                while (!stack.isEmpty()) {
                    res[index++] = stack.pop() ;
                }
            }else {
                stack.push(i);
            }
        }
        stack.push(s.length()+1) ;
        while (!stack.isEmpty()) {
            res[index++] = stack.pop() ;
        }
        return res ;
    }
}