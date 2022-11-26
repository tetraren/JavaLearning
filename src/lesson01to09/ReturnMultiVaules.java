package lesson01to09;

interface Result { 
    Object get(String varName);
}

public class ReturnMultiVaules {
    
    static Result test() {
        int a = 1;
        String b = "2";
        return new Result() {
            public Object get(String varName) {
                switch (varName) {
                    case "result1": return a;
                    case "result2": return b;
                    default: throw new IllegalArgumentException();
                }
            }
        };
    }

     public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException  {
        Result r = test();
        System.out.printf("result1 = %d, result2 = %s\n", r.get("result1"), r.get("result2"));
    }
}