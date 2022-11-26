package lesson14.painter;

abstract public class CorrectFigure {
    protected int size;

    abstract void draw();

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

}
