import java.util.Scanner;

public class Simple_I {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter Principle:");
	int p=s.nextInt();
	System.out.println("Enter number of year:");
	float n=s.nextFloat();
	System.out.println("Enter rate of interest:");
	float r=s.nextFloat();
	float si=p*n*r/100;
	System.out.println("Simple Interest:" +si);
}
}
