package october17.pet;

import october17.Animal;
import october17.dog.Dog;

public class OverrideMethods {

    public static void main(String[] args) {

//        Cat cat = new Cat(5);
//        cat.atack();
//
//        Dog dog = new Dog(3);
//        dog.atack();

        Animal animal = new Cat(5);
        animal.setColor("BLACK");

        Animal animal2 = new Dog(4);
        animal2.setColor("WHITE");

        animal.showColor();
        animal2.showColor();

        Pet petDog = (Pet) animal2;
        Pet petCat = (Pet) animal;

        petCat.makeSomeNoize();
        petDog.makeSomeNoize();

        Dog dog = (Dog)animal2;
        Cat cat = (Cat)animal;
        dog.makeSomeNoize();
        cat.makeSomeNoize();
    }
}
