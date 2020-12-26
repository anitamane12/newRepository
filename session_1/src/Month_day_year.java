import java.util.Scanner;

public class Month_day_year {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number of days:");
		int days=s.nextInt();
		int year,month,day;
		
		year=days/365;
		days=days-(365*year);
		month=days/30;
		day=days-(30*month);
		
		System.out.println("Year="+year);
		System.out.println("Month="+month);
		System.out.println("Days="+day);
		
		
	}

}
