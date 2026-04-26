package Mathematics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prime_factor {
    static boolean isPrime(int num) {
        for (int i = num - 1; i > 1; i--) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        List<Integer> n = new ArrayList<>();
        for (int i = 2; i <= num; i++) {
            int num1 = num;
            if (isPrime(i)) {
                while (num1 % i == 0) {
                    System.out.println(i);
                    num1 = num1 / i;
                }
            }
        }
    }
}
