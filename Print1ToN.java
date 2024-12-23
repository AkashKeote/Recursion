class PrintToN{
    public static void increasing(int n){
        if(n==1)return;
        
        System.out.println(n);
        increasing(n+1);
       
    }
    public static void main(String[] args) {
        increasing(1);
    }
}