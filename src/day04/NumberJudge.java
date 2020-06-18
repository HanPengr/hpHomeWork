package day04;

import java.util.Arrays;
import java.util.Scanner;

import static sun.misc.Version.print;

/*从键盘输入8个整数存放在.个数组中
然后将奇数和偶数分别存入到两个不同的数组中，
并按奇数、偶数交替的顺序输出这两个数组中的所有数据
先交替输出，如果奇数个数多，则在输出剩下的奇数，如果偶数个数多，则再输出剩下的偶数。
提示与要求:
             (1)定义个数组存储从键盘输入的8个整数，先判断这8个整数中奇数和偶数的个数，
               才能定义存储奇数和偶数的数组的长度;
              (2)把个大的数组分别存放在奇数和偶数数组中并交替输出的过程定义为方法
*/
public class NumberJudge {
    public static void main(String[] args) {
        int [] num = new int[8];               //键盘录入8个数
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<8;i++){
            System.out.println("输入第"+(i+1)+"个数");
            num[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(num));

        printNum(num);

    }

    private static void printNum(int[] num) {
        //判断奇偶数并分别存入不同的数组中
        int[] even;  // 偶数数组
        int[] odd;   // 奇数数组
        int evenCount=0, oddCount=0;
        for(int i=0;i<num.length;i++){
            if(num[i]%2==0){
                evenCount++;
            }else{
                oddCount++;
            }              // 统计出奇偶数的个数
        }
        odd = new int[oddCount];
        even = new int[evenCount];
        int k=0, m=0;
        for (int i=0;i<num.length;i++){
            if (num[i]%2==0) {
                even[k] = num[i];
                k++;
            }else{
                odd[m]= num[i];
                m++;
            }
        }
        System.out.println("偶数的个数："+k);
        System.out.println("奇数的个数："+m);
        //交替输出
        if(even.length>odd.length){              //奇数个数少
            for (int i=0;i<odd.length;i++){
                System.out.println(odd[i]+"\t"+even[i]+"\t");
            }
            for(int i=odd.length;i<even.length;i++){
                System.out.println("\t"+even[i]+"\t");
            }
        }else{           //奇数个数多
            for (int i=0;i<even.length;i++){
                System.out.println(odd[i]+"\t"+even[i]+"\t");
            }
            for(int i=even.length;i<odd.length;i++){
                System.out.println(odd[i]+"\t");
            }

        }
    }


}
