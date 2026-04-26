package Array;

import javax.swing.text.DefaultEditorKit;
import java.util.Arrays;

public class Array_Insert {
    static int[] Insert(int[] arr, int n, int x, int cap, int pos){
        if(n == cap){
            return arr;
        }
        for(int i = n - 1;i >= pos-1; i--){
            arr[i+1] = arr[i];
        }
        arr[pos-1] = x;
        return arr;
    }
    public static void main(String [] args){
        int [] arr = new int[5];
        arr[0] = 1;
        arr[1] = 4;
        arr[2] = 16;
        arr[3] = 8;
        System.out.println(Arrays.toString(Insert(arr, 4,10,5,2)));
    }
}
