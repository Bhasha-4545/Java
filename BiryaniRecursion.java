public class BiryaniRecursion{
    public String add(int n){
        if (n==11){
            return "biryani";
            
        }
            System.out.println(n);
            String s =add(n+1);
            System.out.println(n);
            return s;
    }
    public static void main (String[] args){
        BiryaniRecursion m=new BiryaniRecursion();
       System.out.println( m.add(1));
    }
}
