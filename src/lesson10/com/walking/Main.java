package lesson10.com.walking;

/*
 * Ответственность класса, содержащего main() — создание счетчиков. Сам класс также предлагаю назвать Main.
 * Также реализовать в классе Main приватный метод, который позволяет вывести значения счетчиков в виде: 
 * <Название счетчика>: <Значение счетчика>. 
 */
public class Main {
    public static void main(String[] args) {
        var house1 = new CounterAggregation();
        Counter cnt1 = house1.add("Газ", "куб", 2333);

        cnt1.increment();
        cnt1.decrement();
        cnt1.increment(10);
        cnt1.decrement(10);

        house1.add("Горячая вода", "куб", 0);
        house1.add("Холодная вода", "куб", 23);
        
        for(Counter counter : house1.getAll()){
            printer(counter);
        };
    }

    private static void printer(Counter counter) {
        System.out.println(counter);
    }
}
