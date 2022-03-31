package questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
Write a return method that can sort an int array in ascending order
without using the sort method of the Arrays class
 */
public class Q008 {
    public static void main(String[] args) {
        int arr[]={1,-4,-6,0,2,5,8,};
        arr = sortIt3(arr);
        System.out.println(Arrays.toString(arr));
    }
    //Selection Sort Time Complexity : O(n^2), time complexity worst: O(n^2)
    public static int[] sortIt(int[] arr){
        int min_idx =-1;
        int temp =0;
        for (int i = 0; i < arr.length-1; i++) {
            min_idx=i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[min_idx]>arr[j]) {min_idx=j;}
            }
            temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx]= temp;
        }
        return arr;
    }
    //Insertion Sort Time Complexity : O(n) time complexity worst :O(n^2)
    public static int[] sortIt2(int[] arr){
        int n =arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j=i-1;
            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        return arr;
    }
    public static int[] sortIt3(int[] arr){

        ArrayList<Integer> arrList = new ArrayList<>();
        for (int w:arr){
            arrList.add(w);
        }
        for (int i = 0; i < arr.length; i++) {
            Integer g = arrList.stream().min(Integer::compare).get();
            arr[i] = g.intValue();
            arrList.remove(g);
        }
        return arr;
    }

}
