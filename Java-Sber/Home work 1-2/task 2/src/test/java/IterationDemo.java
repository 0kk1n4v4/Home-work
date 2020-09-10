package test.java;

import java.util.Map;

import java.util.HashMap;



class IterationDemo

{

    public static void main(String[] arg)

    {

        Map<String,String> gfg = new HashMap<String,String>();



        // вводим пару имя / URL

        gfg.put("GFG", "geeksforgeeks.org");

        gfg.put("Practice", "practice.geeksforgeeks.org");

        gfg.put("Code", "code.geeksforgeeks.org");

        gfg.put("Quiz", "quiz.geeksforgeeks.org");



        // использование keySet () для перебора ключей

        for (String name : gfg.keySet())

            System.out.println("key: " + name);



        // использование values () для итерации по ключам

        for (String url : gfg.values())

            System.out.println("value: " + url);

    }

}