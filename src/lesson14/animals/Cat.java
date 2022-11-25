package lesson14.animals;

public class Cat extends Animal {
    public void meow() {
        sound("Cat does meow!");
    }

    @Override
    public void makeNoise() {
        meow();       
    }
}
