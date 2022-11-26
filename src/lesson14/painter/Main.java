package lesson14.painter;

import java.util.Scanner;

/*
 * Реализуйте класс «Правильная фигура». Для него создайте классы-наследники «Треугольник» и «Квадрат».
 * Пользователь должен иметь возможность ввести длину стороны и выбрать тип фигуры. 
 * Программа должна нарисовать в консоли выбранную пользователем фигуру, используя символы '-', '|', '/', '\'.
 * Обратите внимание, символ '\' в Java необходимо экранировать: '\\'.
 */
public class Main {
    public static void main(String[] args) {
        int type;
        int size;
        
        // type = 1;
        // size = 5;
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Введите тип фигуры (1 - треугольник, 2 - квадрат):");
            type = input.nextInt();

            System.out.print("Введите длину стороны фигуры:");
            size = input.nextInt();
            
            System.out.println();
        }

        CorrectFigure figure;

        if(type == 1) {
            figure = new Triangle();
        } else {
            figure = new Square();
        }

        figure.setSize(size);
        figure.draw();
    }
    
}
