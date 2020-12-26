import java.util.Scanner;

public class Percentage {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter marks of 5 subjects:");
	int mar=s.nextInt();
	int hin=s.nextInt();
	int eng=s.nextInt();
	int geo=s.nextInt();
	int soc=s.nextInt();
	float total=mar+hin+eng+geo+soc;
	float percent=(total/5);
	System.out.println("Percentage="+percent);
	if(percent>=70)
		System.out.println("Distinction");
	
	else if((percent>=60) && (percent<70))
		System.out.println("First Class");
	
	else if((percent>=50) && (percent<60))
		System.out.println("Second Class");
	
	else if((percent>=40) && (percent<50))
		System.out.println("Pass");
	else
		System.out.println("Fail");
}
}
