
public class Fibbonaci {

	public static void main(String[] args)
	{
		int f0=0,f1=1,f3,i;
		System.out.print(f0+","+f1);
		for(i=1;i<5;i++)
		{
		f3=f0+f1;
		f0=f1;
		f1=f3;
		System.out.print(","+f3);
		
		
		}		
	}
	
}
