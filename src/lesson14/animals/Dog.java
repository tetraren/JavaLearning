package lesson14.animals;

public class Dog extends Animal {
    public void bark() {
        sound("Dog does bark!");
    }

    @Override
    public void makeNoise() {
        bark();
    }
}
