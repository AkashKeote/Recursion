class MakePower{
    public static int Power(int a,int b){
        int pow =1;
        for(int i=1;i<=b;i++){
            pow*=a;
        }
        return pow;
    }
    public static void main(String[] args) {
              System.out.println(Power(2,5));
    }
}