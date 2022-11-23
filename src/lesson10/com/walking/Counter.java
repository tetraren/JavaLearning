package lesson10.com.walking;

/*
 * реализовать класс счетчика, который хранит название счетчика и его значение, 
 * его единицы измерения, а также обеспечивает доступ к значениям. 
 * Название счетчика и его единицы измерения должны быть неизменны.
 */
public class Counter {
    final String name;
    final String unit;
    int counter;
    
    public Counter(String name, String unit, int counter) {
        this.name = name;
        this.unit = unit;
        this.counter = counter;
    }
    public Counter(String name, String unit) {
        this(name, unit, 0);
    }

    public int getCounter() {
        return counter;
    }

    public int increment() {
        return ++counter;
    }

    public int increment(int value) {
        counter += value;
        return counter;
    }

    public int decrement() {
        return --counter;
    }

    public int decrement(int value) {
        counter -= value;
        return counter;
    }

    public String toString() {
        return String.format("%s: %d %s", this.name, this.counter, this.unit);
    }

}
