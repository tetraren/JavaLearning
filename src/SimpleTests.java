
public class SimpleTests {

    public class TestFinal {
        public final int a;

        public TestFinal(int a) {
            this.a = a;
        }
    }

    public static void main(String[] args) {
        //TestFinal a = new TestFinal(1);
        //TestFinal b = new TestFinal(2);
        SimpleTests tests = new SimpleTests();
        System.out.println((tests.new TestFinal(1)).a);
        System.out.println((tests.new TestFinal(2)).a);


        // Result result = calculate(1,2);
        // System.out.printf("var1=%d var2=%d sum=%d\n", result.var1, result.var2, result.sum);
        // boolean flag = true;

        // if(flag) {
        //     System.out.println(1);
        // } if (flag) {
        //     System.out.println(2);
        // };

    }

    static Result calculate(int var1, int var2) {
        //делаем необходимые вычисления
        int sum = var1 + var2;
        //возвращаем структуру результата с 3 полями
        return new Result(var1, var2, sum);
    }
    
    static class Result {
        public int var1, var2, sum;
        Result(int var1, int var2, int sum) {
            this.var1 = var1;
            this.var2 = var2;
            this.sum = sum;
        }
    }


    public static void main1(String[] args) {
        // System.out.println(isPrime(1));
        // System.out.println(isPrime(2));
        // System.out.println(isPrime(3));
        // System.out.println(isPrime(4));
        // System.out.println(isPrime(5));
        // System.out.println(isPrime(6));
        // System.out.println(isPrime(7));
        // System.out.println(isPrime(8));
        // //System.out.println(primeSum(10));
        //System.out.println(primeSum(10));
        // test.readInt();
        // SimpleTests test2 = new SimpleTests();
        // test2.readInt();

        // System.out.println(void.class.isPrimitive());
        
        //Scanner scan = new Scanner(System.in);
        // System.out.println(scan.hasNextInt());
        //scan.nextInt();
        // System.out.println(scan.hasNextInt());

        // SimpleTests test = new SimpleTests();

        // System.out.println(test.join(1, 2, 3));

        // SimpleTests obj = new SimpleTests();
        // for (Field field: obj.getClass().getDeclaredFields()) {
        //     System.out.printf("%s = %s\n", field.getName(), field.get(obj));
        // }
        // int w = 4;
        // int h = 4;
        // System.out.printf("%s\n%s%s"
        //     ,  String.format(" %s ", "-".repeat(w))
        //     , (String.format("|%s|", (" ".repeat(w)))+"\n").repeat(h)
        //     ,  String.format(" %s ", "-".repeat(w)));
        // String[] nums = new String[5];

        // Scanner input = new Scanner(System.in);
        // //int i;
        // // while(true) {
        // //     try {
        // //         i = input.nextInt();
        // //         break;
        // //     } catch (java.util.InputMismatchException e) {
        // //         System.out.println("WRONG INTEGER!!!");
        // //         input.nextLine();
        // //     }
        // // }
        // //System.out.println(i);
        // // String str = "zzz123zzz";
        // // System.out.println( str.replaceAll("zzz([0-9]+)zzz", "<sup>$1</sup>"));   

        // // Test t = new Test();

        // // for (Field f : t.getClass().getDeclaredFields()) {
        // //     //Object value = f.get(t);
        // //     System.out.printf("%s = %s", f.getName(), (Integer)f.get(t));
        // // }

        // SimpleTests obj = new SimpleTests();
        // for (Field field: obj.getClass().getDeclaredFields()) {
        //     System.out.printf("%s = %s\n", field.getName(), field.get(obj));
        // }

        // SimpleTests obj = new SimpleTests();  
        // Class class1 = obj.getClass();  
        
        // Field[] getfields = class1.getDeclaredFields();  
        // for(int i = 0; i < getfields.length; i++) {  
        //    System.out.println("Field (" +(i+1)+ ")" + getfields[i].getInt((Object)obj)); //get the field and convert into string  
        // }  

        // for (String s : nums) {
 
        //     s = "!";
 
        //     System.out.println(s);
 
        // }
 
        // for (String s : nums) {
 
        //     System.out.println(s);
 
        // } 

        // String s = new String();
        // System.out.println(s);

        // String name = "Namae";
        // int age = 10;
        // double height = 1.80;
        // System.out.printf("Name: %s  Age: %d  Height: %.2f \n", name, age, height);
    }

    static double sum(double a, double b) {
        return a+b;
    }

}
