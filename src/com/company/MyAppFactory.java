package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class MyAppFactory {
    public static MyApp create() throws FileNotFoundException {
        try (PrintWriter writer = new PrintWriter(new File("resources/statistika.txt"))) {
            writer.print("");
        }
        return new MyApp();
    }
}
