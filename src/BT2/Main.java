package BT2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> newList = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        for (int i = list.size() - 1; i >= 0 ; i--) {
            int newListItem = list.get(i);
            newList.add(newListItem);
        }
        System.out.println(newList);
    }
}
