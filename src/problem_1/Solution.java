package problem_1;

import java.util.HashMap;

//两数之和
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hashTable = new HashMap<Integer,Integer>() ;
        for (int i = 0; i < nums.length; i++) {
            if ( hashTable.containsKey((target-nums[i])) ) {
                return  new int[]{ hashTable.get(target -nums[i]) , i } ;
            }
            hashTable.put(nums[i],i) ;
        }
        return new int[2] ;
    }
}