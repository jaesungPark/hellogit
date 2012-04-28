package chap1;

import java.util.Scanner;

public class Gugudan {

	/**  
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("gugudanfrom:");
//
//		Scanner sc=new Scanner(System.in);
//
//		int i=sc.nextInt();
		int i;
		int j;
		for (i = 2; i <= 9; i++) {
			j = printDan(i);
		}
	}

	private static int printDan(int i) {
		int j;
		for (j = 1; j <= 9; j++)
			System.out.println(i + " * " + j + " = " + j * i);
		return j;
	}

}
