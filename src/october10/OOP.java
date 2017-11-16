package october10;


public class OOP {

    public static void main(String[] args) {
        Cat cat = new Cat(7);
        Dog dog = new Dog(5);

        cat.setAge(5);
        cat.setName("Vasya");
        cat.setColor("Orange");

        dog.setName("Sharik");
        dog.setAge(7);
        dog.setColor("Black");

        cat.info();
        dog.info();

        Pet petCat = cat;
        Pet petDog = dog;

        Pet[] pets = {petCat, petDog};

        for (Pet pet : pets) {
            System.out.println(pet.getName());
            pet.makeSomeNoize();
        }

    }

}
