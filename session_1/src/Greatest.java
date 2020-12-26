import java.util.Scanner;

public class Greatest {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter three number:");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		
		if(a>b && a>c)
		{
			System.out.println(a+ "is greater");
		}
		else if(b>c)
		{
			System.out.println(b+ " is greater");
		}
		else
		{
			System.out.println(c+" is greater");
		}
		int min=(a<b)&&(a<c)?a:(b<c)?b:c;
		System.out.println("Minimum no is:" +a+" "+b+" "+c+" ="+min);
		
		int min1=a<b?a:b;
		System.out.println("Min is=" +min1);
	}

}

