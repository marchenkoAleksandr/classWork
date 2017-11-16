package october17;

import october17.pet.Cat;
import october17.dog.Dog;
import october17.pet.Pet;

public class OOP {

    public static void main(String[] args) {
//        int a = 100;
//        long b = a;
//
////        Cat cat = new Cat(7);
////        Pet pet = cat;
////        Animal animal = cat;
//
//        long c = 1000;
//        short d = (short) c;

        Animal animalTwo = new Animal();
//        Pet petTwo = (Pet) animalTwo;

        Animal animalDog = new Dog(5);
        if (animalDog instanceof Pet) {
            Pet petDog = (Pet) animalDog;
        }

        System.out.println(animalTwo instanceof Animal);
        System.out.println(animalTwo instanceof Pet);
        System.out.println(animalTwo instanceof Dog);
        System.out.println(animalDog instanceof Animal);
        System.out.println(animalDog instanceof Pet);
        System.out.println(animalDog instanceof Dog);
        System.out.println(animalDog instanceof Cat);

//        Pet[] pets = {new Dog(1), new Cat(4), new Dog(2), new Cat(3)};
//
//        for (Pet pet : pets) {
//            pet.atack();
//        }
//        Cat liza = new Cat(5);
//        Dog jack = new Dog(3);
//
//        whoIAm(liza);
//        whoIAm(jack);

        Pet[] pets = new Pet[10];
        for (int i = 0; i < pets.length; i++) {
            pets[i] = getSomePet();
        }

//        Pet[] pets = {getSomePet(), getSomePet(), getSomePet(), getSomePet(), getSomePet()};
//
        for (Pet pet : pets) {
            System.out.println(pet.getClass().getSimpleName());
        }



        Pet pet = getSomePet();
        if (pet instanceof Dog) {
            Dog dog = (Dog) pet;
        } else {
            Cat cat = (Cat) pet;
        }
    }

    public static void whoIAm(Pet pet) {
        System.out.println(pet.getClass().getSimpleName());
    }

    public static Pet getSomePet() {
        return (int)((Math.random() * 10)) % 2 == 0 ? new Cat(1) : new Dog(2);
    }
}
