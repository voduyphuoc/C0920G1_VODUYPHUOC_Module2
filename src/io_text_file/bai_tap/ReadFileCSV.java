package io_text_file.bai_tap;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileCSV {
    public static final String FILE_PATH = "src/io_text_file/bai_tap/Country.csv";

    public static void read(String FILE_PATH) {
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(FILE_PATH));
            String line = "";
            String cvsSplitBy = ",";
            while ((line = bufferedReader.readLine()) != null) {
                String[] country = line.split(cvsSplitBy);
                System.out.println("Country [code= " + country[4] + " , name=" + country[5] + "]");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        read(FILE_PATH);
    }
}
