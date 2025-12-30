//Coding exercise for stream api and collection framework


import java.util.*;

public class Main1 {

    public static void main(String[] args) {

        List<String> products = Arrays.asList("Laptop", "Pen", "Notebook", "Headphones", "Smartphone");

        // TODO: Print the original list
        System.out.println("Original List: " + products);

        // TODO: Filter names longer than 5 characters, convert to uppercase, sort, and collect into a list
        List<String> names = products.stream()
                .filter(n -> n.length() > 5)
                .map(n -> n.toUpperCase())
                .sorted()
                .toList();

        // TODO: Print the filtered list
        System.out.println("Filtered Products: " + names);
    }
}
