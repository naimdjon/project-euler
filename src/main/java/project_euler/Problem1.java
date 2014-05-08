package project_euler;

public class Problem1 {

    public static void main(String[] args) {
        int result=run();
        System.out.println("Sum of multiples of 3 and 5 is: " + result);
    }

    public static int run() {
        int sum = 0;
        for (int i = 3; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
