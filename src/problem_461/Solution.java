package problem_461;
// 461. 汉明距离
class Solution {
    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x^y) ;
    }
}