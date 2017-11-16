package november21.generic;

public class Gen<R, S> implements Converter<R, S> {

    @Override
    public R toR(S name) {
        return null;
    }

    @Override
    public S toS(R name) {
        return null;
    }

    public static int stringToInt(String str) {
        return Integer.parseInt(str);
    }

    public <T> String anyTypeToString(T object) {
        return object.toString();
    }
}
