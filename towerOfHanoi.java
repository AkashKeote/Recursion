public class towerOfHanoi {
    public static void tower(int cd,char Source,char Helper,char Destination){
       if(cd==0) return;
        tower(cd-1,Source,Destination,Helper); //small pyramid  call     S -> H
        System.out.println(Source+" -> "+Destination);// larger Cd call  S->D
        tower(cd-1,Helper,Source,Destination); // Small pyramid call  H-> D
        return;
    }
    public static void main(String[] args) {
        tower(4,'A','B','C');
    }
}
