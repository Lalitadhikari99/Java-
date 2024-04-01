import java.util.*;
public class rhombus {
    public static void main(String[] args) {
        int n = 5;
        //for printing spaces
        //outer loop
        for(int i = 1; i <= n; i++) {
            //inner loop
        for(int j = 1; j <= n - i; j++) {
            System.out.print(" ");
        }
        //to print stars
            for(int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
