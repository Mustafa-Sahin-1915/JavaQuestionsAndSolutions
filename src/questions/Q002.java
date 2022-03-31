package questions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
Write a return method that can remove the duplicated values
from String
Ex: removeDup("AAAABBBCCC") = "ABC"
 */
public class Q002 {
    public static void main(String[] args) {
        System.out.println(removeDup("AAAABBBCCC"));
        System.out.println(removeDup2("AAAABBBCCC"));
        System.out.println(removeDup3("AAAABBBCCC"));
        System.out.println(removeDup4("AAAABBBCCC"));
    }
    public static String removeDup(String s){
        if (s==null) return null;
        StringBuilder snew = new StringBuilder();
        char schars[] = s.toCharArray();
        for (int i=0;i<schars.length;i++){

            if (snew.indexOf(String.valueOf(schars[i]))==-1){
                snew.append(schars[i]);
            }
        }
        return snew.toString();
    }
    public static String removeDup2(String s){
        if (s==null) return null;
        String result ="";
        while(s.length()>0){
            if (!result.contains(s.substring(0,1))){
                result +=s.substring(0,1);
                s = s.replaceAll(s.substring(0,1),"");
            }
        }
        return result;
    }
    public static String removeDup3(String s){
        if (s==null) return null;
        String result ="";
        for (int i = 0; i < s.length(); i++) {
            if (!result.contains(s.substring(i,i+1))){
                result+=s.substring(i,i+1);
            }
        }
        return result;
    }
    public static String removeDup4(String s){
        if (s==null) return null;

        HashSet<String> uniqueChars = new HashSet<String>(Arrays.asList(s.split("")));

        StringBuilder sb = new StringBuilder();
        for (String w:uniqueChars){
            sb.append(w);
        }

        return sb.toString();
    }
}
