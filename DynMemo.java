public class DynMemo
{
    static int c=0;
	public static int fib(int n,int[]m) {
		if (m[n]!=-1) return m[n];
		c++;
		if(n<=1) return n;
		m[n]=fib(n-1,m)+fib(n-2,m);
		c++;
		return m[n];
	}
	public static void main(String[] args){
	    int n=15;
	    int []m=new int[n+1];
	    for (int i=0;i<m.length;i++){
	        m[i]=-1;
	    }
	    System.out.println(fib(n,m));
	    System.out.println(c);
	}
}