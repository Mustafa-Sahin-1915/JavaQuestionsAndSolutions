package questions;

import java.util.Arrays;
import java.util.List;

/*
given two ordered arrays, merge them breaking the order
ex: [1,4,6,8]
    [3,5,6,7];  =>[1,3,4,5,6,6,7]
 */
public class Q020 {
    public static void main(String[] args) {
        int arr1[]={1,4,6,8};
        int arr2[]={3,5,6,7};

        int res[] = mergeArrays(arr1,arr2);
        System.out.println(Arrays.toString(res));
    }

    public static int[] mergeArrays(int arr1[], int arr2[]) {
        int mergedArray[] = new int[arr1.length + arr2.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<arr1.length && j<arr2.length){
            if (arr1[i]<=arr2[j]){
                mergedArray[k++] = arr1[i];
                i++;
            }else {
                mergedArray[k++] = arr2[j];
                j++;
            }
        }
        if (i< arr1.length) {
            mergedArray[k] = arr1[i];
        }else{
            mergedArray[k] = arr2[j];
        }
        return mergedArray;
    }

    public static int[] mergeArrays2(int arr1[], int arr2[]) {

        return null;
    }
}
