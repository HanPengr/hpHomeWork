package day06;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class InputStreamReaderDemo {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("data.txt");
        InputStreamReader isr = new InputStreamReader(fis);
        int chs =0;
        while((chs = isr.read())!=-1){
            System.out.print((char)chs);
        }

        /*char[] len = new char[14];
        isr.read(len);
        for (int i = 0; i < len.length; i++) {
            System.out.print(len[i]);

        }*/
        isr.close();
    }
}
