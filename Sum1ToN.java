public class Sum1ToN {
    public static int sum(int n,int s){
        if(n==0){
            System.out.println(s);
            return s;}
         return sum(n-1,s+n);
       
    }
    public static void main(String[] args) {
        sum(5,0);
    }
}
