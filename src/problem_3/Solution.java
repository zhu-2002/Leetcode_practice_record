package problem_3;

// 3. 无重复字符的最长子串
import java.util.HashSet;
// 滑动窗口
// 窗口放在hashmap中
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<Character>();
        int left = 0;
        int right = 0;
        int result = 0;
        while (right < s.length()) {
            char c = s.charAt(right++);
            while (set.contains(c)) {
                set.remove(s.charAt(left++));
            }
            set.add(c);
            result = Math.max(result, set.size());
        }
        return result;
    }
}