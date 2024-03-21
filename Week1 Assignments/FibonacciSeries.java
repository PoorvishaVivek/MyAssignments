package week1.Assignments;

public class FibonacciSeries {
	
	int a=-1;
	int b=1;
	int c;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FibonacciSeries fibo = new FibonacciSeries();
		fibo.fibo();		
	}
	
	public void fibo()
	{
		for (int i =0; i<=10; i++)
		{
			c = a+b;
			System.out.println(c);
			a=b;
			b=c;
			
		}
	}
	
	/*public void fibonacci() {
		for (int i =0; i<=1; i++)
		{
			c = a+b;
			System.out.println(c);
			b=c+a;
			System.out.println(b);
			a=b+c;
			System.out.println(a);
		}
		
	}*/

}
