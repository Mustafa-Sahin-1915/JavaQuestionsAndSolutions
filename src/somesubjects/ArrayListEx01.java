package somesubjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListEx01 {
    public static void main(String[] args) {
        List arr = new ArrayList(Arrays.asList("A","B","C"));
        ArrayList<String> arr2 = new ArrayList<>(arr);
        List<String> arr3 = new ArrayList<>(Arrays.asList("A","B","C"));

        System.out.println(arr.equals(arr2)); //return true
        System.out.println(arr2.equals(arr3)); // return true

        List<String> a1 = new ArrayList<>();
        a1.add("A");
        a1.add("B");
        List<String> a2 = new ArrayList<>();
        a2.add("A");
        a2.add("B");
        System.out.println(a1.equals(a2)); //return true
    }
}
