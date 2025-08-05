public class Recur3CountPaths {
    public static int countPaths(int n, int m, int i, int j) {
        if (i == n || j == m) {
            return 0;
        }
        if (i == n - 1 && j == m - 1) {
            return 1;
        }

        int downPaths = countPaths(n, m, i + 1, j);

        int rightPaths = countPaths(n, m, i, j + 1);
        return downPaths + rightPaths;
    }

    public static void main(String[] args) {
        int n = 4;
        int m = 4;
        int totalPaths = countPaths(n, m, 0, 0);
        System.out.println(totalPaths);
    }

}
