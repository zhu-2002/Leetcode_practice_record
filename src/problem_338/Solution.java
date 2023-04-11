package problem_338;
// 338. 比特位计数
class Solution {
    public int[] countBits(int n) {
        int[] res = new int[n] ;
        for (int i = 0; i < n ; i++) {
            res[i] = Integer.bitCount(i) ;
        }
        return res ;
    }
}