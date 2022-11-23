package lesson10.com.walking;

import java.util.LinkedHashMap;
import java.util.Map;

/*
 * Реализовать сервис CounterService, зона ответственности которого — хранение массива доступных счетчиков, 
 * получение всех доступных счетчиков, получение доступа к счетчику по названию, 
 * увеличение значения счетчика на единицу или заданное значение, а также сброс счетчика до нулевого значения.
 */
public class CounterAggregation {
    Map<String, Counter> counters = new LinkedHashMap<>();

    public Counter add(String name, String unit, int init) {
        var counter = new Counter(name, unit, init);
        counters.put(name, counter);
        return counter;
    }

    public Counter[] getAll() {
        return counters.values().toArray(Counter[]::new);
    }

    public Counter get(String name) {
        return counters.get(name);
    }

    public int increment(Counter counter) {
        return counter.increment();
    } 

    public int increment(Counter counter, int value) {
        return counter.increment(value);
    } 

    public int decrement(Counter counter) {
        return counter.decrement();
    } 

    public int decrement(Counter counter, int value) {
        return counter.decrement(value);
    } 
}
