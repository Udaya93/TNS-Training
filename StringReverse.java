
public class StringReverse {
	public static void main(String args[]) {
		String str="TNSIF";
		String rev="";
		char ch;
		for(int i=0;i<str.length();i++) {
			ch=str.charAt(i);
			rev=ch+rev;
		}
		System.out.println(rev);
	}
}
