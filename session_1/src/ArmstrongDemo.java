import java.util.Scanner;
public class ArmstrongDemo {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=s.nextInt();
		int sum=0,rem=0,n;
		n=num;
		while(num!=0)
		{
			rem=num%10;
			num=num/10;
			sum=sum+(rem*rem*rem);
			
		}
		
		if(sum==n)
		{
			System.out.println("palindrom number");
		}
		else
			System.out.println(" Not palindrom number");	
	}

}
