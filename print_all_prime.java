/*

print all prime

*/

import java.util.*;

class Main {
  public static boolean checkPrime(int num) {
    for (int div = 2; div * div <= num; div++) {
      if ((num % div) == 0) {
        return false;
      }
    }
    
    return true;
  }
  
  public static void printPrime(int num_1, int num_2) {
    for (int num = num_1; num <= num_2; num++) {
		  if (checkPrime(num)) {
		    System.out.println(num);
		  }
		}
  } 
  
	public static void main (String[] args) {
		Scanner scn = new Scanner(System.in);
		int num_1 = scn.nextInt();
		int num_2 = scn.nextInt();
		
		printPrime(num_1, num_2);
	}
}
