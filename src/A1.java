public class A1 {
    public static void add(){
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.print("sum : " + sum);
    }
    public static void main(String[] args) {
        add();
    }
}