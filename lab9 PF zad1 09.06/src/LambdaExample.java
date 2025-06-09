import java.util.*;

public class LambdaExample {
    public static void main(String[] args) {
        String[] friends = { "Piotr", "Alojzy", "Marysia" };
        Arrays.sort(friends, new LengthComparator());
        System.out.println(Arrays.toString(friends)); // [Piotr, Alojzy, Marysia]
    }

    static class LengthComparator implements Comparator<String> {
        public int compare(String s1, String s2) {
            return Integer.compare(s1.length(), s2.length());
        }
    }
}