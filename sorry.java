import java.util.*;
public class sorry {
    public static void main(String[] args) {
        int m = 5;
        //outer loop
        for(int i = 1; i <= m; i++) {
            //inner loop
            for(int j = 1; j <= i; j++) {
                int sum = i+j;
                if(sum % 2 == 0) {
                    System.out.print("1 ");
                } else {
                        System.out.print("0 ");
                    }
                }
                System.out.println();
            }
        }
    }
    