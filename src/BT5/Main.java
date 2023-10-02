package BT5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String inputString = "Viết chương trình cho sẵn một đoạn văn hoặc một câu, và tìm ra chữ ngắn nhất (ít ký tự nhất) trong câu";
        String[] listString = inputString.split(" ");
        List<String> words = new ArrayList<>();
        for (String word : listString) {
            words.add(word);
        }
        String shortestWord = words.get(0);
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).length() < shortestWord.length()){
                shortestWord = words.get(i);
            }
        }
        System.out.println("Từ ngắn nhất trong đoạn văn là: " + shortestWord);
    }
}
