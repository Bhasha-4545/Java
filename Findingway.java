public class Findingway
{
    public static boolean func(int[][] a,int i, int j)
    {
        if((i<0) || (i>=a.length) || (j<0) || (j>=a.length) || (a[i][j]==0)) return false;
        if(a[i][j]==9) return true;
        a[i][j]=0;
        return func(a,i-1,j) || func(a,i+1,j) || func(a,i,j-1) || func(a,i,j+1);
    }
    
	public static void main(String[] args) 
	{
	    int [][] a ={
	        {8,0,0,0},
	        {1,0,0,1},
	        {1,1,0,1},
	        {0,1,1,9}
	    };
	  for(int i=0; i<a.length;i++)
	  {
	      for(int j=0; j<a[0].length; j++)
	      {
	          if(a[i][j]==8)
	          {
	             if(func(a,i,j)==true) System.out.println("Found");
	             else System.out.println("not found");
	          }
	          
	      }
	  }
	}
}