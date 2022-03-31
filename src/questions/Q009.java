package questions;

import java.util.Arrays;

/*
Write a function that given an integer N(1<N<100),
returns an array containing N unique integers that sum up to 0.
The function can return any such array. for ex: N=4
the function could return
[1-0,-3,2]
[-2,1,-4,5]
[1,-1,1,3] would be incorrect because 1 occurs twice.
N=3 one of the possible answers is [-1,0,1]

 */
public class Q009 {
    public static void main(String[] args) {
        int n=5;
        int arr[] = sumUpToZero(n);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] sumUpToZero(int n){
        int arr[] = new int[n];

        if (n%2!=0) {
            arr[n/2]=0;
        }
        for (int i = 0; i < n/2; i++) {
            arr[i] = (i+1);
            arr[n-i-1] = -(i+1);
        }
        return arr;
    }
}
