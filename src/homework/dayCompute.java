package homework;

import java.util.Scanner;

/*
 * a program to compute days from now to 1995.5.23
 * @author echo
 */
public class dayCompute {

	static int year1 = 0;
	static int month1 = 0;
	static int date1 = 0;
	static int year0 = 1995;
	static int month0 = 5;
	static int date0 = 23;
	static int[] monthDayNum = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		dayCompute.input();
		int days = dayCompute.compute();
		if(days < 0){
			System.out.println("Wrong date!Please input again!");
		}
		else{
			System.out.println(" From today to Java 1.0 published day has been " + days + " days");}
	}

	public static void input() { 
		// the method to get user's input
		// TODO Auto-generated method stub
		System.out.println("please enter the year month day like (1995 5 23):");
		Scanner sc = new Scanner(System.in);
		year1 = sc.nextInt();
		month1 = sc.nextInt();
		date1 = sc.nextInt();
	}

	public static int compute() { 
		// calculate days from the year to 1995
		// TODO Auto-generated method stub
		int result = 0;
		for (int i = year0; i < year1; i++) {
			if (isLeapYear(i)) {
				result = result + 366;
			} else {
				result = result + 365;
			}
		}
		result = result + theDayInYear(year1,month1,date1) - theDayInYear(year0,month0,date0);
		return result;
	}

	public static int theDayInYear(int year, int month, int date) { 
		// calculate days from the day to the first day
																
		int result = date;
		for (int i = 1; i < month; i++) {
			result = result + monthDayNum[i - 1];
		}
		if (isLeapYear(year)) {
			result += 1;
		}
		return result;
	}

	public static boolean isLeapYear(int year) { 
		// judge the year is a leap  year or not
													
		if (year % 400 == 0) {
			return true;
		} else if (year % 100 == 0) {
			return false;
		} else if (year % 4 == 0) {
			return true;
		} else {
			return false;
		}

	}
}
