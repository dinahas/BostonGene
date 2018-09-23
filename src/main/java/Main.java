package main.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by dinahas on 22.09.2018.
 * This class contains method "main" and implements thread
 * which writes value of numbers to map
 * Also there second thread is started
 */

public class Main
{
    private static Map<Integer, String> map = new HashMap<>();

    public static void main(String[] args)
    {
        Thread secThread = new Thread(new DeleteMin(map)); //thread which deletes minimal value
        secThread.start();

        //thread which writes numbers to map
        Scanner scanner = new Scanner(System.in);
        String input;
        while (true){
            input = scanner.nextLine();
            if (!input.equals("")){
                int val = Number.strToNum(input);
                if (val != -1){
                    map.put(val, input.toLowerCase());
                }
                else
                    System.out.println("Wrong number!");
            }
        }
    }
}