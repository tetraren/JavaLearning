package lesson14.animals;

abstract public class Animal {

    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Cat();
        animals[1] = new Dog();
        animals[2] = new Cow();

        for(Animal animal : animals) {
            if(animal != null) { 
                animal.makeNoise();
            }
        }
    }

    protected void sound(String txt) {
        System.out.println(txt);
    }

    abstract public void makeNoise(); 
}
