package november21.generic;


public interface Converter<R, S> {

    R toR(S name);

    S toS(R name);

}
