import java.lang.StringBuffer;
public class StringDemo {
	public static void main(String args[]) {
		
		//default buffer capity=16+given strings
		//mutable
		//Thread safe
		//concurrency
		StringBuffer s=new StringBuffer("TNSIF");
		s.append("Training");
		System.out.println(s.length());
		System.out.println(s.capacity());
		// doesnot support upper n lower case System.out.println(s.toUpperCase());
		
		
	//For fast execution,storage String Builder is used
		
		
		//immutable
		String name="TNSIF";
		String name2="TNSIF";
		System.out.println(name);
		if(name.equals(name2)) {
			System.out.println("equal");
		}
		else {
			System.out.println("Not Equal");
		}
		
		String name3= new String("TNSIF");
		String name4=new String("tNSif");
		//System.out.println(name);
		if(name3==(name4)) {
			System.out.println("equal");
		}
		else {
			System.out.println("Not Equal");
		}
		
		
		System.out.println(name3==name4);
		System.out.println(name3.equals(name4));
	
		
	}
}
