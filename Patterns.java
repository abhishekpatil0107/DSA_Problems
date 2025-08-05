public class Patterns {
    public static void main(String[] args) {

        // 1)Solid Rectangle & Nested Loops
        // int n = 4;
        // int m = 5;

        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= m; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // Output :-
        // *****
        // *****
        // *****
        // *****

        // 2)Hollow Rectangle
        // int n = 4;
        // int m = 4;

        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= m; j++) {
        // if (i == 1 || j == 1 || i == n || j == m) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // Output:-
        // ****
        // *__*
        // *__*
        // ****

        // 3)Half Pyramid

        // int n = 4;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // Output:
        // *
        // *
        // **
        // ***

        // 4)Inverted half Pyramid

        // int n = 4;

        // for (int i = n; i >= 1; i--) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // Output :-
        // ****
        // ***
        // **
        // *

        // 5)Inverted & Rotated Half Pyramid

        // int n = 4;

        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // Output:-
        // ___*
        // __**
        // _***
        // ****

        // 6)Half Pyramid with Numbers

        // int n = 5;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(j + " ");
        // }
        // System.out.println();
        // }

        // Output:-
        // 1
        // 1 2
        // 1 2 3
        // 1 2 3 4
        // 1 2 3 4 5

        // 7)Inverted Half Pyramid with Numbers

        // int n = 5;

        // for (int i = n; i >= 1; i--) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(j);
        // }
        // System.out.println();
        // }

        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n - i + 1; j++) {
        // System.out.print(j);
        // }
        // System.out.println();
        // }

        // Output:-
        // 12345
        // 1234
        // 123
        // 12
        // 1

        // 8)Floyd's Triangle

        // int n = 5;
        // int number = 1;

        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(number + " ");
        // number++;
        // }
        // System.out.println();
        // }

        // Output:-
        // 1
        // 2 3
        // 4 5 6
        // 7 8 9 10
        // 11 12 13 14 15

        // 9)0-1 Triangle
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }

        // Output:-
        // 1
        // 0 1
        // 1 0 1
        // 0 1 0 1
        // 1 0 1 0 1

    }

}
