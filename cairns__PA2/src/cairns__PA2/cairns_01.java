package cairns__PA2;

import java.util.*;
public class cairns_01 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int num, first, second, third, fourth;

		System.out.print("Please enter a four-digit number\n");
		num = scnr.nextInt();
		
		fourth = ((num%10)+7)%10;
		num /= 10;
		third = ((num%10)+7)%10;
		num /= 10;
		second = ((num%10)+7)%10;
		num /= 10;
		first = ((num%10)+7)%10;
		
		System.out.printf("%d%d%d%d",third,fourth,first,second);
	}

}
