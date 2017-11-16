package november30;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

/**
 * Created by Саня on 11.01.2017.
 */

public class Rand  extends Thread /*implements Runnable*/  {

    private String sourceLocation;
    private String targetLocation;
    private int countBlockPotok;
    /*static*/ private int countThread /*= 0*/;

    public Rand(String sourceLocation, String targetLocation, int countBlockPotok, int countThread) {
        this.sourceLocation = sourceLocation;
        this.targetLocation = targetLocation;
        this.countBlockPotok = countBlockPotok;
        /*countThread += 1;*/
        this.countThread = countThread;
    }


    @Override
    public void run() {
        try {

            System.out.println("countThread" + countThread);

            RandomAccessFile in = new RandomAccessFile(sourceLocation, "r");
            RandomAccessFile out = new RandomAccessFile(targetLocation, "rw");


            long buflength = in.length() / countBlockPotok;   //350
            long startBlock = countThread * buflength;        // 350
            long endBlock;

            if(startBlock < (buflength * (countBlockPotok - 1))) {     // 350 < 350
//                System.out.println("111");
                endBlock = startBlock + buflength;
            } else {
//                System.out.println("222");

                endBlock = in.length();
            }

            byte[] buff = new byte[(int) (endBlock - startBlock) /*1000*/];
            in.seek(startBlock);

            /*for (int i = 0; i < b; i++) {
                
            }*/
                in.read(buff);

            Thread.sleep(3000);
            System.out.println("reading block №: " + countThread + " from address " + startBlock);

            out.seek(startBlock);
            out.write(buff);
            System.out.println("writing block №: " + countThread + " from address " + endBlock);

            in.close();
            out.close();

//                System.out.println(buff.length);



        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }


    }
}
