import java.util.*;
public class pattern {
    public static void main(String[] args) {
        int m = 4;
        //outer loop
        for(int i = m; i >= 1; i--) {
            //inner loop
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        } 
    }
}