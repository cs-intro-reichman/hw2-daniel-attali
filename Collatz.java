// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int N = Integer.parseInt(args[0]);
        String mode = args[1];

        for (int seed = 1; seed <= N; seed++) {
            int n = seed;
            int steps = 1;

            if (mode.equals("v")) {
                System.out.print(n + " ");
            }

            // Cas particulier : seed == 1 → 1 4 2 1 (4)
            if (seed == 1) {
                if (mode.equals("v")) {
                    System.out.println("4 2 1 (4)");
                }
                continue;
            }

            while (n != 1) {
                if (n % 2 == 0) {
                    n = n / 2;
                } else {
                    n = 3 * n + 1;
                }
                steps++;
                if (mode.equals("v")) {
                    System.out.print(n + " ");
                }
            }

            if (mode.equals("v")) {
                System.out.println("(" + steps + ")");
            }
        }

        System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
    }

}
