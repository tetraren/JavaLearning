package lesson14.painter;

import java.util.Scanner;

/*
 * Реализуйте класс «Правильная фигура». Для него создайте классы-наследники «Треугольник» и «Квадрат».
 * Пользователь должен иметь возможность ввести длину стороны и выбрать тип фигуры. 
 * Программа должна нарисовать в консоли выбранную пользователем фигуру, используя символы '-', '|', '/', '\'.
 * Обратите внимание, символ '\' в Java необходимо экранировать: '\\'.
 */
abstract public class CorrectFigure {
    private int type;
    private int size;


    public static void main(String[] args) {
        int type, size;
        
        // type = 1;
        // size = 5;
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Введите тип фигуры (1 - треугольник, 2 - квадрат):");
            type = input.nextInt();

            System.out.print("\nВведите длину стороны фигуры:");
            size = input.nextInt();
        }

        System.out.println();

        CorrectFigure figure;

        if(type == 1) {
            figure = new Triangle();
        } else {
            figure = new Square();
        }

        figure.setSize(size);
        figure.draw();
    }

    abstract void draw();

    public void setType(int type) {
        this.type = type;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getType() {
        return type;
    }

    public int getSize() {
        return size;
    }

}
