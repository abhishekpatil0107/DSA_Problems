public class Recur3CountTiles {
    public static int placeTiles(int n, int m) {
        if (n == m) {
            return 2;
        }
        if (n < m) {
            return 1;
        }
        int vertPlace = placeTiles(n - m, m);

        int horPlace = placeTiles(n - 1, m);
        return vertPlace + horPlace;
    }

    public static void main(String[] args) {
        int n = 4;
        int m = 2;
        System.out.println(placeTiles(n, m));
    }

}
