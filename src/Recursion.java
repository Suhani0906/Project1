
public class Recursion {
	public static void main(String args[])
	{
		recursiveFunction(10);
	}
	static void recursiveFunction(int i)
	{
		if(i <= 0)
			return;
		else {
			System.out.println(i);
			i--;
			
			recursiveFunction(i);   //Tail recursion
		}
			
	}
	static void recursiveFunction2(int i)
	{
		if(i > 0) {
			System.out.println(i);
			i--;
			
			recursiveFunction2(i);   //Head recursion
		}
		else
			return;
			
	}

}
