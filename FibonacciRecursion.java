public class FibonacciRecursion{
	public int fun(int n){
		if(n<=1) return n;
		return fun(n-1)+fun(n-2);
	}
	public static void main(String[] args){
		FibonacciRecursion m=new FibonacciRecursion();
		System.out.println(m.fun(5));
	}
}