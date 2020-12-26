import java.util.Scanner;

public class Swap {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter two number:");
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println("Before swapping:a="+a+",b="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping:a="+a+",b="+b);
	}

}
