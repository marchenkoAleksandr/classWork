package october17.pet;

import october17.Animal;

public class Pet extends Animal {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void atack() {
        System.out.println("Я АТАКУЮ");
    }

    void makeSomeNoize() {
        System.out.println("Zzzzzzz");
    }

    @Override
    public void showColor() {
        System.out.println("я домашнее животное, мой цвет " + getColor());
    }
}
