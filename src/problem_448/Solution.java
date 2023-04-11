package problem_448;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// 448. 找到所有数组中消失的数字
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>() ;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>() ;
        for (int i = 0; i < nums.length ; i++) {
            map.put(nums[i],1) ;
        }
        for (int j = 1; j < nums.length + 1 ; j++) {
            if ( !map.containsKey(j) ){
                result.add(j) ;
            }
        }
        return result ;
    }
}