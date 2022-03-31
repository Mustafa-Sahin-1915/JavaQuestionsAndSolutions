package questions;

import java.util.Comparator;

/*
Writea return method that can reverse String
ex:reversed("ABCD") => DCBA

 */
public class Q003 {
    public static void main(String[] args) {
        System.out.println(reverse("ABCD"));
        System.out.println(reverse2("ABCD"));
        System.out.println(reverse3("ABCD"));
        System.out.println(reverse4("ABCD"));
    }
    public static String reverse(String s){
        StringBuilder sb =new StringBuilder();
        for (int i = s.length()-1; i >=0 ; i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
    public static String reverse2(String s){
        StringBuilder sb =new StringBuilder(s);
        sb.reverse();
        return sb.toString();
    }
    public static String reverse3(String s){
       StringBuilder sb = new StringBuilder();
       while(s.length()>0){
            sb.append(s.charAt(s.length()-1));
            s = s.substring(0,s.length()-1);
       }
       return sb.toString();
    }
    public static String reverse4(String s){
        return new StringBuffer(s).reverse().toString();
    }
}
