package Mathematics;

import java.util.Scanner;

public class Greatest_common_divisor {

    static int GDivisor(int num1, int num2){
        int d = Math.min(num1, num2);
        while(d>1){
            if(num1%d == 0 && num2%d == 0){
                return d;
            }
            d--;
        }
        return 1;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int result = GDivisor(num1,num2);
        System.out.println(result);
    }
}
