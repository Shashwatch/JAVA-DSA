package Mathematics;

import java.util.Scanner;

public class Factorial_with_trailing_zeros {
    static int fact(int n){
        if(n == 0){
            return 1;
        }
        return n * fact(n -1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int factorial = fact(num);
        System.out.println(factorial);
        int count = 0;
        while(factorial > 0){
            if(factorial%10 == 0){
                count += 1;
                factorial = factorial/10;
            }
            else{
                break;
            }
        }
        System.out.println(count);
    }
}
