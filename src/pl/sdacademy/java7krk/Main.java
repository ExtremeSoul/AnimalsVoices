package pl.sdacademy.java7krk;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        SoundMaker cat = new Cat();
        SoundMaker dog = new Dog();
        SoundMaker giraffe = new Giraffe();

        //diamonds operator <>
        //Tworzymy liste i inicjujemy ja pusta lista
        List<SoundMaker> animals = new LinkedList<>();

        //Dodajemy obiekty do listy tak by nie była pusta.
        animals.add(cat);
        animals.add(dog);
        animals.add(giraffe);

        for (SoundMaker animal : animals) {
            animal.makeSound();
        }

    }
}
