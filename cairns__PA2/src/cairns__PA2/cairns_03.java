package cairns__PA2;

import java.util.*;
public class cairns_03 {

	public static void main(String[] args) {
		String[] s =  {"Movies","Books", "Music", "Food", "Sleep"};
		int[][] n = new int[5][10];
		double[] r = new double[] {0,0,0,0,0};
		double avg = 0;
		Scanner scnr = new Scanner(System.in);
		
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				System.out.println("Give your rating for each thing: (between 1 and 10): \n"+(j+1)+"."+s[j]);
				n[j][i] = scnr.nextInt();
			}
		}
		System.out.println("Responses");
		for (int i=0; i<5; i++) {
			System.out.print("\n"+(i+1)+"."+s[i]);
			for (int j=0; j<10; j++) {
				System.out.print(n[i][j]+"\t");
				r[i] = r[i]+n[i][j];
			}
		}

}
}