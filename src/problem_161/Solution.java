package problem_161;

/*
* https://leetcode.cn/problems/one-edit-distance/
*/

class Solution {
    public boolean isOneEditDistance(String s, String t) {
        // 让t的长度大于s的长度
        if ( s.length() > t.length() ){
            return isOneEditDistance(t,s) ;
        }
        // 只有一个字符不一样
        if ( t.length() - s.length() > 1 ){
            return false ;
        }

        for (int i = 0; i < s.length(); i++) {
            if ( s.charAt(i) != t.charAt(i) ){
                // 可能是替换情况
                if( t.length() == s.length() ){
                    return s.substring(i+1,s.length()).equals(t.substring(i+1,t.length())) ;
                }
                // 可能是添加情况
                return s.substring(i,s.length()).equals(t.substring(i+1,t.length())) ;
            }
        }

        return t.length() == s.length()+1 ;

    }
}