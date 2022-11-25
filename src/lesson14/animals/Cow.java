package lesson14.animals;

public class Cow extends Animal {
    public void moo() {
        sound("Cow does moo!");
    }

    @Override
    public void makeNoise() {
        moo();
    }
}
