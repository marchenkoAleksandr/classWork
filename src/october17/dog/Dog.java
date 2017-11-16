package october17.dog;


import october17.pet.Pet;

public class Dog extends Pet {

    int predannostLevel;

    public Dog(int predannostLevel) {
        this.predannostLevel = predannostLevel;
    }

    public void info() {
        System.out.printf("Name: %s, age: %s, color: %s, Predannost: %s%n", getName(), getAge(), getColor(), predannostLevel);
    }

    @Override
    public void atack() {
        System.out.println("Я СУПЕРАТАКУЮ И КУСАЮ");
    }

    public void makeSomeNoize() {
        System.out.println("GAV");
    }
}
