package Demo3;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListDemo {
   public static void main(String[] args) {
    LinkedList<String> ll = new LinkedList<>();
    ll.add("DInga");
    ll.add("Ranga");

    ArrayList<String> al = new ArrayList<>(ll);

    al.forEach(System.out::println);
   } 
}
