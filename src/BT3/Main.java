package BT3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(22);
        list.add(13);
        list.add(43);
        list.add(35);
        Collections.sort(list);
        Collections.reverse(list);
        System.out.println(list);
    }
}
