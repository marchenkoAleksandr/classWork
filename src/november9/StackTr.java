package november9;


import november7.Exc;

public class StackTr {

    public static void main(String[] args) {



        try {
            thr1();
        } catch (Exception e) {
            StackTraceElement[] stackTrace = e.getStackTrace();

            for (StackTraceElement element : stackTrace) {
                System.out.println(element.getMethodName());
            }
        }

    }

    public static void thr1() {
        thr2();
    }

    private static void thr2() {
        thr3();
    }

    private static void thr3() {
        throw new RuntimeException();
    }
}
