package test.java;
/*   (c)   0kk1n4v4 - rnd 06/09/20
    Не совсем ясное тех. задание.
    Реализовать иерархию объектов Circle, Rectangle, Triangle, Square
    Пока что мутим несколько классов с параметрами и методами вычисления.


 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) throws IOException {
	// write your code here
        //создаем ридер
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
        //Выводим приглашение в консоль
        System.out.println("Вводите поочердно параметры будущих фигур. \nСоздаем Круг. Введите радус круга:");

        //создаем новый объект класса круг
        Circle circle = new Circle();
        // Считываем и присваиваем радус будущего круга
        int x = Integer.parseInt(reader.readLine());
        circle.diametr(x);
        circle.radius(x);

        //Создаем прямоугольник
        System.out.println(""+"\nВведите сторону равностороннего прямоугольника:");
        Rectangle rectangle = new Rectangle();
        int a = Integer.parseInt(reader.readLine());
        rectangle.square(a,a);
        rectangle.perimeter(a,a);


        //Создаем треугольник
        System.out.println(""+"\nВведите сторону треугольника a и b:");
        Triangle triangle = new Triangle();
        a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        System.out.println("Площадь треугольника равна :"+triangle.square(a,b));
        System.out.println("Теорема Пифагора  :"+triangle.pifagor(a,b));



    }
}
