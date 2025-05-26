//local,instant,static
public class DemoVariables {
	
	// instance variable
	public String name="value1";
	
	//static variable
	static String res="value";
	
	void display()
	{
		//local variable
		String val="local variable";
		System.out.println(val);
	}
	
	public static void main(String args[])
	{
		DemoVariables obj=new DemoVariables();
		obj.display();
		System.out.println(res);
	
	}
}
