package questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

/*
Given a list of people's names: ["Ahmed", "John", "Eric",...]

write a method to remove all the names names Ahmed
 */
public class Q013 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Ahmed");
        names.add("John");
        names.add("Eric");
        names.add("Ahmed");

        names = removeAll4(names, "Ahmed");
        System.out.println(names);
    }

    public static List<String> removeAll(List<String> names, String removedName) {
        List<String> names2 = new ArrayList<>();
        for (String w : names) {
            if (!w.equals(removedName)) {
                names2.add(w);
            }
        }
        return names2;
    }

    public static List<String> removeAll2(List<String> names, String removedName) {

        ListIterator<String> liter = names.listIterator();
        while (liter.hasNext()) {
            if (liter.next().equals(removedName)) {
                liter.remove();
            }
        }
        return names;
    }

    public static List<String> removeAll3(List<String> names, String removedName) {
        names.removeIf(t->t.equals(removedName));
        return names;
    }
    public static List<String> removeAll4(List<String> names, String removedName) {
        names.removeAll(Arrays.asList(removedName));
        return names;
    }

}
