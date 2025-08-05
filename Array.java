import java.util.*;

public class Array {
    public static void main(String[] args) {
        // int marks[] = { 95, 85, 92 };
        // for (int i = 0; i <= 3; i++) {
        // System.out.println(marks[i]);
        // }

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        // Input
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        // Output
        for (int i = 0; i < size; i++) {
            System.out.println(numbers[i]);
        }

        sc.close();

    }

}
