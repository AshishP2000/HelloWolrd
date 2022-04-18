
public class HelloJava {
	public static void main(String []args)
	{
		System.out.println("Hello");
		int x=10;
		double y=12.9;
		double ans=x+y; //implicit
		int res = (int) (x+y);
		char c = 'a';
		int c1=c;
		int ans1 = (int) (c*10.0);
		System.out.print("c char "+c);
		System.out.print("c int "+c1);
		System.out.print("ans "+ans1);
	}

}
