package Mathematics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sieve_of_Eratosthenes {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        List<Boolean> arr = new ArrayList<>();
        for(int i=0;i<=num;i++){
            arr.add(true);
        }
        arr.set(0,false);
        arr.set(1,false);

        for(int i=2;i<=num;i++) {
            if(arr.get(i)){
                for(int j = i*i;j<=num;j = j + i){
                    arr.set(j, false);
                }
            }
        }
        for(int i=2;i<=num;i++){
            if(arr.get(i) == true){
                System.out.println(i);
            }
        }
    }
}
