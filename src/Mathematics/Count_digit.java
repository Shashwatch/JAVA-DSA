package Mathematics;

import java.util.Scanner;

public class Count_digit {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        while(num > 0){
            count += 1;
            num = num/10;
        }
        System.out.println("Count : " + count);
    }
}
