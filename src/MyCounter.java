import java.util.Iterator;

public class MyCounter implements Iterable<Integer> {
    int start;
    int max;

    public MyCounter(int start, int max) {
        this.max = max;
        this.start = start;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            private int current = MyCounter.this.start;
            private int max = MyCounter.this.max;

            @Override
            public boolean hasNext() {
                return current <= max;
            }

            @Override
            public Integer next() throws IndexOutOfBoundsException {
                return current++;
            };
        };
    }

    public static void main(String[] args) {
        int odd = 0, even = 0;

        for(int c : new MyCounter(1, 100)) {
            if(c%2 == 0) {
                even++;
            } else if( (c-1) %2 == 0) {
                odd++;
            }
        }
        
        System.out.printf("Четных:%d\n", odd);
        System.out.printf("Нечетные:%d\n", even);
    }

}

