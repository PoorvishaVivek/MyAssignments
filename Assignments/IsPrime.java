package week1.Assignments;

public class IsPrime {
	
	 int n=20;
	 String result="Prime" ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	IsPrime prime = new IsPrime();
	prime.primenumber();
	}
	
	public void primenumber() {
	for (int i = 2; i <=n; i++) {
		
		for (int j = 2; j <= i ; j++) {
			if (i%j == 0 && i!=j && j!=1) {
				System.out.println(i+ " not a prime");
				result = "Not prime";		

			}
		}
	}
	}
}
	
