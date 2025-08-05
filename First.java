import java.util.Scanner;

class First {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int x = sc.nextInt();

        for (int y = 1; y <= 10; y++) {
            System.out.println(x * y);
        }

        sc.close();
    }

}
