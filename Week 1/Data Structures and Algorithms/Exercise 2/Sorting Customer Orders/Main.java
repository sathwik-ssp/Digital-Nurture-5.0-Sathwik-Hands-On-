public class Main {

    public static void main(String[] args) {

        Order[] orders = {
                new Order(101, "Rahul", 4500),
                new Order(102, "Priya", 1200),
                new Order(103, "Kiran", 8900),
                new Order(104, "Sneha", 3500),
                new Order(105, "Arjun", 2500)
        };

        Order[] bubbleOrders = orders.clone();
        Order[] quickOrders = orders.clone();

        System.out.println("===== Original Orders =====");
        SortAlgorithms.displayOrders(orders);

        SortAlgorithms.bubbleSort(bubbleOrders);

        System.out.println("\n===== Bubble Sort =====");
        SortAlgorithms.displayOrders(bubbleOrders);

        SortAlgorithms.quickSort(quickOrders, 0, quickOrders.length - 1);

        System.out.println("\n===== Quick Sort =====");
        SortAlgorithms.displayOrders(quickOrders);

        System.out.println("\n===== Time Complexity Analysis =====");

        System.out.println("\nBubble Sort");
        System.out.println("Best Case    : O(n)");
        System.out.println("Average Case : O(n²)");
        System.out.println("Worst Case   : O(n²)");

        System.out.println("\nQuick Sort");
        System.out.println("Best Case    : O(n log n)");
        System.out.println("Average Case : O(n log n)");
        System.out.println("Worst Case   : O(n²)");

        System.out.println("\nConclusion:");
        System.out.println("Quick Sort is generally preferred because");
        System.out.println("it is much faster than Bubble Sort for");
        System.out.println("large datasets due to its average time");
        System.out.println("complexity of O(n log n).");
    }
}