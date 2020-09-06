package test.java;

/*
https://ru.wikipedia.org/wiki/Прямоугольный_треугольник

Подразумеваем что у нас прямоугольный треугольник.

* вычисляем площадь
* катеты и гипотенузу

 */

public class Triangle {

    int a,b,c;

    public static int square( int a, int b){ //S=½ab⋅sin(α) 
        int square = (int) (1/2 * a*b * Math.sin(a)); // Не работает! всегда ноль.
       // System.out.println("Площадь прямоугольного треугольника равна :"+square);
        return  square;
    }

    public static int pifagor(int a, int b){
        int tmp = a*a + b*b; //Переписать в дальнейшем на math.pow !
        return tmp;
       // System.out.println("По теореме Пифагора сумма квадратов длин катетов равна :"+tmp);

    }

}
