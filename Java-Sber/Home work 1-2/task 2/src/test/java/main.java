package test.java;
/*
    0kk1n4v4 rnd /09/09/20

 */
import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Consumer;


class Main {

    // 1 часть подсчет уникальных слов в файле
    public static void main(String[] args) throws Exception {
        File file = new File("C:\\temp\\test.txt");
        BufferedReader filereader = new BufferedReader(new FileReader(file));
        String linefromfile = filereader.readLine();
        Map<String, Integer> tempmap = new HashMap<String, Integer>();

        while ((linefromfile != null)) {
            String[] singlewords = linefromfile.split(" ");
            for (String word : singlewords) {
                tempmap.put(word, word.hashCode());
                linefromfile = filereader.readLine();
            }
        }
        System.out.println("Количество уникальных элементов :" + tempmap.size());

        // 4 часть вывода файла наоборот
        System.out.println("Выводим файл в обратном порядке :");

        List<String> list = new ArrayList<String>();
        Scanner in = new Scanner(new File("C:\\temp\\test.txt"));
        while (in.hasNextLine()) {
            list.add(in.nextLine());
        }
        for (int i = list.size()-1; i >=0; i--) {
            System.out.println(list.get(i));
        }





    }



}





