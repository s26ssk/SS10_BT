package BT1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Collection<Integer> randomList = new ArrayList<>();
        int maxSize = 10;
        Random random = new Random();
        for (int i = 0; i < maxSize; i++) {
            int randomNumber = random.nextInt(100);
            randomList.add(randomNumber);
        }
        System.out.println(randomList);

        int maxList = Collections.max(randomList);
        System.out.println(maxList);
    }
}
