/*

reverse of a number

*/

import java.util.*;

class Main {
	public static void main (String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		
		int temp = num;
		int digits = 0;
		int places = 1;
		
		while(temp > 0) {
		  int digit = temp % 10;
		  temp /= 10;
		  digits += 1;
		  System.out.print(digit + " ");
		  
		  places *= 10;
		}
		
		places /= 10;
		System.out.println();
		
	  int rev = 0;
	  temp = num;
	  
		while (places > 0) {
		  int digit = temp % 10;
		  rev += digit * places;
		  temp /= 10;
		  places /= 10;
		}
		
		temp = rev;
		while (temp > 0) {
		  int digit = temp % 10;
		  temp /= 10;
		  System.out.print(digit + " ");
		}
		
		System.out.println();
		System.out.println(num);
		System.out.println(rev);
		System.out.println(digits);
	}
}
