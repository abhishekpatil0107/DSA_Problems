import java.util.*;

public class StringB {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("DSA");
        System.out.println(sb);

        System.out.println(sb.charAt(0));

        sb.setCharAt(1, 'P');
        System.out.println(sb);

        sb.insert(0, 'K');
        System.out.println(sb);

        sb.delete(0, 1);
        System.out.println(sb);

        sb.append("s");
        sb.append("r");
        System.out.println(sb);
    }

}
