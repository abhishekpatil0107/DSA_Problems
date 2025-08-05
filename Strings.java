import java.util.*;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Enter name: " + name);

        sc.close();

        // compare
        String name1 = "Abhishek";
        String name2 = "Abhishek";

        // s1>s2 : +ve value
        // s1==s2 : 0
        // s1<s2 : -ve value

        // if (name1.compareTo(name2) == 0) {
        // System.out.println("Stirngs are equal");
        // } else {
        // System.out.println("Stirngs are not equal");
        // }

        // if (new String("Abhi") == new String("Abhi")) {
        // System.out.println("Equal");
        // } else {
        // System.out.println("NOT equal");
        // }

        // Substring
        String sentence = "My name is Abhishek";
        String name3 = sentence.substring(11, 19);
        System.out.println(name3);

    }

}
