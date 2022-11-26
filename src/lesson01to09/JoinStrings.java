package lesson01to09;

import java.util.Arrays;

import SimpleTests;

/*
 * Функция, соединяющая в строку любое количество параметров произвольного типа
 */
public class JoinStrings {
    public static String join(Object... values) {
        String result = "";
        for (Object value : values) {
            result += (result == "" ? "" : " ") + String.valueOf( value );
        }
        return result;
    }

    public static String joinAsStream(Object... values) {
        return Arrays.stream(values).map(a -> a.toString()).reduce("", (a,b) -> a + (a == "" ? "" : " ") + b);
    }

    public static void main(String[] args) {
        System.out.println(joinAsStream("1", 2, 'c', 2.0, (byte)1, new SimpleTests()));
        System.out.println(join("1", 2, 'c', 2.0, (byte)1, new SimpleTests()));
    }    
}
