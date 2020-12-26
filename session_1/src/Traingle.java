import java.util.Scanner;

public class Traingle {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a length:");
		long l=s.nextLong();
		System.out.println("Enter a height:");
		long h=s.nextLong();
		float area=0.5f*l*h;
		System.out.println("Area:" +area);
		
	}

}
