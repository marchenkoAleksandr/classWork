package november16.typed;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        NonTypedContainer container = new NonTypedContainer();
        container.setX(1);
        System.out.println(container.getX());

        TypedContainer<String> typedContainer = new TypedContainer<>();
//        typedContainer.setX("Hello");
        System.out.println(typedContainer.getX());

        TypedContainer<Boolean> cont = new TypedContainer<>();
//        cont.setX(true);
        System.out.println(cont.getX());

        TypedContainer<List<String>> list = new TypedContainer<>();
//        list.setX(new ArrayList<>());
    }
}
