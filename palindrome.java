import java.util.*;
public class palindrome {
    public static void main(String [] args) {
        int m = 5;
        //outer loop
        for(int i = 1; i <= m; i++) {
            //inner loop => (to print space)
            for(int j = 1; j <= m - i; j++) {
                System.out.print(" ");
            }

            for(int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            for(int j = 2; j <= i; j++) {
                System.out.print(j);
            }
           System.out.println();
                }
            }   
        }
    
