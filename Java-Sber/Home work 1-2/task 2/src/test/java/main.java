package test.java;

import java.util.Map;
import java.util.Map;

import java.util.HashMap;

public static void main(String[]args){

        Map<String, String> myMap = new HashMap<>();
        myMap.put("d", "D");
        myMap.put("c", "C");
        myMap.put("b", "B");
        myMap.put("A", "A");
        List<String> myList = Arrays.asList("a", "b", "c");

        Function<Entry<String, String> , Boolean> myCondition =  i -> myList.contains(i.getKey());

        Map<Boolean,List<Entry<String, String>>>  myPartedMap = myMap.entrySet()
        .stream().collect(Collectors.groupingBy(myCondition));

        System.out.println(myPartedMap);


        }








