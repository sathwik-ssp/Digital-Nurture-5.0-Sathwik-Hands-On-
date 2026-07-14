import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        Product[] products = {
                new Product(105, "Laptop", "Electronics"),
                new Product(101, "Phone", "Electronics"),
                new Product(104, "Shoes", "Fashion"),
                new Product(102, "Watch", "Accessories"),
                new Product(103, "Book", "Education")
        };

        int targetId = 104;

        System.out.println("===== Linear Search =====");
        Product linearResult = SearchAlgorithms.linearSearch(products, targetId);

        if (linearResult != null) {
            System.out.println("Product Found:");
            System.out.println(linearResult);
        } else {
            System.out.println("Product Not Found");
        }

        Arrays.sort(products, Comparator.comparingInt(p -> p.productId));

        System.out.println("\n===== Binary Search =====");
        Product binaryResult = SearchAlgorithms.binarySearch(products, targetId);

        if (binaryResult != null) {
            System.out.println("Product Found:");
            System.out.println(binaryResult);
        } else {
            System.out.println("Product Not Found");
        }

        System.out.println("\n===== Time Complexity Analysis =====");
        System.out.println("Linear Search:");
        System.out.println("Best Case    : O(1)");
        System.out.println("Average Case : O(n)");
        System.out.println("Worst Case   : O(n)");

        System.out.println();

        System.out.println("Binary Search:");
        System.out.println("Best Case    : O(1)");
        System.out.println("Average Case : O(log n)");
        System.out.println("Worst Case   : O(log n)");

        System.out.println();

        System.out.println("Binary Search is more suitable for an e-commerce platform");
        System.out.println("because it provides much faster search performance on sorted data.");
    }
}