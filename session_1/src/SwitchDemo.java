import java.util.Scanner;

public class SwitchDemo {
	public static void main(String[] args) {
		char ch,ans;
		Scanner s;
		do
		{
			s=new Scanner(System.in);
			
			System.out.println("a.ADD\tb.SUB\tc.MUL\td.DIV\t");
			System.out.println("Enter a choice:");
			ch=s.next().charAt(0);
			System.out.println("Enter two numbers:");
			int a=s.nextInt();
			int b=s.nextInt();
			int c;
			switch(ch)
			{
			case 'a':c=a+b;
			         System.out.println("sum=" +a+"+"+b+"="+c);
			         break;
			case 'b':c=a-b;
	         		 System.out.println("sum=" +a+"-"+b+"="+c);
	         		 break;
			case 'c':c=a*b;
    		 		 System.out.println("sum=" +a+"*"+b+"="+c);
    		 		 break;
			case 'd':c=a/b;
     		 		 System.out.println("sum=" +a+"/"+b+"="+c);
     		 		 break;
     		 default:
     			 System.exit(0);
			}
			System.out.println("Do u want to continue?(Y/N)");
			ans=s.next().charAt(0);
		}while(ans!='N');
	
			
     		 		 
			}
		}
	


