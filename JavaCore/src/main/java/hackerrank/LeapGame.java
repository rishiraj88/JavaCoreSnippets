package hackerrank;

import java.util.Scanner;

/*
    4
    5 3
    0 0 0 0 0
    6 5
    0 0 0 1 1 1
    6 3
    0 0 1 1 1 0
    3 1
    0 1 0
 */
public class LeapGame {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int nQueries = scanner.nextInt();
        scanner.nextLine();
        while (nQueries > 0) {
            int gameSize = scanner.nextInt();
            int leap = scanner.nextInt();
            scanner.nextLine();
            int[] game = new int[gameSize];
            for (int i = 0; i < gameSize; i++) {
                game[i] = scanner.nextInt();
            }
            System.out.println(canWin(leap, game));
            nQueries--;
        }
        scanner.close();
    }

    static String canWin(int leap, int[] game) {
        int idx = 0, startIdx = 0, endIdx = 0;
        String result = "NO";
        while (idx < game.length - 1) {
            if (game[idx + 1] > game[idx]) {
                startIdx = idx + 1;
            } else if (game[idx + 1] < game[idx]) {
                endIdx = idx;
                if (leap > endIdx - startIdx + 1) {
                    idx += leap;
                }
            }
            if (idx > game.length - 1) {
                return "YES";
            }
            if (leap < endIdx - startIdx + 2) {
                return "NO";
            }
            idx++;
        }
        return "YES";
    }
}
