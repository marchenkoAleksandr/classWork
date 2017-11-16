package october17.pet;


import october17.pet.Pet;

public class Cat extends Pet {

    int healthCount;

    public Cat(int healthCount) {
        this.healthCount = healthCount;
    }

    public void info() {
        System.out.printf("Name: %s, age: %s, color: %s, Health count: %s%n", getName(), getAge(), getColor(), healthCount);
    }

    @Override
    public void showColor() {
        System.out.println("Я кот, мой цвет " + getColor());
    }

    @Override
    public void makeSomeNoize() {
        System.out.println("MEOW");
    }
}
