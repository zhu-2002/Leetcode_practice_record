package problem_169;

import java.util.HashMap;

// 169. 多数元素
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>() ;
        for (int i = 0; i < nums.length ; i++) {
            if ( map.containsKey(nums[i]) ){
                map.put(nums[i],map.get(nums[i])+1) ;
            }else{
                map.put(nums[i],1) ;
            }
        }

        for (  int num : map.keySet() ) {
            if( map.get(num) > nums.length/2 ){
                return map.get(num) ;
            }
        }
        return 0 ;
    }
}