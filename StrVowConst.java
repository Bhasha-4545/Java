import java.util.*;
public class StrVowConst
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a =sc.nextLine();
		
		int vo=0;
		int con=0;
		for (int i =0; i<a.length();i++)
		{
			//char b = ('a' || 'e' || 'o' || 'i' || 'u');
			char ch =a.charAt(i);
			if (ch=='a' || ch=='e' || ch=='o' || ch=='i' || ch=='u'){
				vo+=1;
			}
			else{
				con+=1;
			}
		}
		System.out.println(vo);
		System.out.println(con);
}
}