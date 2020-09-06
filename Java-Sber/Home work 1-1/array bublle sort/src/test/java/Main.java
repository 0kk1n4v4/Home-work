package test.java;

/* (c) okkinava - rnd 06/09/20
   array bublle sorter
* */
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Введите любое положительное число для создания динамического одномерного массива.");
        //Создаем ридер
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
        // Считываем переменную для создания массива длины х
        Integer y = Integer.parseInt(reader.readLine());
        if (y <= 0 ){ // Проверяем что ввели, выводим предупреждение в случае некорректного значения
            System.out.println("Нельзя создать массив длиною : "+ y);
        } else { // все корректно, работаем дальше

            // Создаем и заполняем массив случайными числам
            int[] array1 = new int [y]; // Массив из х элементов
            for (int i = 0; i < y; i++) { // Для каждого из цикла делаем
              //  int x =
                array1[i] = (int) (Math.random() * 10); // Генерируем случайное число и присваиваем в массив[i]
                 System.out.print(+array1[i]); // Выводим массив в консоль
            }
            System.out.print(" Ваш массив. Вы создали массив длинною в : "+ y +" цифр."+"\nПриступаем к сортировке. Будет "+y+" итераций :"); // Выводим в консоль

            for (int ii = 0; ii < array1.length; ii++) {
              //  System.out.print(ii);
                for (int i = 0; i < array1.length-1; i++) {
                    if (array1[i] > array1[i+1]) {
                        int tmp = array1[i];
                        array1[i] = array1[i+1];
                        array1[i+1] = tmp;
                    }
                }
            }
            System.out.println(""); /// Переносим строку
            for (int i = 0; i < array1.length; i++) { // Для каждого из цикла делаем

                System.out.print(array1[i]); // Выводим массив в консоль
            }


        }




    }
}
