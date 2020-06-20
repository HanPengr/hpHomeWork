package day06;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class OutputStreamWriterDemo {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("data.txt",true);
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        osw.write("天青色等烟雨而我在等你");
        osw.write("我还是从前那个少年没有一丝丝改变");
        System.out.println("写入成功");
        osw.close();
    }
}
