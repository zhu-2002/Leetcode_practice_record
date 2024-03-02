package problem_624;

import java.util.*;

class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int min = Integer.MAX_VALUE-1 ;
        int min_l = min ;
        int max = Integer.MIN_VALUE ;
        int max_l = max ;
        int len = 0 ;
        int min_index = 0 ;
        int max_index = 0 ;
        for (int i = 0; i < arrays.size(); i++) {
            len = arrays.get(i).size() ;
            if ( min > arrays.get(i).get(0) ){
                min_l = min ;
                min = arrays.get(i).get(0) ;
                min_index = i ;
            } else if ( min_l > arrays.get(i).get(0) ) {
                min_l = arrays.get(i).get(0) ;
            }
            if ( max < arrays.get(i).get(len-1) ){
                max_l = max ;
                max = arrays.get(i).get(len-1) ;
                max_index = i ;
            }else if ( max_l < arrays.get(i).get(len-1) ) {
                max_l = arrays.get(i).get(len-1) ;
            }
        }
        if ( min_index == max_index ){
            return Math.max(Math.abs(max_l-min),Math.abs(max-min_l)) ;
        }else{
            return Math.abs(max-min) ;
        }

    }
}