import java.util.*;
class PrintDuplicateInList{
	public static void main(String[] args){
		 List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(2);
        list.add(7);
        list.add(8);
        list.add(8);
        list.add(3);

        System.out.println("Duplicate numbers in the list:");
		
		for(int i=0;i<list.size();i++){
			for(int j=i+1;j<list.size();j++){
				if(list.get(i) == list.get(j)){
					System.out.println(list.get(i));
				}
			}
		}
	}
}