package homework;

import java.util.Calendar;
import java.util.Scanner;

public class DayComputeUsingJavaClass {	
	public static void main(String[] args) {
		int year0 = 0;
		int month0 = 0;
		int date0 = 0;
		Calendar c0  = Calendar.getInstance();
		Calendar c1 = Calendar.getInstance();
		System.out.println("请输入起始年月日（如1979 1 18）：");
		Scanner sc = new Scanner(System.in);
		year0 = sc.nextInt();
		month0 = sc.nextInt();
		date0 = sc.nextInt();
		c0.set(year0,month0-1,date0);
		long t1 = c1.getTimeInMillis();
		long t0 = c0.getTimeInMillis();
		long days = (t1 - t0)/(60*60*24*1000);
		System.out.print("起始时间距离今天已经有"+days+"天。");
	}

}
