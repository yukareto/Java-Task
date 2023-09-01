package org.example;

import java.util.ArrayList;
import java.util.List;

public class Eat {
    public static void main(String[] args) {
        List<String> sweets = new ArrayList<>();
        sweets.add("ケーキ");
        sweets.add("シュークリーム");
        sweets.add("フルーツタルト");
        sweets.add("カヌレ");

        System.out.println(sweets.size());

        for (String sweet : sweets) {
            System.out.println(sweet);
        }
    }
}
