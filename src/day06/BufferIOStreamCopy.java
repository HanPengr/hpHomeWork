package day06;

import java.io.*;

public class BufferIOStreamCopy {
    public static void main(String[] args) {
        try(
                //自动关流  放到try 的小括号中
                FileInputStream fis = new FileInputStream("data.txt");
                FileOutputStream fos = new FileOutputStream("b.txt");
                BufferedInputStream bis = new BufferedInputStream(fis);
                BufferedOutputStream bos = new BufferedOutputStream(fos);
        ) {
            int length = 0;
            byte[] b = new byte[1024];
            while((length=bis.read(b))!=-1) {

                bos.write(b, 0, length);
            }
            bos.flush();//缓冲流写这个
            System.out.println("拷贝成功");
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
