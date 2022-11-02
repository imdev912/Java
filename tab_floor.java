import java.util.*;

public class Main {
    static void pattern(int N) {
        int index, side_index;
        
        for (index = 1; index <= N; index++) {
            for (side_index = 1; side_index < (index + 1); side_index++) {
                System.out.print("*");

                if (index > 1) {
                  System.out.print("\t");
                }
            }
            
            System.out.println();
        }
    }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int num = scn.nextInt();
    pattern(num);
  }
}

import java.util.*;

public class Main {
    static void pattern(int N) {
        int index, side_index;
        
        for (index = N; index > 0; index--) {
            for (side_index = index; side_index > 0; side_index--) {
                System.out.print("*");

                if (index > 1) {
                  System.out.print("\t");
                }
            }
            
            System.out.println();
        }
    }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int num = scn.nextInt();
    pattern(num);
  }
}

import java.util.*;

public class Main {
    static void pattern(int N) {
        int index, side_index;
        
        for (index = N; index > 0; index--) {
            for (side_index = 1; side_index <= N; side_index++) {
                if (side_index >= index) {
                    System.out.print("*");
                    
                    if (side_index < N) {
                        System.out.print("\t");
                    }
                } else {
                    System.out.print("\t");
                }
            }
            
            System.out.println();
        }
    }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int num = scn.nextInt();
    pattern(num);
  }
}

import java.util.*;

public class Main {
    static void pattern(int N) {
        int index, side_index;
        
        for (index = N; index > 0; index--) {
            for (side_index = N; side_index > 0; side_index--) {
                if (side_index > index) {
                    System.out.print("\t");
                } else {
                    System.out.print("*");
                    
                    if (side_index <= N) {
                        System.out.print("\t");
                    }
                }
            }
            
            System.out.println();
        }
    }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int num = scn.nextInt();
    pattern(num);
  }
}

// start spade
import java.util.*;

public class Main {
    static void pattern(int N) {
        int space, star;
        boolean reverse;
        
        space = N / 2 ;
        star = 1;
        reverse = false;
        
        while (star > 0) {
            for (int index = 0; index < space; index++) {
                System.out.print("\t");
            }
            
            for (int index = 0; index < star; index++) {
                if (index > 0) {
                    System.out.print("\t");
                }
                
                System.out.print("*");
            }
            
            System.out.println();
            
            if (star >= N) {
                reverse = true;
            }
            
            if (reverse) {
                space++;
                star -= 2;
            } else {
                space--;
                star += 2;
            }
        }
    }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int num = scn.nextInt();
    pattern(num);
  }
}

// tab spade
import java.util.*;

public class Main {
    static void pattern(int N) {
        int space, star;
        boolean reverse;
        
        space = 1 ;
        star = (N / 2) + 1;
        reverse = false;
        
        while (space > 0) {
            for (int index = 0; index < star; index++) {
                System.out.print("*");
                
                if (index < (N - 1)) {
                    System.out.print("\t");
                }
            }
            
            for (int index = 0; index < space; index++) {
                System.out.print("\t");
            }
            
            for (int index = 0; index < star; index++) {
                System.out.print("*");
                
                if (index < (N - 1)) {
                    System.out.print("\t");
                }
            }
            
            System.out.println();
            
            if (space >= N) {
                reverse = true;
            }
            
            if (reverse) {
                star++;
                space -= 2;
            } else {
                star--;
                space += 2;
            }
        }
    }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int num = scn.nextInt();
    pattern(num);
  }
}

// X
import java.util.*;

public class Main {
    static void pattern(int N) {
        int index, side_index;
        
        for (index = N; index > 0; index--) {
            for (side_index = N; side_index > 0; side_index--) {
                if (side_index == index || side_index == (N - (index - 1))) {
                    System.out.print("*");
                    
                    if (side_index > 1) {
                        System.out.print("\t");
                    }
                } else {
                    System.out.print("\t");
                }
            }
            
            System.out.println();
        }
    }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int num = scn.nextInt();
    pattern(num);
  }
}

// decimal to base
import java.util.*;
  
public class Main{
    
    static char baseValue(int num) {
    	if (num >= 0 && num <= 9) {
    		return (char)(num + 48);
    	} else {
    		return (char)(num - 10 + 65);
    	}
    }
    
    static void convertBase(int num, int base) {
        String temp = "";
        String result = "";
        
        while (num > 0) {
            temp += baseValue(num % base);
            num /= base;
    	}
    	
    	for (int index = 0; index < temp.length(); index++) {
            char ch= temp.charAt(index);
            result = ch + result;
        }
      
        System.out.println(result);
   }
  
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int base = scn.nextInt();
        convertBase(num, base);
    }
}

// base to decimal
import java.util.*;
  
public class Main{
    
    static int baseValue(char c) {
    	if (c >= '0' && c <= '9') {
    		return (int)c - '0';
    	} else {
    		return (int)c - 'A' + 10;
    	}
    }
    
    static void convertBase(int num, int base) {
        String str = String.valueOf(num);
        int pow = 1;
        int value = 0;
        
        for (int index = (str.length() - 1); index >= 0; index--) {
            int temp = baseValue(str.charAt(index));
            if (temp < base) {
                value += temp * pow;
                pow *= base;
            }
        }
      
        System.out.println(value);
   }
  
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int base = scn.nextInt();
        convertBase(num, base);
    }
}

// base to base
import java.util.*;

public class Main{
    
    static char baseValue(int num) {
    	if (num >= 0 && num <= 9) {
    		return (char)(num + 48);
    	} else {
    		return (char)(num - 10 + 65);
    	}
    }
    
    static String decimalToBase(int num, int base) {
        String temp = "";
        String result = "";
        
        while (num > 0) {
            temp += baseValue(num % base);
            num /= base;
    	}
    	
    	for (int index = 0; index < temp.length(); index++) {
            char ch= temp.charAt(index);
            result = ch + result;
        }
        
        return result;
   }
    
    static int decimalValue(char c) {
    	if (c >= '0' && c <= '9') {
    		return (int)c - '0';
    	} else {
    		return (int)c - 'A' + 10;
    	}
    }
    
    static int baseToDecimal(int num, int base) {
        String str = String.valueOf(num);
        int pow = 1;
        int value = 0;
        
        for (int index = (str.length() - 1); index >= 0; index--) {
            int temp = decimalValue(str.charAt(index));
            
            if (temp < base) {
                value += temp * pow;
                pow *= base;
            }
        }
        
        return value;
   }
  
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int base_1 = scn.nextInt();
        int base_2 = scn.nextInt();
        
        int btd = baseToDecimal(num, base_1);
        String dtb = decimalToBase(btd, base_2);
        System.out.print(dtb);
    }
}

// sum / sub / mul any base
import java.util.*;

public class Main{
    
    static char baseValue(int num) {
    	if (num >= 0 && num <= 9) {
    		return (char)(num + 48);
    	} else {
    		return (char)(num - 10 + 65);
    	}
    }
    
    static String decimalToBase(int num, int base) {
        String temp = "";
        String result = "";
        
        while (num > 0) {
            temp += baseValue(num % base);
            num /= base;
    	}
    	
    	for (int index = 0; index < temp.length(); index++) {
            char ch= temp.charAt(index);
            result = ch + result;
        }
        
        return result;
   }
    
    static int decimalValue(char c) {
    	if (c >= '0' && c <= '9') {
    		return (int)c - '0';
    	} else {
    		return (int)c - 'A' + 10;
    	}
    }
    
    static int baseToDecimal(int num, int base) {
        String str = String.valueOf(num);
        int pow = 1;
        int value = 0;
        
        for (int index = (str.length() - 1); index >= 0; index--) {
            int temp = decimalValue(str.charAt(index));
            
            if (temp < base) {
                value += temp * pow;
                pow *= base;
            }
        }
        
        return value;
   }
  
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int base = scn.nextInt();
        int num_1 = scn.nextInt();
        int num_2 = scn.nextInt();
        
        num_1 = baseToDecimal(num_1, base);
        num_2 = baseToDecimal(num_2, base);
        
        int sum = num_1 + num_2;
        int sub = num_2 - num_1;
        int mul = num_1 * num_2;
        
        String res_sum = decimalToBase(sum, base);
        System.out.print(res_sum);
        
        String res_sub = decimalToBase(sub, base);
        System.out.print(res_sub);

        String res_mul = decimalToBase(mul, base);
        System.out.print(res_mul);
    }
}

// prime factors
import java.util.*;
  
public class Main{
    
    static void primeFactors(int num) {
        for (int index = 2; index <= (num / index); index++) {
            while ((num % index) == 0) {
                System.out.print(index);
                System.out.print(" ");
                num /= index;
            }
        }
        
        if (num > 2) {
            System.out.print(num);
        }
   }
  
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        primeFactors(num);
    }
}

// fibonacci series
import java.util.*;

public class Main{
    static int fibo(int num) {
        if (num <= 1) {
            return num;
        }
        
        return fibo(num - 1) + fibo(num - 2);
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        
        for (int index = 0; index < num; index++) {
            System.out.println(fibo(index));
        }
    }
}

// element in array
import java.util.*;

public class Main{
    static int elemIndexArray(int [] arr, int num) {
        for (int index = 0; index < arr.length; index++) {
            if (num == arr[index]) {
                return index;
            }
        }
        
        return -1;
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int arr[] = new int[size];
        
        for (int index = 0; index < size; index++) {
            arr[index] = scn.nextInt();
        }
        
        int num = scn.nextInt();
        System.out.print(elemIndexArray(arr, num));
        
    }
}

// gcd & lcm
import java.util.*;

public class Main{
    static int[] primeFactors(int num) {
        int arr[] = new int[128];
        int idx = 0;
        
        for (int index = 2; index <= (num / index); index++) {
            while ((num % index) == 0) {
                arr[idx++] = index;
                num /= index;
            }
        }
        
        if (num > 2) {
            arr[idx] = num;
        }
        
        return arr;
   }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num_1 = scn.nextInt();
        int num_2 = scn.nextInt();
        
        int arr_1[] = primeFactors(num_1);
        int arr_2[] = primeFactors(num_2);
        int arr[] = new int[128];
        int idx = 0;
        int gcd = 1;
        int lcm = 1;
        
        for (int index = 0; index < arr_1.length; index++) {
            if (arr_1[index] > 0) {
                lcm *= arr_1[index];
            }
            
            for (int side_index = 0; side_index < arr_2.length; side_index++) {
                if (arr_1[index] > 0 && arr_1[index] == arr_2[side_index]) {
                    arr[idx++] = arr_1[index];
                    arr_2[side_index] = 0;
                    break;
                }
            }
        }
        
        for (int index = 0; index < arr_2.length; index++) {
            if (arr_2[index] > 0) {
                lcm *= arr_2[index];
            }
        }
        
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] > 0) {
                gcd *= arr[index];
            }
        }
        
        System.out.println(gcd);
        System.out.println(lcm);
    }
}

// count digits in a number
import java.util.*;
  
public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int count = 0;
        
        while (num > 0) {
            num = num / 10;
            count += 1;
        }
        
        System.out.print(count);
    }
}

// reverse a number
import java.util.*;
  
public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int reverse = 0;
        
        while (num > 0) {
            reverse *= 10;
            reverse += num % 10;
            num = num / 10;
        }
        
        System.out.print(reverse);
    }
}

// digits of number
import java.util.*;
  
public class Main {
    static int[] reverseDigit(int num) {
        int n = num;
        int size = 0;
        
        while (n > 0) {
            n = n / 10;
            size += 1;
        }
        
        int arr[] = new int[size];
        int index = 0;
        int reverse = 0;
        
        while (num > 0) {
            arr[index++] = num % 10;
            num = num / 10;
        }
        
        return arr;
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int reverse[] = reverseDigit(num);
        
        for (int index = (reverse.length - 1); index >= 0; index--) {
            System.out.println(reverse[index]);
        }
    }
}

// armstrong number
import java.util.*;
  
public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int sum = 0;
        int ref = num;
        
        while (ref > 0) {
            int n = ref % 10;
            int n3 = n * n * n;
            
            sum += n3;
            ref = ref / 10;
        }
        
        if (num == sum) {
            System.out.println("true");   
        } else {
            System.out.println("false");
        }
    }
}

// factorial
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int fact = factorial(num);
        System.out.print(fact);
    }

    public static int factorial(int num){
        if (num <= 1) {
            return 1;
        }
        
        return num * factorial(num - 1);
    }

}

// invert of a number
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int num= scn.nextInt();
        int ref = num;
        int size = 0;
        
        while (ref > 0) {
            ref = ref / 10;
            size += 1;
        }
        
        int arr[] = new int[size];
        int inv[] = new int[size];
        int index = 0;
        
        while (num > 0) {
            arr[index++] = num % 10;
            num = num / 10;
        }
        
        for (index = 0; index < arr.length; index++) {
            inv[arr[index] - 1] = index + 1;
        }
        
        for (index = (inv.length - 1); index >= 0; index--) {
            System.out.print(inv[index]);
        }
        
        
    }
}

// number diamond
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        size = (size / 2) + 1;
        int pntr = 1;
        
        for (int row = 1; row < size; row++) {
            int num = pntr;
            
            for (int col = row; col < size; col++) {
                System.out.print("\t");
            }
            
            for (int col = 1; col < row; col++) {
                System.out.print(num + "\t");
                num += 1;
            }
            
            for (int col = 1; col <= row; col++) {
                System.out.print(num + "\t");
                num -= 1;
            }
            
            pntr += 1;
            System.out.println();
        }
        
        for (int row = 1; row <= size; row++) {
            int num = pntr;
            
            for (int col = 1; col < row; col++) {
                System.out.print("\t");
            }
            
            for (int col = row; col < size; col++) {
                System.out.print(num + "\t");
                num += 1;
            }
            
            for (int col = row; col <= size; col++) {
                System.out.print(num + "\t");
                num -= 1;
            }
            
            pntr -= 1;
            System.out.println();
        }
    }
}