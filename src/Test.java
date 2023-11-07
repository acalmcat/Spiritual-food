import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int sum = 0;
        for (int num = 1; num <= 100; num++) {
            if (num % 2 != 0) {
                sum += num;
            }
        }
        System.out.println("1到100的所有奇数的和：");
        System.out.println(sum);
        //改动测试asdasd

    }
}
