package pl.sdacademy.java7krk;

//implements oznacza ze pobieramy z interfejsu
public class Giraffe implements SoundMaker {

    @Override
    public void makeSound() {
        System.out.println("ZYR ZYR");
    }
}
