import java.util.Scanner;

public class ReverseProgram {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=s.nextInt();
		int rev=0,rem=0,n;
		n=num;
		while(num!=0)
		{
			rem=num%10;
			num=num/10;
			rev=(rev*10)+rem;
			
		}
		System.out.println("Number="+rev);
		if(rev==n)
		{
			System.out.println("palindrom number");
		}
		else
			System.out.println(" Not palindrom number");	
	}

}
