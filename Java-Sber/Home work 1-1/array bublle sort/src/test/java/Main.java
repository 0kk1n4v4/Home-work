package test.java;

/* (c) okkinava - rnd 06/09/20
   array bublle sorter
* */
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        //Создаем ридер
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
        //
        Integer y = Integer.parseInt(reader.readLine());



	// Создаем и заполняем массив случайными числам
        int[] array1 = new int [y]; // Массив из х элементов
        for (int i = 0; i < y; i++) {
            int x = (int) (Math.random() * 9);
            array1[i] = x;
            System.out.print(array1[i]);

        }

    }
}
