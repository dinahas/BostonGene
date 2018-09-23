package main.java;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by dinahas on 22.09.2018.
 * This class is used to convert number from String to Integer
 */

public class Number {

    private static Map< String, Integer> map = new HashMap<>();

    static {

        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        map.put("six", 6);
        map.put("seven", 7);
        map.put("eight", 8);
        map.put("nine", 9);
        map.put("ten", 10);
        map.put("eleven", 11);
        map.put("twelve", 12);
        map.put("thirteen", 13);
        map.put("fourteen", 14);
        map.put("fifteen", 15);
        map.put("sixteen", 16);
        map.put("seventeen", 17);
        map.put("eighteen", 18);
        map.put("nineteen", 19);
        map.put("twenty", 20);
        map.put("thirty", 30);
        map.put("forty", 40);
        map.put("fifty", 50);
        map.put("sixty", 60);
        map.put("seventy", 70);
        map.put("eighty", 80);
        map.put("ninety", 90);
        map.put("hundred", 100);
        map.put("thousand", 1000);
    }

    //converting string values to integer using abilities of map
    public static int strToNum(String string){

        Integer res = -1;
        Integer d1, d2, d3, d4, d5, d6;

        String [] number = string.split(" ");

        switch (number.length){
            case 1:
                res = map.get(number[0].toLowerCase());
                if (res == null)
                    res = -1;
                break;
            case 2:
                d1 = map.get(number[0].toLowerCase());
                d2 = map.get(number[1].toLowerCase());
                if (d1 == null || d2 == null){
                    res = -1;
                    break;
                }
                res = d1 + d2;
                break;
            case 3:
                d1 = map.get(number[0].toLowerCase());
                d2 = map.get(number[1].toLowerCase());
                d3 = map.get(number[2].toLowerCase());
                if (d1 == null || d2 == null || d3 == null){
                    res = -1;
                    break;
                }
                res = d1*d2 + d3;
                break;
            case 4:
                d1 = map.get(number[0].toLowerCase());
                d2 = map.get(number[1].toLowerCase());
                d3 = map.get(number[2].toLowerCase());
                d4 = map.get(number[3].toLowerCase());
                if (d1 == null || d2 == null || d3 == null || d4 == null){
                    res = -1;
                    break;
                }
                res = d1*d2;
                if (number[3].toLowerCase().equals("hundred")){
                    res += d3*d4;
                } else {
                    res += d3 + d4;
                }
                break;
            case 5:
                d1 = map.get(number[0].toLowerCase());
                d2 = map.get(number[1].toLowerCase());
                d3 = map.get(number[2].toLowerCase());
                d4 = map.get(number[4].toLowerCase());
                d5 = map.get(number[3].toLowerCase());
                if (d1 == null || d2 == null || d3 == null ||
                        d4 == null || d5 == null){
                    res = -1;
                    break;
                }
                res = d1*d2 + d3*d4 + d5;
                break;
            case 6:
                d1 = map.get(number[0].toLowerCase());
                d2 = map.get(number[1].toLowerCase());
                d3 = map.get(number[2].toLowerCase());
                d4 = map.get(number[3].toLowerCase());
                d5 = map.get(number[4].toLowerCase());
                d6 = map.get(number[5].toLowerCase());
                if (d1 == null || d2 == null || d3 == null ||
                        d4 == null || d5 == null || d6 == null){
                    res = -1;
                    break;
                }
                res = d1*d2 + d3*d4 + d5 + d6;
                break;
            default:
                res = -1;
                break;
        }

        return  res;

    }
}