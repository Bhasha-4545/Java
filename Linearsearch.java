import java.util.*;
public class Linearsearch{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int []arr=new int[5];
		for (int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		int s=sc.nextInt();
		for (int i=0;i<arr.length;i++){
			if(arr[i]==s){
				System.out.println(i);
				System.exit(0);
			}
		}
		System.out.println("not found");
	}
}