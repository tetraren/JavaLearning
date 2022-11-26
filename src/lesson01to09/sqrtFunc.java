package lesson01to09;
/*
 * Вычислить sqrt(1+sqrt(2+sqrt(3+.... +sqrt(n))))
 */
public class sqrtFunc {

    static double func(double n) {
        return func(n,1);
    }

    private static double func(double n, double base) {
        if(n == base) return Math.sqrt(base);
        return Math.sqrt(base + func(n, base + 1));
    }

    public static void main(String[] args) {
        System.out.println(func(5));
    }
    
}
