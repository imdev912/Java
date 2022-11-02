/*

fibonacci series

*/

import java.util.*;

class Main {
  public static int fibonacci(int num) {
    if (num < 2) {
      return num;
    }
    
    return fibonacci(num - 1) + fibonacci(num - 2);
  }
  
  public static void fibonacciSeries(int num) {
    for (int idx = 0; idx < num; idx++) {
      System.out.println(fibonacci(idx));
    }
  }
  
	public static void main (String[] args) {
		Scanner scn = new Scanner(System.in);
		int range = scn.nextInt();
		
		fibonacciSeries(range);
	}
}
