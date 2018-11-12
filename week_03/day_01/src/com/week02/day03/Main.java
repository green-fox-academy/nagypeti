package com.week02.day03;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        try{
            for (String line : Files.readAllLines(Paths.get("day_01.iml"))) {
                System.out.println(line);
            }
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
