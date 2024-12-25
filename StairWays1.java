public class StairWays1 {
    public static int stairWays(int n) {
        return (n <= 2) ? n : stairWays(n - 1) + stairWays(n - 2);
    }
    
    public static void main(String[] args) {
        System.out.println(stairWays(5)); 
    }
}
