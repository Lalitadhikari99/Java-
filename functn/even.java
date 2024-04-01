import java.util.*;
public class even {
    public static void checkEvenNumber(int n) {
        if(n % 2 == 0){
            System.out.println("even");
        }else {
        System.out.println("odd");
        }
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
     System.out.println(n);
     checkEvenNumber(n);
    }
}