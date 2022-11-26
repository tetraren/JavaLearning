package lesson14.painter;

public class Square extends CorrectFigure {

    @Override
    void draw() {

        int width = this.size;

        drawLine(width, "*", "-", "*");
        for(int i = 0; i < width; i++) {
            drawLine(width, "|", " ", "|");
        }
        drawLine(width, "*", "-", "*");
    }

    private void drawLine(int width, String first, String fill, String last) {
        System.out.print(first);
        for(int i = 0; i < width; i++) {
            System.out.print(fill);
        }
        System.out.println(last);
    }

}
