package Mathematics;

import java.util.Scanner;

public class LCM {
    static int gcd(int a, int b){
        if(b == 0){
            return a;
        }
        else{
            return gcd(b,a%b);
        }
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(num1 * num2 / gcd(num1,num2));
    }
}
