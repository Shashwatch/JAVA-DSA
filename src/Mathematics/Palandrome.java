package Mathematics;

import java.util.*;

public class Palandrome {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        int result = 0;
        while (temp > 0){
            result *=10;
            result = result + temp %10;
            temp = temp /10;
        }
        if(result == num) {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
