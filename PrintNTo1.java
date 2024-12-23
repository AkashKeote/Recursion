public class PrintNTo1 {
    public static void decreasing(int n){
        System.out.println(n);
        if(n==1)return;
        decreasing(n-1);
    }
    public static void main(String[] args) {
        decreasing(10);
    }
}
