package october31;

public class LocalClassExample {

    public void method() {

        // ...in method body
        class LocalMethod {
            int id;
        }

        // ...in conditional expressions
        if (true) {
            class LocalConstruction {
                int id;
            }
        }

        boolean tmp = true;

        // ...in loops
        while (tmp) {

            class LocalLoop {
                int id;
            }

        }

        // ...in block of code
        {
            class LocalConstruction {
                int id;
            }
        }

    }

}
