package problem_186;

/*
 * https://leetcode.cn/problems/reverse-words-in-a-string-ii/
 */

class Solution {
    public void reverseWords(char[] s) {
        int n = s.length;
        swapSeries(s, 0, n-1);
        int pre = 0;
        for (int i = 0; i < n; i ++) {
            if (s[i] == ' ') {
                swapSeries(s, pre, i-1);
                pre = i+1;
            }
        }
        swapSeries(s, pre, n-1);
    }
    void swapSeries(char[] s, int from, int end) {
        for (int i = 0; from+i<end-i;i++) {
            swap(s, from+i, end-i);
        }
    }
    void swap(char[] s, int i, int j) {
        s[i] ^= s[j];
        s[j] ^= s[i];
        s[i] ^= s[j];
    }
}

