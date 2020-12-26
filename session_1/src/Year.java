import java.util.Scanner;

public class Year {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a year:");
		int year=s.nextInt();
		if(year%400==0)
		{
			System.out.println(year+ "is leap year");
		}
		else if((year%100!=0) && (year%4==0))
		{
			System.out.println(year+ "is leap year");
		}
		else
		{
			System.out.println(year+ "is not leap year");
		}
		
	}
	
}
