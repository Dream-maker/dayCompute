package homework;

import java.util.Scanner;

public class dayCompute {

	static int year;
	static int month;
	static int day;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("please enter the year month day like (1995 5 23):");
Scanner sc = new Scanner(System.in);
year = sc.nextInt();
month = sc.nextInt();
day = sc.nextInt();

	}

	public boolean isLeapYear(int n) { //judge this year is a leap year or not
		if (n % 400 == 0) {
			return true;
		} else if (n % 100 == 0) {
			return false;
		} else if (n % 4 == 0) {
			return true;
		} else {
			return false;
		}

	}
}
