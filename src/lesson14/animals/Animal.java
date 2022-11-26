package lesson14.animals;

abstract public class Animal {
    protected void sound(String txt) {
        System.out.println(txt);
    }

    abstract public void makeNoise(); 
}
