package questions;

import java.util.HashMap;
import java.util.Map;

/*
find number of occurences in a string,array, or a list
 */
public class Q023 {
    public static void main(String[] args) {
        String str = "aaaaaaaaaaaabbbbbasdmnhghggghjahsgajh";
        Map<String,Integer> numOfOccrs = numOfOccurences(str);

        System.out.println("a:"+numOfOccrs.get("a"));

    }
    public static Map<String,Integer> numOfOccurences(String str){
        Map<String,Integer> nums = new HashMap<>();
        for(String w:str.split("")) {
            nums.put(w, nums.getOrDefault(w, 0) + 1);
        }
        return nums;
    }
}
