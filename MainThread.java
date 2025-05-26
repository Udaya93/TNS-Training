
public class MainThread {
	public static void main(String args[]) {
		int n=5;
		for(int i=0;i<=n;i++) {
			Demothread ob=new Demothread();
		    ob.start();
		}
	}

}
