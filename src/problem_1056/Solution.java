package problem_1056;

class Solution {
    public boolean confusingNumber(int n) {
        int reserveNum = 0 ;
        int originNum = n ;
        for (int i = 0; originNum != 0 ; i++) {
            int num = originNum%10 ;
            if ( canReserve(num) == false ){
                return false ;
            }{
                reserveNum = reserveNum*10 + getReserve(num) ;
            }
            originNum /= 10 ;
        }
        if ( reserveNum == n ){
            return false ;
        }
        return true ;
    }
    public boolean canReserve(int num){
        if ( num == 0 || num == 1|| num == 6|| num == 8|| num == 9){
            return true ;
        }
        return false ;
    }
    public int getReserve(int num){
        if ( num == 6 ) {
            return 9 ;
        } else if ( num == 9 ) {
            return 6 ;
        }
        return num ;
    }
}
