
public class BreakDemo {
public static void main(String[] args) {
	for(int i=1;i<=10;i++)
	{
		if(i==7)
		{
			//break;  break the innermost loop
			continue;//skip only current statement
		}
		System.out.println(i);
	}
}
}
