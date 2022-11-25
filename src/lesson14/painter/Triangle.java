package lesson14.painter;

public class Triangle extends CorrectFigure {

    @Override
    void draw() {
        int size = getSize();

        int width = size * 2;

        for(int i = 0; i < size; i++) {
            repeat(size-i, " ", "/");
            repeat(i*2, " ", "\\");
            repeat(size-i, " ", "\n");
        }
        repeat(0,"","*");
        repeat(width,"-", "*\n");
    }

    private void repeat(int width, String fill, String last) {
        for(int i = 0; i < width; i++) {
            System.out.print(fill);
        }
        System.out.print(last);
    }
}
