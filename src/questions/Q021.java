package questions;
/*
Amazon interview question
string permutation
write a method that takes string and two integer index value as a parameter
then print out on the console all permutations of that string.
these permutations must be done on bounded part of the string which is from startindex to endindex.
Both indexes are inclusive.

permute("ABCD",1,2);  => ABCD, ACBD

 */

import java.util.ArrayList;
import java.util.List;


public class Q021 {
    public static void main(String[] args) {
        String str = "abcdefg";
        permute(str,2,4);
        System.out.println("------------------------");
        permute2(str,2,4);

    }
    public static void permute(String s, int startindex,int endindex){
        List<String> listOfPermutations;
        String subPart = s.substring(startindex,endindex+1);
        listOfPermutations = permutationGenerate(subPart);
        String newS="";
        for (String w:listOfPermutations){
            newS = s.replace(subPart,w);
            System.out.println(newS);
        }
    }
    public static List<String> permutationGenerate(String s){
        List<String> listOfPermutations = new ArrayList<>();
        int n = s.length();
        char chars[] = s.toCharArray();
        int counter[] = new int[n];
        boolean isCounterZero = false;
        boolean isCounterDistinct = false;
        while(!isCounterZero){
            while(true){
                counter = click(counter);
                isCounterDistinct = isDistinct(counter);
                isCounterZero = isZeroAgain(counter);
                if (isCounterDistinct || isCounterZero) break;
            }
            if (!isCounterZero){
                listOfPermutations.add(printOutPermutation(s,counter));
            }
        }
        return listOfPermutations;
    }

    public static int[] click(int[] counter){
        int a;
        int b=1;
        for (int i = counter.length-1; i >=0 ; i--) {
            a=(counter[i]+b)%counter.length;
            counter[i]= a;
            if (a==0){
                b=1;
            }else{
                b=0;break;
            }
        }
        return counter;
    }
    public static boolean isDistinct(int[] counter){
        boolean res = true;
        int leftindex =-1;
        int rightindex =-1;
        for (int i = 0; i < counter.length; i++) {
            leftindex=-1;
            rightindex=-1;
            for (int j = 0; j < counter.length; j++) {
                if (counter[i]==counter[j]) leftindex=j;
            }
            for (int k = counter.length-1; k >=0;k--) {
                if (counter[i]==counter[k]) rightindex=k;
            }
            if (leftindex!=rightindex) return false;
        }
        return true;
    }
    public static boolean isZeroAgain(int[] counter){
        for (int i = 0; i < counter.length; i++) {
            if (counter[i]!=0) return false;
        }
        return true;
    }
    public static String printOutPermutation(String s, int[] counter){
        StringBuilder sb = new StringBuilder();
        for (int w:counter) {
            sb.append(s.charAt(w));
        }
        return sb.toString();
    }
    //------------------------------------------------
    //recursive version of permutation
    public static String swapLetters(String str,int startIndex,int endIndex){
        char[] chars = str.toCharArray();
        char temp = chars[startIndex];
        chars[startIndex] = chars[endIndex];
        chars[endIndex] = temp;
        return String.valueOf(chars);
    }
    public static void permute2(String s,int startIndex,int endIndex){
        if (startIndex==endIndex){
            System.out.println(s);
        }else{
            for (int i = startIndex; i <= endIndex; i++) {
                s=swapLetters(s,startIndex,i);
                permute(s,startIndex+1,endIndex);
                s=swapLetters(s,startIndex,i);
            }
        }
    }
}
