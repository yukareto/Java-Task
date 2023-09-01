package org.example;

public class Numbers {
    public static void main(String[] args) {
        int[] number = {1, 2, 3};

        try {
            System.out.println(number[0]);
            System.out.println(number[4]);
            System.out.println(number[2]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("不正な数字だよ");
        } finally {
            System.out.println("実行終了");
        }
    }
}
