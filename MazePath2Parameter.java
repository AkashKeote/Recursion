public class MazePath2Parameter {

        public static int maze(int endR,int endC){
            int rightW=0,downW=0;
            if(endC==1&&endR==1) return 1;
            if(endC==1){
                downW += maze(endR-1,endC);
            }
            
            if(endR==1){
                rightW += maze(endR,endC-1);
            }
            else if(endR>1&&endC>1){ 
            rightW += maze(endR,endC-1);
            downW += maze(endR-1,endC);
            }
           return rightW+downW;
        
        } 
        public static void main(String[] args) {
            int endR=4,endC=4;
            System.out.println(maze(endR,endC));
        }
    }
    

