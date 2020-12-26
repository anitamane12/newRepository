import java.util.Scanner;

public class Factorial {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter a number:");
	int num=s.nextInt();
	int fact=1,i;
	for(i=1;i<=num;i++)
	{
		fact=fact*i;
	}
	System.out.println("factorial is:" +fact);
}

}
