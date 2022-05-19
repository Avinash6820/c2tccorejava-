package operators;

public class UnaryOperators
{
	public static void main(String[] args)
	{
		int a=8;
		int b=a;
		System.out.println("before incrementing"+b);
		int b1=a++;
		System.out.println("after incrementing"+b1);
		int c=a;
		System.out.println("before decrementing"+c);
		int c1=a--;
		System.out.println("after decrement");
	}
	

}
