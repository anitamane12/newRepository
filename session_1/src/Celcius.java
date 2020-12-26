import java.util.Scanner;

public class Celcius {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter temprature");
		float temp=s.nextFloat();
		float celcius=5*(temp-32)/9;
		System.out.println("Farenhite to celcius:"+celcius);
		
	}

}
