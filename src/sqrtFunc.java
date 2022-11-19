public class sqrtFunc {

    static double func(double n) {
        return func(n,1);
    }

    private final static double func(double n, double base) {
        if(n == base) return Math.sqrt(base);
        return Math.sqrt(base + func(n, base + 1));
    }

    public static void main(String[] args) {
        System.out.println(func(5));
    }
    
}
