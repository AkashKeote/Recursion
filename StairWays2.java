public class StairWays2 {
    public static int stairWaays(int n) {
        // Base cases:
        return (n == 0||n==1) ? 1: (n==2 ? 2:stairWaays(n - 1) + stairWaays(n - 2) + stairWaays(n - 3));
    }

    public static void main(String[] args) {
        System.out.println(stairWaays(4)); // Output the number of ways to climb 4 stairs
    }
}
