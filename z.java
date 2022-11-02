import java.util.*;

public class Main {
    static void pattern(int N) {
        int index, side_index;
        int Top = 1, Bottom = 1, Diagonal = N - 1;
        
        for (index = 0; index < N; index++) {
            System.out.print("*");   
        }
 
        System.out.println();
        
        for (index = 1; index < (N - 1); index++) {
            for (side_index = 0; side_index < (N - index - 1); side_index++) {
                System.out.print(" ");
            }
            
            System.out.print("*");
            System.out.println();
        }
        
        for (index = 0; index < N; index++) {
            System.out.print("*");   
        }
    }

  public static void main(String[] args) {
    pattern(5);
  }
}