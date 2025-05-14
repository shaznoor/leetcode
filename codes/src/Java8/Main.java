package Java8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        System.out.println(solve(N, K));
        scanner.close();
    }

    public static int solve(int N, int K) {
        int total = 0;
        int burnt = 0;
        int candles = N;
        while (candles > 0) {
            total += candles;  // Burn all current candles
            burnt += candles;  // Add to burnt count
            candles = burnt / K;  // Exchange burnt candles for new ones
            burnt = burnt % K;    // Remaining burnt candles after exchange
        }
        return total;
    }
}