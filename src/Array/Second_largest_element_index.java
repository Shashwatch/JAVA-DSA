package Array;

public class Second_largest_element_index {
    static int fun(int []arr, int n){
        int max1;
        int max2;
        if(arr[0] > arr[1]){
            max1 = 0;
            max2 = 1;
        }else{
            max2 = 0;
            max1 = 1;
        }
        for(int i = 2;i<n;i++){
            if(arr[max1] > arr[i] && arr[max2] < arr[i]){
                max2 = i;
            } else if (arr[max1] < arr[i]) {
                max2 = max1;
                max1 = i;
            }
        }
        return max2;
    }
    public static void main(String []args){
        int [] arr = {10,5,100,5,12,6,30};
        int n = 7;
        System.out.println(fun(arr,n));
    }
}
