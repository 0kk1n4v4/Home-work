package test.java;

/* 0kk1n4v4
https://ru.wikipedia.org/wiki/Прямоугольник
Прямоугольник — четырехугольник, у которого все углы прямые (равны 90 градусам).

*имеет 4 стороны.
* есть площадь
* есть периметр
* есть длина стороны

 */

public class rectangle {
        int a, b;

        public static void main(String[] args) {

        }
        // Форумла рассчета площади sq = a * b
        public static int square (int a, int b){
                int sq = a * b;
                return sq;
        }
        // формула рассчета периметра P=2(a+b)
        public static int perimeter (int a, int b){
                int temp = 2 * (a * b);
                return temp;
        }
        //Выводим длину стороны
        public static void side (int a){
                System.out.println("Длина любой из 4х сторон"+a);
        }



}
