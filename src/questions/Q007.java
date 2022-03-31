package questions;

/*
write a method that find the maximum number from an int array
 */

import java.util.Arrays;

public class Q007 {
    public static void main(String[] args) {
        int arr[]={1,-4,-6,0,2,5,8,};
        System.out.println(max(arr));
        System.out.println(max2(arr));
        System.out.println(max3(arr));
    }
    public static int max(int[] arr){
        int maxResult = Integer.MIN_VALUE;
        for (int w:arr){
            maxResult = Math.max(maxResult,w);
        }
        return maxResult;
    }
    public static int max2(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
    public static int max3(int[] arr){
        return Arrays.stream(arr).max().getAsInt();
    }


}
