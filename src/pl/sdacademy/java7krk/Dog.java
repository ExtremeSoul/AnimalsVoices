package pl.sdacademy.java7krk;

public class Dog implements SoundMaker {

    @Override
    public void makeSound() {
        System.out.println("HAU HAU");
    }
}

// Klasy abstrakcyjne używamy raczej gdy chcemy zrobić szablon wykorzystywany w innych klasach
// A interfejsów używamy jako jakąś funkcję np wydawanie dźwięków
