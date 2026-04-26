package Array;

import java.util.Arrays;

public class Reverse_array {
    static int[] fun(int [] arr, int n){
        int temp;
        for(int i = 0, j = n -1; i<n/2; i++,j--){
            if(i == j){
                return arr;
            }
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }
    public static void main(String [] args){
        int []arr = {10,20,30};
        int n = arr.length;
        System.out.println(Arrays.toString(fun(arr, n)));
    }
}
