/**
 * 
 */
package discusswk7;

import java.util.Arrays;

public class Wk7discuss {

	public static void doubleArray(int []ary) {// doubles all the values in an array.
		
		for (int i=0; i< ary.length; i++ ) {// loop to go through array.
			
			ary[i] = ary[i]*2;
		}
	}
	
	public static void main(String[] args) {
		
			int [] array = new int[7];// declaring array
			
			for(int a=0; a< array.length; a++) {// giving each index location a random number.
			int	rand;
				rand = (int)(Math.random()* 10);
				array[a] = rand;
			}
			System.out.println(Arrays.toString(array)); // printing original array.
			
			doubleArray(array);
			System.out.println(Arrays.toString(array)); // printing doubled array.
	}

}
