public class Recursion2 {
    // Print sum of first n natural numbers
    public static void printSumm(int n, int i, int sum) {
        if (i == n) {
            System.out.println(sum);
            return;
        }
        sum += i;
        printSumm(n, i + 1, sum);
    }

    public static void main(String[] args) {
        printSumm(5, 1, 0);
    }

}
