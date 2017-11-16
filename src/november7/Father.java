package november7;


public class Father extends RuntimeException implements AutoCloseable {

    protected void drink() throws Error {
        System.out.println("i'm drinking");
    }

    @Override
    public void close() throws Exception {

    }
}
