
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class SimpleTests {

    static String join(List<String> list, String delim) {

        StringBuilder sb = new StringBuilder();
    
        String loopDelim = "";
    
        for(String s : list) {
    
            sb.append(loopDelim);
            sb.append(s);            
    
            loopDelim = delim;
        }
    
        return sb.toString();
    }

    int func(int num) {
        if(num == 1) {
            return 1;
        }

        return 0;
    }

    public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException  {
        var list = new ArrayList<String>();
        list.add("BadWord1");
        list.add("BadWord2");
        list.add("BadWord3");
        for (String word : list) {
            System.out.println(word);
        }
        //GSonBuilder gbuilder = new GSonBuilder();
        double num1 = -Double.MAX_VALUE;
        double num2 = -1.0D;
        //Double num3 = 0D;
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num1 > num2);
        System.out.println(Math.nextAfter(0D, Double.POSITIVE_INFINITY));

    }

}

/*
 * Функция, соединяющая в строку любое количество параметров произвольного типа
 */
class JoinStrings {
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
