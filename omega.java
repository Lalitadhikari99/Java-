import java.util.*;
public class omega {
    public static void main(String[] args) {
        int m = 5;
//upper part
for(int i = 1; i <= m; i++) {
    // for space
    for(int j = 1; j <= m - i; j++) {
        System.out.print(" ");
    }
    for( int j = 1; j <= 2 * i - 1; j++) {
        System.out.print("*");
    }
    System.out.println();
}

    // lower part
    for(int i = m; i >= 1; i--) {
        //for space
        for(int j = 1; j <= m - i; j++) {
            System.out.print(" ");
        }
        for(int j = 1; j <= 2 * i - 1; j++) {
            System.out.print("*");
        }
        System.out.println(); 
    }
}   
    }
