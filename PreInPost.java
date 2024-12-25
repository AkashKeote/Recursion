public class PreInPost {
    public static void Pip(int n){
        if(n==0)return;
         System.out.println("Pre "+ n);
         Pip(n-1);
         System.out.println("In "+ n);
         Pip(n-1);
         System.out.println("Post "+ n);
         return;
    }
    public static void main(String[] args) {
        Pip(2);
    }
}
