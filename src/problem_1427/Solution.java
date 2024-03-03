package problem_1427;

class Solution {
    public String stringShift(String s, int[][] shift) {
        Integer steps = calSteps(shift) % s.length() ;
        if ( steps < 0 ) {
            steps += s.length() ;
        }
        return s.substring(steps,s.length())+s.substring(0,steps) ;
    }
    public Integer calSteps(int[][] shift){
        int result = 0 ;
        for (int i = 0; i < shift.length ; i++) {
            if ( shift[i][0] == 0 ){
                result += shift[i][1] ;
            }else {
                result -= shift[i][1] ;
            }
        }
        return result ;
    }
}