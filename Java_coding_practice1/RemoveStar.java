
import java.util.*;
class RemoveStar{
	public static void main(String[] args){
		String s = "vcs** chjd**jkjh***";
		String str = removeStar(s);
		System.out.println(str);
		
	}
	
	public static String removeStar(String s){
		char[] ch = s.toCharArray();
		StringBuilder sb = new StringBuilder();
		Stack<Character> st = new Stack<Character>();
		
		
		for(int i=0;i<ch.length;i++){
			if(ch[i] == '*'){
				st.pop();
			}else{
				st.push(ch[i]);
			}
		}
		//copy all the element in the StringBuilder
		while(st.size() != 0){
			sb.append(st.pop());
		}
		//converted into the String and reverse it
		String str = sb.reverse().toString();
		//remove all the white space
		return str.replaceAll("\\s","");
	}
}