package Arrays;

import java.util.Scanner;

// Display only primary diagonal.

/*
* Input -
* *******
			1 2 3 5
			4 5 6 4
			7 8 9 1
			4 6 2 8
* Output -
* ********
 			1 2 3 5
			4 5 6 4
			7 8 9 1
			4 6 2 8	
*/

public class DisplayWholeMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows for creating 2-d array : ");
		int n = sc.nextInt();
		System.out.print("Enter the number of columns for creating 2-d array : ");
		int m = sc.nextInt();
		// 2-D array initialization
		int[][] arr = new int[n][m];
		System.out.println("Enter the array elements : ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
			arr[i][j] = sc.nextInt();
		}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
	    }
			sc.close();
	}

}

/*
 * O(1) read as bigo of 1-
 * ***********************
 * 			   // time-complexity : O(m*n)
			   // space complexity : O(1) 						
 */
