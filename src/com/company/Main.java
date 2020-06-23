package com.company;

import java.io.IOException;

public class Main {
    private final static int START_YEAR = 1990;
    private final static int END_YEAR = 2020;
    private static int COUNT = 0;
    private static int COUNT1 = 0;
    private static int SUM = 0;


    public static void main(String[] args) {
        try {
            System.out.println("app v.1.13");
            DataConnection dataConnection = MyAppFactory.create();
            for (int i = START_YEAR; i < END_YEAR; i++) {
                String year = String.valueOf(i);

                SUM = dataConnection.loadData(SUM, year);
                COUNT++;
                double qq = SUM > 0 ? (double) SUM / COUNT : 0;
                if (qq > 0) {
                    System.out.println(i + " " + qq);
                }
                dataConnection.saveData(i, qq, COUNT1);
                COUNT1++;
            }
            System.out.println("gotovo");
        } catch (IOException e) {
            System.out.println("oshibka!");
            e.printStackTrace();
        }
    }
}