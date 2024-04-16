import java.util.*;
class IterateCollection{
	public static void main(String[] args){
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		Iterator it = list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}