import java.util.*;
public class product {
    public static int calculateProduct(int a, int b) {
        int prod = a * b;
        System.out.println("Product: " + prod);
        return prod;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first integer");
        int a = sc.nextInt();

        System.out.println("Enter the second integer");
        int b = sc.nextInt();
        
        int prod = calculateProduct(a, b); 
    }
}