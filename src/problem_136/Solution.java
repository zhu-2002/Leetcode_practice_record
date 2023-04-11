package problem_136;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

// 只出现一次的数字

//class Solution {
//    public int singleNumber(int[] nums) {
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int num : nums) {
//            if (map.containsKey(num)){
//                map.remove(num);
//            } else {
//                map.put(num, 1);
//            }
//        }
//        Set<Integer> set = map.keySet();
//        return set.iterator().next() ;
//    }
//}

// 异或求解
class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length ; i++)
        {
            result ^= nums[i];
        }
        return result;
    }
}
