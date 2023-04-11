package problem_20;
//20.有效的括号
import java.util.Stack;

public class Solution {
    public boolean isValid(String s){
        Stack<Character> stack = new Stack<Character>() ;
        for( char c : s.toCharArray() ){
            if( c == '(' ){
                stack.push(')') ;
            } else if ( c == '[') {
                stack.push(']') ;
            } else if ( c == '{') {
                stack.push('}') ;
            }else if ( stack.isEmpty() || stack.pop() != c ){
                return false ;
            }
        }
        return stack.isEmpty() ;
    }
}
