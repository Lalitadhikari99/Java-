import java.util.*;
public class thanks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
int m = sc.nextInt();
int n = sc.nextInt();
//outer loop
for(int i = 1; i <= m; i++) {
    //inner loop
    for(int j = 1; j <= n; j++) { 
    if(i == 1 || j == 1 || i == m || j == n) {
        System.out.print("*");
    } else {
        System.out.print(" ");
    }
}
System.out.println();   
    }
}
}