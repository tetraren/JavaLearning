import java.util.Scanner;
/*
 * Нарисовать прямоугольник
 */
public class Square {

    public static void main(String[] args) {

        System.out.println(LineTypes.END.last);

        try (Scanner consoleReader = new Scanner(System.in)) {
            System.out.print("Width:");
            int w = 4;//consoleReader.nextInt();

            System.out.print("Height:");
            int h = 4;//consoleReader.nextInt();

            System.out.println();
            drawRect(w,h);
        }
    }
    
    public enum LineTypes {
        START(' ','-',' '),
        BODY('|',' ','|'),
        END(' ','-',' ');

        public final char first;
        public final char second;
        public final char last;

        private LineTypes(char first, char second, char last) {
            this.first = first;
            this.second = second;
            this.last = last;
        }
    }

    static void drawRect(int w, int h) {
        //углы не считаются по условиям задачи
        //верхние и нижние ребра тоже не считаются по условиям
        //т.е. минимальный прямоугольник 2х2 при w=0 и h=0
        w += 2;
        h += 2;
        
        drawLine(w, LineTypes.START);
        drawRectBody(w, h-2, LineTypes.BODY);
        drawLine(w, LineTypes.END);
    }

    /**
     * @param w ширина
     * @param h высота
     * @param type enum(first, second, last)
     */
    static void drawRectBody(int w, int h, LineTypes type) {
        if(h <= 0) return;
        drawLine(w, type);
        drawRectBody(w, h-1, type);
    }

    /**
     * @param w ширина
     * @param type enum(first, second, last)
     */
    static void drawLine(int w, LineTypes type) {
        drawLineStart(type.first);
        drawLineBody(type.second, w-2);
        drawLineEnd(type.last);
    }

    static void drawLineStart(char s) {
        System.out.print(s);
    }

    static void drawLineBody(char s, int w) {
        if(w <= 0) return;
        System.out.print(s);
        drawLineBody(s, w-1);
    }

    static void drawLineEnd(char s) {
        System.out.println(s);
    }


}

