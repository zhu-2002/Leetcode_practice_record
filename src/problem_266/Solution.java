package problem_266;

import java.util.HashMap;

/*
* https://leetcode.cn/problems/palindrome-permutation
*/

class Solution {
    public boolean canPermutePalindrome(String s) {
        HashMap<Character,Integer> map = new HashMap<>() ;
        int odd = 0 ;

        for (int i = 0; i < s.length() ; i++) {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1) ;
        }
        for ( int val :
             map.values() ) {
            if ( val % 2 == 1 ){
                if ( ++odd > 1 ){
                    return  false ;
                }
            }
        }
        return true ;
    }
}