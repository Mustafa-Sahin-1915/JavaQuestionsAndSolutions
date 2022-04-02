package questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

/*
given a list 1,2,3,4,...etc.
remove all elements greater than 100
 */
public class Q014 {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        Integer n;
        for (int i = 0; i < 20; i++) { //
            n  = (int)(Math.random()*200)+1;
            l.add(n);
        }
        System.out.println(l);
        l =removeAllElements(l,100);
        System.out.println(l);
    }
    public static List<Integer> removeAllElements(List<Integer> l, Integer n){
        List<Integer> l2 = new ArrayList<>();
        for (Integer w : l) {
            if (w<n) {
                l2.add(w);
            }
        }
        return l2;
    }
    public static List<Integer> removeAllElements2(List<Integer> l, Integer n){
        ListIterator<Integer> liter = l.listIterator();
        while (liter.hasNext()) {
            if (liter.next()>n) {
                liter.remove();
            }
        }
        return l;
    }
    public static List<Integer> removeAllElements3(List<Integer> l, Integer n){
        l.removeIf(t->t>n);
        return l;
    }

}
