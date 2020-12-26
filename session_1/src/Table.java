
 
	import java.util.Scanner;

	public class Table{
		public static void main(String[] args)
		{
			Scanner s=new Scanner(System.in);
			System.out.println("Enter a number:");
			int num=s.nextInt();
			int n;
			for(int i=1;i<=10;i++)
			{
				n=num*i;
				//System.out.println(n);
				System.out.println(+num+"* "+i+"="+(num*i));
				
			}
			
					
		}
		

	}



