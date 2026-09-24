import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);
        HashSet<Integer> unique = new HashSet<>(numbers);
        System.out.println("Original: " + numbers);
        System.out.println("Without duplicates: " + unique);
    }
}