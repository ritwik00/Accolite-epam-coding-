package Demo2;

import java.util.Stack;

public class BalancedBrackets {
    public static void main(String[] args) {
        String str1 = "( { [ ] } )";
        String str2 = "( { [ ] ) }";

        System.out.println(isBalanced(str1)); // true
        System.out.println(isBalanced(str2)); // false
    }

    public static boolean isBalanced(String s) {
        Stack<Character> stack=new Stack();
        for(char parenthesis : s.toCharArray()){
            if(parenthesis == '(' || parenthesis == '{' || parenthesis == '['){
                stack.push(parenthesis);
            }else if (stack.empty()) {
				return false;
            }else if ((parenthesis == ')' && stack.pop() != '(') || (parenthesis == ']' && stack.pop() != '[')
					|| (parenthesis == '}' && stack.pop() != '{')) {
				return false;
			}
        }
        
		return stack.isEmpty();
      }
}
