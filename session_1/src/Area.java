import java.util.Scanner;

public class Area {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter radius:");
		float r=s.nextFloat();
		float pie=3.14f;
		float area=pie*r*r;
		float circum=2*pie*r;
		System.out.println("Area of circle:" +area);
		System.out.println("Circumference of circle:" +circum);
		
	}

}
