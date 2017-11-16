package november9;

import november7.Exc;

/**
 * Created by kovalchuk on 09.11.2016.
 */
public class Suppressed {

    public static void main(String[] args) {

        Exception exception = new Exception();
        exception.addSuppressed(new ArithmeticException());
        exception.addSuppressed(new RuntimeException("runtime"));

        exception.printStackTrace();

        Exception full;

        try {
            // open resource
            // вылетает исключение при чтении из ресурсов
        } catch (Exception ex1) {

            // some logic. For example logging.
            // Вылетает исключение при записи на диск
        } finally {

            try {
                // close resource
                // вылетвет исключение при закрытии ресурсов
            } catch (Exception ex2) {

            }
        }

    }
}
