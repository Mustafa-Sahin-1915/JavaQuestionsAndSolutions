package questions;

/*
Given an array of n characters  ex:"ABCD" n=4
print all permutation from the given characters
 */
public class Q015 {
    public static void main(String[] args) {
        String s = "ABCD";
        permutationGenerate2(s);
    }
    public static void permuteString(String s){
        permutationGenerate(s, 0, s.length());
    }
    public static String swap(String s,int i,int j){
        char chars[] = s.toCharArray();
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
        return String.valueOf(chars);
    }
    public static void permutationGenerate(String s,int start, int end){
        if (start == end-1){
            System.out.println(s);
        }else{
            for (int i = start; i < end ; i++) {
                s = swap(s,start,i);
                permutationGenerate(s,start+1,end);
                s = swap(s,start,i);
            }
        }
    }
//---------------------- Second My Way (Mustafa Sahin)-----------------------------------
    public static void permutationGenerate2(String s){
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
                printPermutation(s,counter);
            }
        }
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
    public static void printPermutation(String s, int[] counter){
        for (int w:counter) {
            System.out.print(s.charAt(w));
        }
        System.out.println();
    }
}
