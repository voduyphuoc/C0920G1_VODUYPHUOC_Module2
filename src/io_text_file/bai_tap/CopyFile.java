package io_text_file.bai_tap;

import java.io.*;

public class CopyFile {
    public static final String PATH_FILE = "src/io_text_file/bai_tap/File_1.csv";
    public static final String PATH_FILE2 = "src/io_text_file/bai_tap/File_2.csv";
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        try {
            FileReader fileReader = new FileReader(PATH_FILE);
            bufferedReader = new BufferedReader(fileReader);
            FileWriter fileWriter = new FileWriter(PATH_FILE2);
            bufferedWriter = new BufferedWriter(fileWriter);
            String line = null;
            while ((line = bufferedReader.readLine()) != null){
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        }finally {
            bufferedReader.close();
            bufferedWriter.close();
        }
    }
}
