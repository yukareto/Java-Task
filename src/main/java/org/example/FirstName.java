package org.example;

import java.util.HashMap;
import java.util.Map;

public class FirstName {
    public static void main(String[] arge) {
        Map<String, String> userMap = new HashMap<>();
        userMap.put("カレン", "大阪府出身。 29歳です。");
        userMap.put("パピヨン", "兵庫県出身。 25歳です。");
        userMap.put("リエーフ", "岡山県出身。 18歳です。");

        System.out.println(userMap.get("カレン"));
        System.out.println(userMap.get("パピヨン"));
        System.out.println(userMap.get("リエーフ"));
    }
}
