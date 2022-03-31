package questions;

import java.util.Arrays;
import java.util.Collection;
import java.util.TreeSet;

/*
Write a return method that checks if a string is build out
of the same letters as another string.
Ex: same("abc","cab") =>true , same("abc","abcc") = > false
 */
public class Q001 {
    public static void main(String[] args) {
//        System.out.println(same("abc","cab"));
//        System.out.println(same("abc","abb"));
//
//        System.out.println(same2("abc","cab"));
//        System.out.println(same2("abc","abb"));
//
//        System.out.println(same3("abc","cab"));
//        System.out.println(same3("abc","abb"));
//
//        System.out.println(same4("abc","cab"));
//        System.out.println(same4("abc","abb"));

        System.out.println(same4("aabc","abbc"));//false
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
    public static boolean same2(String s1,String s2){
        if (s1==null || s2==null) {
            return false;
        }
        if (s1.length()!=s2.length()){
            return false;
        }

        while(s2.length()>0 && s1.length()>0){
            if (s2.contains(s1.substring(0,1))) {
                s2 = s2.replace(s1.substring(0, 1), "");//
            }
            s1 = s1.substring(1);
        }
        return s1.length()==s2.length();
    }
    public static boolean same3(String s1,String s2){
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

        return Arrays.equals(s1chars,s2chars);
    }


}
