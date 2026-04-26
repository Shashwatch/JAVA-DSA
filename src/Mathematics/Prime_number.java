package Mathematics;

import java.util.Scanner;

public class Prime_number {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int count = 0;
        if(num1 != 1) {
            for (int i = num1 - 1; i > 1; i--) {
                if (num1 % i == 0) {
                    count++;
                    break;
                }
            }
            if (count == 1) {
                System.out.println("Composite Number");
            } else {
                System.out.println("Prime Number");
            }
        }else{
            System.out.println("Composite Number");
        }
    }
}
