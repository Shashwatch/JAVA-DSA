package Array;

public class Check_sorted_array {
    static String fun(int []arr, int n){
        for(int i=0; i<n-1;i++){
            if(arr[i] > arr[i+1]){
                return "NO";
            }
        }
        return "YES";
    }
    public static void main(String [] args){
        int []arr = {1,2,3,4,5};
        int n = arr.length;
        System.out.println(fun(arr,n));
    }
}
