package EpamCoding;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuiplicateNumber {
    public static void main(String[] args) {
        int[] n= {1,2,3,2,5,4,5};
        List<Integer> list  = removeDuplicate(n);
        list.forEach(System.out::print);
        System.err.println();
        List<Integer> l = misingDigit(n);
        l.forEach(System.out::print);

    }

    public static <Intrger> List<Integer> removeDuplicate(int[] n){
        Set<Integer> seen = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for (int integer : n) {
            if (!seen.add(integer)) {
                list.add(integer);
            }
        }
        return list;
    }

    public static List<Integer> misingDigit(int[] n){
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        
        for (Integer integer : n) {
            set.add(integer);
        }
        for (int i = 0; i <= 9; i++) {
            if (!set.contains(i)) {
                list.add(i);
            }
        }
        return list;
    }
}
