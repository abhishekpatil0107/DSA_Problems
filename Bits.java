import java.util.Scanner;

public class Bits {
    public static void main(String[] args) {
        // //1)Get Bit
        // int n = 5;
        // int pos = 6;
        // int bitMask = 1 << pos;

        // if ((bitMask & n) == 0) {
        // System.out.println("Bit is zero");
        // } else {
        // System.out.println("Bit is non zero");
        // }

        // //2)Set Bit
        // int n = 5;
        // int pos = 1;
        // int bitMask = 1 << pos;

        // int newNumber = bitMask | n;
        // System.out.println(newNumber);

        // //3)Clear Bit
        // int n = 5;
        // int pos = 2;
        // int bitMask = 1 << pos;

        // int newbitMask = ~(bitMask);

        // int newNumber = newbitMask & n;
        // System.out.println(newNumber);

        // 4)Update Bit
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter operation(0 or 1):");
        int operation = sc.nextInt();
        // if operation=1 means set then update bit to 1 else clear means update bit to
        // 0
        int n = 5;
        System.out.println("Enter position:");
        int pos = sc.nextInt();

        int bitMask = 1 << pos;

        if (operation == 1) {
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        } else {
            int newbitMask = ~(bitMask);
            int newNumber = newbitMask & n;
            System.out.println(newNumber);
        }

    }

}
