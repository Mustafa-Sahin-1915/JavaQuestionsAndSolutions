package questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q024 {
    public static void main(String[] args) {
        String[] s = {"aaa","bbb","cccc","d"};
        List<String> slist = new ArrayList<>(Arrays.asList(s));
        if (slist.removeIf(t->{
            System.out.println(t);
            return t.length()<2;
        })){
            System.out.println("removed");
        }
        System.out.println(slist);
    }
}
