public class AdPatterns {
    public static void main(String[] args) {

        // 1)Butterfly Pattren

        // int n = 5;

        // // Upper-half
        // for (int i = 1; i <= n; i++) {

        // // 1st part
        // for (int j = 1; j <= i; j++) {
        // System.out.print(" * ");
        // }

        // // spaces
        // int space = 2 * (n - i);
        // for (int j = 1; j <= space; j++) {
        // System.out.print(" ");
        // }

        // // 2nd part
        // for (int j = 1; j <= i; j++) {
        // System.out.print(" * ");
        // }
        // System.out.println();
        // }

        // // Lower-half
        // for (int i = n; i >= 1; i--) {

        // // 1st part
        // for (int j = 1; j <= i; j++) {
        // System.out.print(" * ");
        // }

        // // spaces
        // int space = 2 * (n - i);
        // for (int j = 1; j <= space; j++) {
        // System.out.print(" ");
        // }

        // // 2nd part
        // for (int j = 1; j <= i; j++) {
        // System.out.print(" * ");
        // }
        // System.out.println();
        // }

        // Output:-
        // * _______________ *
        // * *_____________* *
        // * * *_________* * *
        // * * * *_____* * * *
        // * * * * * * * * * *
        // * * * * * * * * * *
        // * * * *_____* * * *
        // * * *_________* * *
        // * *_____________* *
        // *_________________*

        // 2)Rhombus Pattern

        // int n = 5;

        // for (int i = 1; i <= n; i++) {
        // // space
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(" ");
        // }

        // // stars
        // for (int j = 1; j <= 5; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // Output:-
        // ____*****
        // ___*****
        // __*****
        // _*****
        // *****

        // 3)Number Pyramid -->print row no.,row no. times

        // int n = 5;

        // for (int i = 1; i <= n; i++) {
        // // spaces
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(" ");
        // }
        // // numbers
        // for (int j = 1; j <= i; j++) {
        // System.out.print(i + " ");
        // }
        // System.out.println();
        // }

        // Output:-
        // ____1
        // ___2 2
        // __3 3 3
        // _4 4 4 4
        // 5 5 5 5 5

        // 4)Palindromic Pattern
        // int n = 5;

        // for (int i = 1; i <= n; i++) {
        // // spaces
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(" ");
        // }

        // // 1st half numbers
        // for (int j = i; j >= 1; j--) {
        // System.out.print(j);
        // }

        // // 2nd half numbers
        // for (int j = 2; j <= i; j++) {
        // System.out.print(j);
        // }

        // System.out.println();
        // }

        // Output:-
        // ____1
        // ___212
        // __32123
        // _4321234
        // 543212345

        // 5)Diamond Pattern
        int n = 4;

        // upper half
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // lower half
        for (int i = n; i >= 1; i--) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Output:-
        // ___*
        // __***
        // _*****
        // *******
        // *******
        // _*****
        // __***
        // ___*
    }

}
