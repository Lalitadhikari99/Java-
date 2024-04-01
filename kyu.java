import java.util.*;
public class kyu {
    public static void main(String[] args) {
        int m = 5;
        //outer loop
        for(int i = 1; i <= m; i++) {
        // inner loop(to print space)
        for(int j = 1; j <= m - i; j++) {
            System.out.print(" ");
        }
            //to print stars
            for(int j = 1; j <= m; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}   