/*

*****
   *
  *
*
*****

*/

import java.util.*;

class Main {
	public static void main (String[] args) {
		Scanner scn = new Scanner(System.in);
		int size = scn.nextInt();
		
		for (int row = 1; row <= size; row++) {
		  for (int col = 1; col <= size; col ++) {
		    if (row == 1 || row == size) {
		      System.out.print("*\t");
		    } else if ((col + row) == (size + 1)) {
		      System.out.print("*\t");
		    } else {
		      System.out.print("\t");
		    }
		  }
		  System.out.println();
		}
	}
}
