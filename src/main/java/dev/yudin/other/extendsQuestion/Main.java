package dev.yudin.other.extendsQuestion;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Animal cat = new Cat();

        List<Animal> listAnimals = new ArrayList<>();
        listAnimals.add(cat);

        System.out.println(cat.sayHello());
        System.out.println(listAnimals.toString());
        System.out.println(cat.getClass());
    }
}
