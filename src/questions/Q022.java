package questions;

import java.util.*;

/*
interview question: find duplicates or uniques in a string, array or list!
 */
public class Q022 {
    public static void main(String[] args) {
        String str = "AAABBBCCCDEFFFFG";
        System.out.println(findDuplicatesWithSet1(str));
        System.out.println(findUniquesWithSet1(str));
        findUniquesAndDuplicatesWithMap2(str);
    }
    public static Set<Character> findDuplicatesWithSet1(String str){
        Set<Character> setOfChars = new LinkedHashSet<>();
        Set<Character> setOfDuplicates = new LinkedHashSet<>();
        for (int i=0;i<str.length();i++){
            if (!setOfChars.add(str.charAt(i))){
                setOfDuplicates.add(str.charAt(i));
            }
        }
        return setOfDuplicates;
    }
    public static Set<Character> findUniquesWithSet1(String str){
        Set<Character> setOfDuplicates = findDuplicatesWithSet1(str);
        Set<Character> setOfUniques = new LinkedHashSet<>();
        for (int i = 0; i < str.length(); i++) {
            if(!setOfDuplicates.contains(str.charAt(i))){
                setOfUniques.add(str.charAt(i));
            }
        }
        return setOfUniques;
    }
    public static void findUniquesAndDuplicatesWithMap2(String str){
        Map<Character,Integer> countsOfChars = new HashMap<>();
        List<Character> duplicates = new ArrayList<>();
        List<Character> uniques = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            countsOfChars.put(str.charAt(i),countsOfChars.getOrDefault(str.charAt(i),0)+1);
        }
        for (Map.Entry<Character,Integer> w:countsOfChars.entrySet()){
            if (w.getValue()>1){
                duplicates.add(w.getKey());
            }else{
                uniques.add(w.getKey());
            }
        }
        System.out.println(duplicates);
        System.out.println(uniques);
    }
}
