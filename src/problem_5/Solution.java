package problem_5;
//给你一个字符串 s，找到 s 中最长的 回文 子串。
//
// 
//
// 示例 1： 
//
// 
//输入：s = "babad"
//输出："bab"
//解释："aba" 同样是符合题意的答案。
// 
//
// 示例 2： 
//
// 
//输入：s = "cbbd"
//输出："bb"
// 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 1000 
// s 仅由数字和英文字母组成 
// 
//
// Related Topics 双指针 字符串 动态规划 👍 7365 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String longestPalindrome(String s) {
        if ( s.length() < 2 ){
            return s ;
        }
        int maxLength = 0 ;
        String result = "" ;
        String subStrinhg = "" ;
        for (int i = 0; i < s.length(); i++) {
            subStrinhg = findPalindrome(i,s) ;
            if (!subStrinhg.isEmpty() && subStrinhg.length()>maxLength){
                maxLength = subStrinhg.length() ;
                result = subStrinhg ;
            }
        }
        return result ;
    }

    public static String findPalindrome(int index, String s){
        int left = index - 1 ;
        int right = index + 1 ;
        int maxIndex = s.length() - 1 ;
        while (right <= maxIndex && s.charAt(right) == s.charAt(index)) right+=1;
        while (left >= 0 && s.charAt(left) == s.charAt(index)) left-=1;
        while (left >= 0 && right <= maxIndex){
            if (s.charAt(left) == s.charAt(right)){
                left-- ;
                right++ ;
            }else{
                break ;
            }
        }
        return s.substring(left+1, right) ;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
