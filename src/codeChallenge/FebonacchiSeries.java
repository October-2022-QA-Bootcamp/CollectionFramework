package codeChallenge;

import java.util.Arrays;

public class FebonacchiSeries {

	public static void main(String[] args) {
		
		//0 1 1 2 3 5 
		
		
		// it-1   i=0  a[i]/a[0]=0
		// it-2   i=1  a[i]/a[1]=1
		// it-3   i=2  a[i]/a[2]=1
		// it-4   i=3  a[i]/a[3]=2
		// it-4   i=3  a[i]/a[4]=3
		
		
		
		int a[] = new int[8];
		for (int i = 0; i < 8; i++) {
			if (i <= 1) {
				a[i] = i;

			} else {
				a[i] = a[i - 1] + a[i - 2];   //  prev two results of two prev indexes  2+1=3
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
