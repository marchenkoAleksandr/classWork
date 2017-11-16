package november30;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Саня on 11.01.2017.
 */
public class Main {


    public static void main(String[] args) {


        int countBlock = 5; // количество потоков

//        File fileInputStream = new File("i:/1111/Новый проект.avi");
        //        long length = fileInputStream.length();
//        System.out.println(length);
//        File fileOutputStream = new File("j:/Новая папка/Новый проект.avi");


        List<Rand> tasks = new ArrayList<>();
        for (int i = 0; i < countBlock; i++) {

            tasks.add(new Rand("i:/1111/Новый проект.avi", "j:/Новая папка/Новый проект.avi", countBlock, i));
        }


        ExecutorService service = Executors.newFixedThreadPool(countBlock);

        for (Rand rand : tasks) {
            service.submit(rand);
        }
        service.shutdown();

        /*service.submit(new Rand("i:/1111/Новый проект.avi", "j:/Новая папка/Новый проект.avi", countBlock));*/

//        for (int i = 0; i < countBlock /*+ 1*/; i++ ){
//            Rand ct = new Rand("i:/1111/Новый проект.avi", "j:/Новая папка/Новый проект.avi", countBlock, i);
//            ct.start();
//        }



    }
}
