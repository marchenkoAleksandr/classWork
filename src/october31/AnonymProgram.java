package october31;

public class AnonymProgram {

    public static void main(String[] args) {

        final int a = 10;
        int b = 20;

        Danced danced = new Danced() {

            // можете объявлять поля
            int tmp;

            // можете объявлять методы
            void print() {

            }

            // нет конструкторов

            {
                tmp = 100;
            }

            @Override
            public void dance() {

                tmp++;

                System.out.println(a);
//                System.out.println(b++); // must be final or effectively final
                System.out.println("anonymous dance");
            }
        };

        Artist artist = new Artist() {
            @Override
            void printNickName() {
                System.out.println("inline");
            }
        };

//        artist.setNickName("Nigel");

//        System.out.println(artist.getNickName());

        Event event = new Event() {

            @Override
            void action() {
                System.out.println("abstract print");
            }
        };

        danced.dance();

        Danced danced2 = new Danced() {

            @Override
            public void dance() {

            }
        };

        danced2.dance();


        Program.method(new Danced() {

            @Override
            public void dance() {
                System.out.println("Anonymous dance");
            }
        });

    }
}
