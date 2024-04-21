

class CountVowelInString{
	public static void main(String[] args){
		String s ="Hello Java";
		System.out.println(countVowel(s));
	}
	
	public static int countVowel(String s){
		int count =0;
		char[] ch= s.toCharArray();
		for( char c : ch){
			if(c=='a' || c=='e' || c=='i'|| c=='o'|| c=='u'|| c=='A'|| c== 'E'|| c== 'I'|| c=='O'|| c== 'U'){
				count++;
			}
		}
		return count;
	}
}