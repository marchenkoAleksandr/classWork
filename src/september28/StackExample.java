package september28;

public class StackExample {

    public static void main(String[] args) {
        System.out.println(fibonachi(7));
    }

    static int fibonachi(int n) {

        if (n == 1 || n == 2) {
            return 1;
        } else {
            return fibonachi(n - 1) + fibonachi(n - 2);
        }
    }

}
