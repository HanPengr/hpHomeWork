package day04;

/*

猜字符游戏
随机生成5个不重复的英文字母
用户输入5个字母
提示猜了几个，位置对的有几个

 */

import java.util.Arrays;

public class GuessCharGame {
    public static void main(String[] args) {

        char[] input = {'A','B','C','D','E'};
        //随机生成5个不重复的英文字母
        char [] ch =generate();
        System.out.println("输入的字符："+Arrays.toString(input));
        System.out.println("随机生成的字符："+Arrays.toString(ch));
        int [] result = check(input, ch);
        System.out.println("字符对的个数为："+result[1]);
        System.out.println("位置对的个数为："+result[0]);
    }
    public static int[] check(char[] input, char[] ch){
        int []  result = new int[2];
        for(int i=0;i<ch.length;i++){
            for(int j=0;j<input.length;j++){
                if(ch[i]==input[j]){
                    result[1]++;
                    if(i==j){
                        result[0]++;

                    }
                    break;
                }

            }
        }
        return result;
    }
    public static char[] generate(){
        //1. 创建一个5个长度的字符数组
        char [] ch = new char[5];
        //2. 创建英文字母数组
        char [] letters = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        // 3.记录下标的数组
        boolean [] flags = new boolean[letters.length];
        int index = 0;
        for(int i=0;i<ch.length;i++){
            //生成一个随机下标
            do {
                 index = (int) (Math.random() * letters.length);
            }while (flags[index]);
            ch[i] = letters[index];
            ch[i]  = letters[index];
            flags[index] = true;
        }
        return ch;
    }


}
