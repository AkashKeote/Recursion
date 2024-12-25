public class zigZag {
    public static void ZigZag(int n){
        if(n==0)return;
         System.out.print(" "+ n);
         ZigZag(n-1);
         System.out.print(" "+ n);
         ZigZag(n-1);
         System.out.print(" "+ n);
         return;
    }
    public static void main(String[] args) {
        ZigZag(1);
    }
}
