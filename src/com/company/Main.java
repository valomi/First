package com.company;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        try {
            File file = new File("D:\\java_test.txt");
            InputStreamReader fileInputStream = new InputStreamReader(new FileInputStream(file), "UTF-8");
            BufferedReader bfis = new BufferedReader(fileInputStream);
            int i;
            while ((i = bfis.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException exc) {
            System.out.println("ошибка");
        }
    }
}


