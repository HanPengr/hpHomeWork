package day03;

public class HomeWork {
    public static void main(String[] args) {
        // 打印99 乘法表
        System.out.println("正在打印九九乘法表");
        printJiuJiu();
        // 打印等腰三角形
        System.out.println("正在打印等腰三角形");
        printTriangle();
        // 求100以内所有质数的和
        System.out.println("输出100以内所有质数的和:");
        calc();
    }
    public static void printJiuJiu(){
        for (int i = 1; i <=9; i++) {
            for (int j = 1; j <= i; j++) {
                int a = i * j;
                System.out.print(  i + "*" + j + "=" + a + "\t");
            }
            System.out.println();
        }

    }
    public static void printTriangle(){
        for (int i = 1; i <= 6; i++) {
            for (int j = 6 - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k= 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void calc(){
        int sum = 0;
        boolean bool;
        for (int i=2;i<=100;i++){
            bool = true;
            for(int j=2;j<i;j++){
                if(i % j == 0){
                    bool = false;
                    break;
                }
            }
            if(bool){
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}