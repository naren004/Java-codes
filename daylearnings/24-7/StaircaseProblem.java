import java.util.Scanner;

public class StaircaseProblem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            int minMoves = minMovesToReachStair(x, y);
            System.out.println(minMoves);
        }

        scanner.close();
    }

    public static int minMovesToReachStair(int x, int y) {
        int moves = 0;

        while (x > 0) {
            if (x >= y) {
                x -= y;
                moves++;
            } else {
                x--;
                moves++;
            }
        }

        return moves;
    }
}