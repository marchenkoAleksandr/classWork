package november9;

public class MyException extends RuntimeException {

    private static final String DEFAULT = "MyExceptionBadHumor";

    public MyException() {
        super(DEFAULT);
    }

    public MyException(String message) {
        super(message);
    }

    public MyException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyException(Throwable cause) {
        super(cause);
    }

    public MyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }


    public static void main(String[] args) {
        MyException myException1 = new MyException("OMG");
        MyException myException2 = new MyException();

        System.out.println(myException1.getMessage());
        System.out.println(myException2.getMessage());
    }
}
