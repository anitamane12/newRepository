package test;

public class B  extends A{
	B()
	{
		System.out.println("sub-class constructor...");
	}
	B(int a)
	{
		
		System.out.println(" sub class parameterized constructor");
		
	}
	public static void main(String[] args) {
		//B b=new B(10);
		A a=new A(10);
	}

}
