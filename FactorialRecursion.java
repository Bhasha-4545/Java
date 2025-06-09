public class FactorialRecursion{
	public int fun(int n){
		if(n==1) return 1;
		return n*fun(n-1);
	}
	public static void main(String[] args){
		FactorialRecursion m=new FactorialRecursion();
		System.out.println(m.fun(5));
	}
}