public class MazePath4Parameter {
    public static int maze(int currR,int currC,int endR,int endC){
        int rightW=0,downW=0;
        if(currC==endC && currR==endR) return 1;
        if(currC==endC) downW += maze(currR+1,currC,endR,endC);
        if(currR==endR) rightW += maze(currR,currC+1,endR,endC);
        
        else if(currC<endC&&currR<endR){
        rightW += maze(currR,currC+1,endR,endC);
        downW += maze(currR+1,currC,endR,endC);
        }
       return rightW+downW;
    
    } 
    public static void main(String[] args) {
        int currR=1,currC=1,endR=5,endC=5;
        System.out.println(maze(currR,currC,endR,endC));
    }
}
