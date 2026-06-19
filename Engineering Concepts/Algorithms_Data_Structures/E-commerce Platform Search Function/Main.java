public class Main {
    public static void main(String[] args) {

        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Phone", "Electronics"),
            new Product(103, "Shoes", "Fashion"),
            new Product(104, "Watch", "Accessories")
        };

        Product result = LinearSearch.linearSearch(products, 103);

        if (result != null)
            System.out.println("Found: " + result);
        else
            System.out.println("Product not found");

             Product res = BinarySearch.binarySearch(products, 104);

        if (res != null)
            System.out.println("Found: " + res);
        else
            System.out.println("Product not found");
    
    }
}