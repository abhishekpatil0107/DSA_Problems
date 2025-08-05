import java.util.Scanner;

public class CalcPower {
    public static int calcPower(int x, int n) {
        if (x == 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }

        int xpownm1 = calcPower(x, n - 1);
        int xpown = x * xpownm1;
        return xpown;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x: ");
        int x = sc.nextInt();
        System.out.println("Enter n:");
        int n = sc.nextInt();

        int ans = calcPower(x, n);
        System.out.println("x*n is : " + ans);

        sc.close();

    }

}
