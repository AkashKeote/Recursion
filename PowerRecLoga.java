import java.util.*;
public class PowerRecLoga {
    public static int powerRec(int a,int b){
        if(b==1)return a;
        if(b==0)return 1;
        int p = powerRec(a,b/2);
      if(b%2!=0){
            return p*p*a;
        }
        else {
            return p*p;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();
     System.out.println(a+" raised to "+b+" is "+powerRec(a,b));
     sc.close();
    }
}
