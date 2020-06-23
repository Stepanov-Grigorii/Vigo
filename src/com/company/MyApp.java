package com.company;

import java.io.*;

public class MyApp implements DataConnection {

    public int loadData(int sum, String year) throws IOException {
        FileInputStream file = new FileInputStream("resources/1.txt");
        StringBuilder fileDataStr = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                fileDataStr.append(line).append("\n");
            }
        }

        String[] lines = fileDataStr.toString().split("\n");
        for (String line : lines) {
            String[] splitLine = line.split(" ");
            if (splitLine.length != 4) {
                continue;
            }
            if (splitLine[2].contains(year)) {
                sum = sum + Integer.parseInt(splitLine[3]);
            }
        }
        return sum;
    }

    public void saveData(int year, double qq, int lineCount) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("resources/statistika.txt", true))) {
            String lineData = lineCount + " " + year + " " + qq + "\n";
            writer.append(lineData);
        }
    }
}
