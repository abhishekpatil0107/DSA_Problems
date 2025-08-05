import java.util.Scanner;

public class FactorialRecur {
    public static int fact(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        int fact_nm1 = fact(n - 1);
        int fact_n = n * fact_nm1;
        return fact_n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        int res = fact(n);
        System.out.println("Factorial is :" + res);

        sc.close();

    }

}
