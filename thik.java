import java.util.*;
public class thik {
  public static void main(String[] args) {
  int m = 5;
  //outer loop
  for(int i = 1; i <= m; i++) {
    //inner loop
    for(int j = 1; j <= m - i; j++) {
      System.out.print(" ");
    }
    for(int j = 1; j <= i; j++) {
    System.out.print(j + " ");
  } 
  System.out.println();
}
}
}