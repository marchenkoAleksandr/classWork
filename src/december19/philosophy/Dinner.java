package december19.philosophy;

public class Dinner {

    private static final int COUNT = 10;

    public static void main(String[] args) {
        Fork[] forks = new Fork[COUNT];
        for(int i = 0; i < forks.length; i++) {
            forks[i] = new Fork(i);
        }

        Phylosoph[] phylosophs = new Phylosoph[COUNT];
        for (int i = 0; i < phylosophs.length; i++) {
            if (i == phylosophs.length - 1) {
                phylosophs[i] = new Phylosoph(forks[0], forks[i]);
            } else {
                phylosophs[i] = new Phylosoph(forks[i], forks[i + 1]);
            }
        }

        for (int i = 0; i < phylosophs.length; i++) {
            phylosophs[i].setPriority(i + 1);
            phylosophs[i].start();
        }

    }
}
