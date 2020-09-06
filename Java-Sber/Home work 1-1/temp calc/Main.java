package test.java;

/* (c) okkinava - rnd 06/09/20
 F to C calculator and etc v 0.1
* */

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        {
            Integer temp1 = 0; //Временная переменная с результатом итоговых вычислений
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // Создаем ридер
            //Просим ввести число
            System.out.println("Пожалуйста введите температуру для конвертации");
            // Считываем временную температуру
            Integer temp = Integer.parseInt(reader.readLine()); // Считываем значение и на ходу конвертируем его из строки в число
            //Меню для выбора калькулятора
            String s ="Выберите тип калькулятора. Нажмите соответствующую цифру для типа конвертации." +
                    "\n 1 C - F" +"\n 2. F - C ";
            System.out.println(s); //Выводим строку
            Integer menu = Integer.parseInt(reader.readLine()); // Считыватель для меню

            switch (menu){ // Кейс для двух случаев, а также если будет добавлены еще калькуляторы Кельвины и прочие.
                case 1: { // Коневертируем из Цельсий в Фаренгейты
                    System.out.println(temp +" градусов по Цельсию = "+ (temp * 9/5 + 32) +" градусов по Фаренгейту");
                    break;
                }
                case 2: { // Конвертируем из Фаренгейтов в Цельсий
                    System.out.println( temp + " градусов по Фаренгейту = "+(5*(temp - 32)/9)+" градусов по Цельсию");
                    break;
                }
                default:{ // Действие по умолчанию
                    break;
                }
            }
        }


    }
}
