package questions;

import java.util.*;

/*

Write a return method that can find the frequency of characters
frequencyOfChars("AAABBCDD") =>A3B2C1D2

 */
public class Q005 {
    public static void main(String[] args) {
        System.out.println(frequencyOfChars("AAABBCDD"));
        System.out.println(frequencyOfChars2("AAABBCDD"));
        System.out.println(frequencyOfChars3("AAABBCDD"));
    }
    public static String frequencyOfChars(String s){
        if (s==null) return null;
        String result ="";
        char charsOfS[] = s.toCharArray();
        int count =0;
        for (int i = 0; i < charsOfS.length; i++) {
            count=0;
            for (int j = 0; j < charsOfS.length; j++) {
                if (charsOfS[i]==charsOfS[j]){
                    count++;
                }
            }
            if (!result.contains(""+charsOfS[i])){
                result +=(""+charsOfS[i]+count);
            }
        }
        return result;
    }
    public static String frequencyOfChars2(String s){
        if (s==null) return null;
        List<String> listOfChars = Arrays.asList(s.split("")); //AAABBCDD
        String result ="";
        int frequency=0;
        for(String w:listOfChars){
            if (result.contains(w)) continue;
            frequency = Collections.frequency(listOfChars,w);
            result +=(w + frequency);

        }
        return result;
    }
    public static String frequencyOfChars3(String s){
        if (s==null) return null;
        HashMap<Character,Integer> freqOfChars = new HashMap<>();
        char charsOfS[] = s.toCharArray();
        for (int i = 0; i < charsOfS.length; i++) {
            if (freqOfChars.get(charsOfS[i])==null){
                freqOfChars.put(charsOfS[i],1);
            }else{
                freqOfChars.put(charsOfS[i],freqOfChars.get(charsOfS[i])+1);
            }
        }
        StringBuilder sb = new StringBuilder();

        for(Map.Entry<Character,Integer> w:freqOfChars.entrySet()){
            sb.append(w.getKey());
            sb.append(w.getValue());
        }
        return sb.toString();
    }
}

