package october31;

public class Program {

    public static void main(String[] args) {

        Outer outer = new Outer(5);
        Outer.Inner inner = outer.new Inner("Anna"); // создание экземпляров внутреннего класса

        System.out.println(inner.getName());
        System.out.println(inner.getId());
        System.out.println(inner.getNick());

        Outer.Nested nested = new Outer.Nested(35); // создание экземпляров вложенного класса

        System.out.println(nested.getAge());
    }

    public static void method(Danced danced) {
        danced.dance();
    }

    public void localExample() {

        if (true) {
            class A {

            }
        }


        class LocalClass {

            int field;

        }

        new LocalClass();
    }

}
