package test.java;
/*
Круг — часть плоскости, лежащая внутри окружности
https://ru.wikipedia.org/wiki/Круг

* Радиус — отрезок, соединяющий центр круга с его границей.
* Диаметр — отрезок, соединяющий две точки границы круга и содержащий его центр.
* Сектор — пересечение круга и некоторого его центрального угла, то есть
  часть круга, ограниченная дугой и двумя радиусами, соединяющими концы дуги с центром круга.
* Сегмент — часть круга, ограниченная дугой и стягивающей её хордой.
* Хорда — отрезок, соединяющий любые две точки окружности.

 */
public class Circle {
    int r;

    // Форумла рассчета диаметра = 2 * R
    public static int diametr (int r){
        int tmp = 2 * r;
        System.out.println("Диаметр круга :"+tmp);
        return tmp;
    }

    // РАдиус
    public static int radius (int r){
        System.out.println("Радиус круга :"+r);
        return r;
    }



}
