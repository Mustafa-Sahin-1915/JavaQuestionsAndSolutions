package questions;

import java.util.Arrays;


/*
Write a return method that can reverse String
ex:reversed("ABCD") => DCBA
*/

public class Q003 {
    static StringBuffer sbs = new StringBuffer(); //thread-safe
    public static void main(String[] args) {
        System.out.println(reverse("ABCD"));
        System.out.println(reverse2("ABCD"));
        System.out.println(reverse3("ABCD"));
        System.out.println(reverse4("ABCD"));
        System.out.println(reverse5("ABCD"));

    }
    public static void A(){ //[A][B][][][][][][][]

            sbs.append("A");

    }
    public static void B(){
        sbs.append("B");
    }
    public static String reverse(String s){ //"ABCD"
        StringBuilder sb =new StringBuilder(); //thread-unsafe
        //String result = "";
        for (int i = s.length()-1; i >=0 ; i--) {
            sb.append(s.charAt(i));
            //result+=s.charAt(i);
        }//D,C,B,A
        return sb.toString(); //"DCBA"
        // return result;
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
    }//"ABCD"
    public static String reverse5(String s){
        return Arrays.stream(s.split("")).reduce("",(t,u)->u+t).toString();
    }
}
