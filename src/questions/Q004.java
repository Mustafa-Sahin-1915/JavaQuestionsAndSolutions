package questions;

import java.util.*;

/*
Write a return method  that can find the unique characters from the String
Ex:unique("AAAABBBCCCDEF") => "DEF"
 */
public class Q004 {
    public static void main(String[] args) {
        System.out.println(unique("AAAABBBCCCDEF"));
        System.out.println(unique2("AAAABBBCCCDEF"));
        System.out.println(unique3("AAAABBBCCCDEF"));
        System.out.println(unique4("AAAABBBCCCDEF"));
    }
    public static String unique(String s){
        if (s==null) return null;
        HashMap<Character,Integer> counts = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (counts.get(s.charAt(i))==null){
                counts.put(s.charAt(i),1);
            }else{
                counts.put(s.charAt(i),counts.get(s.charAt(i))+1);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Character,Integer> w: counts.entrySet()){
            if (w.getValue()==1){
                sb.append(w.getKey());
            }
        }
        return sb.toString();
    }
    public static String unique2(String s){
        String result="";
        while(s.length()>0){
            if (s.substring(1).contains(s.substring(0,1))){
                s = s.replaceAll(s.substring(0,1),"");
            }else{
                result +=s.substring(0,1);
                s = s.substring(1);
            }
        }
        return result;
    }
    public static String unique3(String s){ //AAAABBBCCCDEF
        if (s==null) return null;
        StringBuilder sb = new StringBuilder();
        char schars[] = s.toCharArray();
        int count =0;
        for (int i = 0; i < schars.length; i++) {   // time complexity of code : O(n^2)
            count=0;
            for (int j = 0; j <schars.length ; j++) {
                if (schars[i]==schars[j]){
                    count++;
                }
            }
            if (count==1){
                sb.append(schars[i]);
            }
        }
        return sb.toString();
    }
    public static String unique4(String s){
        if (s==null) return null;
        StringBuilder sb = new StringBuilder();

        List<String> charList= Arrays.asList(s.split(""));//AAAABBBCCCDEF
        for (String w:charList) {
            if (Collections.frequency(charList,w)==1){
                sb.append(w);
            }
        }
        return sb.toString();
    }
    public static String unique5(String s){
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.indexOf(s.charAt(i))==s.lastIndexOf(s.charAt(i))){
               result += s.charAt(i);
            }
        }
        return result;
    }
}
