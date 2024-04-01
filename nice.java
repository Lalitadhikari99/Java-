import java.util.*;
public class nice {
    public static void main(String[] args) {
        int m = 5;
        //outer loop
        for(int i = 1; i <= m; i++) {
            //inner loop
            //to print space
            for(int j = 1; j <= m - i; j++) {
                System.out.print(" ");
            }
            //to print numbers
                for(int j = 1; j <= i; j++) {
                    System.out.print(i + " ");
                }
            System.out.println();        
    }
}
}