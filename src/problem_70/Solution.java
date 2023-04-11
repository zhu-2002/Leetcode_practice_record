package problem_70;
// 爬楼梯
class Solution {
    // 空间开销太大，过不了，但是思想没问题
//    public int climbStairs(int n) {
//        if( n == 1 ){
//            return 1 ;
//        }
//        if( n == 2 ){
//            return 2 ;
//        }
//        return climbStairs(n-1)+climbStairs(n-2) ;
//    }
    // 也就是斐波那契数列，可以直接使用循环
    public int climbStairs(int n) {
        int[] arr = new int[n+1] ;
        arr[0] = 1 ;
        arr[1] = 1 ;
        for ( int i = 2 ; i <= n ; i++ ) {
            arr[i] = arr[i-1] + arr[i-2] ;
        }
        return arr[n] ;
    }
}