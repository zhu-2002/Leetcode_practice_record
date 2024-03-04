package problem_1133;

import java.util.HashMap;

/*
* https://leetcode.cn/problems/largest-unique-number
*/

class Solution {
    public int largestUniqueNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>() ;
        int res = -1 ;
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1) ;
        }
        for (int key :
                map.keySet()) {
            if ( map.get(key) == 1 && key > res ){
                res = key ;
            }
        }
        return res ;

    }
}