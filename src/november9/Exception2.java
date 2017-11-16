package november9;

public class Exception2 {

    public static void main(String[] args) {

        int numb = getNumb();
        System.out.println(numb);
    }

    public static int getNumb() {

        try {
//            throwable();
            System.out.println("hi");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
//            return 2; // unreachable
        } finally {
            System.out.println("finally");
            throw new ArithmeticException();
//            return 1;
        }

//        return 1;
    }

    public static void throwable() {
        throw new RuntimeException();
    }

}
