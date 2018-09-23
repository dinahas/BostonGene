package main.java;

import java.util.Collections;
import java.util.Map;

/**
 * Created by dinahas on 22.09.2018.
 * This class implement thread which deletes minimal value in map
 */
public class DeleteMin implements Runnable {

    private Map<Integer, String> map;

    public DeleteMin(Map<Integer, String> map){
        this.map = map;
    }

    @Override
    public void run() {

        while (true){
            try {
                Thread.sleep(5000);
                if (!map.isEmpty()){
                    Integer min = Collections.min(map.keySet());
                    System.out.println("Value '" + map.get(min) + "' is removed.");
                    map.remove(min);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}