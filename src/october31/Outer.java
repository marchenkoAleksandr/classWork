package october31;

public class Outer {

    private int id;

    public Outer(int id) {
        this.id = id;
    }

    public class Inner extends Another {

        {
//            Outer.this   // ссылка на экземпляр предка
        }

        private String name;

//        static int staticField = 1;   // нельзя использовать статик поля
//        static void staticMethod() {} // нельзя использовать статик методы

        public Inner(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public int getId() {
            return id;
        }

        public String getNick() {
            return nick;
        }
    }

    static class Nested {

        static int staticField = 1;
        static void staticMethod() {}

        private int age;

        public Nested(int age) {
            this.age = age;
        }

        public int getAge() {
            return age;
        }
    }

}
