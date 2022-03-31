package questions;

import java.util.Arrays;

/*
Write a return method that check if a string is build out
of the same letters as another string.
Ex: same("abc","cab") =>true , same("abc","abb") = > false
 */
public class Q001 {
    public static void main(String[] args) {
        System.out.println(same("abc","cab"));
        System.out.println(same("abc","abb"));
    }
    public static boolean same(String s1,String s2){
        if (s1==null || s2==null) {
            return false;
        }
        if (s1.length()!=s2.length()){
            return false;
        }
        char s1chars[] = s1.toCharArray();
        char s2chars[] = s2.toCharArray();
        Arrays.sort(s1chars);
        Arrays.sort(s2chars);
        String s1new = new String(s1chars);
        String s2new = new String(s2chars);
        if (s1new.equals(s2new)){
            return true;
        }
        return false;
    }
}
