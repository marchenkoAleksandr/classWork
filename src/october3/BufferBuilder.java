package october3;

/**
 * Created by kovalchuk on 03.10.2016.
 */
public class BufferBuilder {

    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("Head");
        builder.append(" ").append("first").append(" ,");

        System.out.println(builder.toString());
    }

}
