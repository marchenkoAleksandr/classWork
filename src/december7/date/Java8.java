package december7.date;

//import java.time.LocalDate;
//import java.time.LocalTime;

import december7.ser.B;

import java.io.*;
import java.util.Scanner;

public class Java8 {

    public static void main(String[] args) throws IOException {

//        LocalDate date = LocalDate.now();
//        LocalDate other = LocalDate.of(2000, 3, 22);
//
//        System.out.println(date);
//        System.out.println(other);
//
//        LocalTime time = LocalTime.now();
//        System.out.println(time);









    /*    try (BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\кролик\\файл.txt"))) {
            String text;
            for (int i = 0; i < 5; i++) {
                text = br.readLine();
                bw.write(text + "\n");
                bw.flush();
            }
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }*/


        File file2 = new File("D://кролик//файл.txt");
        RandomAccessFile rw = new RandomAccessFile(file2, "rw");

//        int read = 0;
//        String line = null;
        /*for (int i = (int) file2.length(); i >= 0; i--) {
            rw.seek(i);
           int read = rw.read();
            if ((char) read == '\n') {
               String line = rw.readLine();
                System.out.println(line);
            }
        }*/


        String line = "";
        int read = 0;


        long fileLength = file2.length();
        for (int i = (int) fileLength; i >= 0; i--) {
            rw.seek(i);
            read = rw.read();
            line += (char) read;
        }
        System.out.println(line + "\n\n");








//
//        try {
//            FileReader fileReader = new FileReader("D://кролик//файл.txt");
//            BufferedReader reader = new BufferedReader(fileReader);
//
//            String line = null;
//
//            while ((line = reader.readLine()) != null) {
//                System.out.println(line);
//            }
//            reader.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }


    }
}
