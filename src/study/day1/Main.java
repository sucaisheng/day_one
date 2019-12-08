package study.day1;

import java.util.Scanner;

public class Main {

    private static int age = 18;
    static char str = 'c';
    static String str1 = "sucaisheng";

    public static void main(String[] args){
        /**
         * boolean b = true;//不确定 默认值为false
         *         byte c = 1;
         *         short d = 2;
         *         int e = 4;
         *         long f = 8;
         *         float f1 = 10.4f;//单精度浮点型所占字节数为4,默认值为0.0f
         *         double d1 = 8.0d;//双精度浮点型,默认值为0.0d
         *         char c1 = 'c';//字节数为2，默认值为/u0000
         *         char str = 'b';//Java里面取值就近原则
         *         e = e+10;//类里面不允许直接写表达式，需要在方法中写
         *         Scanner input = new Scanner(System.in);
         *         System.out.println("请输入一个数字:");
         *         int bb = input.nextInt();
         *         System.out.println(bb);
         *
         *         System.out.println("Hello Word!" + age);
         *         testFn();
         *         if(bb>e && bb>20){
         *             System.out.println(bb+e);
         *         }
         */
        int i,mark;
        int[] a = new int[10];
        for(i = 0;i < a.length;i++){
            a[i] = i;
        }
        Scanner input = new Scanner(System.in);
        int  c;
        do {
            mark = 0;
            System.out.println("请输入一个数:");
            c = input.nextInt();
            for(i = 0;i < a.length;i++){
                if(c == a[i]){
                    mark = 1;
                    break;
                }
            }
            if(mark == 1){
                System.out.println("猜的数在其中!");
            }
            else{
                System.out.println("猜的数不对，请再次猜");
            }
        }while(c > 0);
        System.out.println("请输入需要打印的三角形边数：");
        int n;
        n = input.nextInt();
        printAngle(n);

    }

    /*
     *打印字符str1
     */
    public static void testFn(){
        System.out.println(str);
    }

    public static void printAngle(int num){
        int i,j;
        for(i = 1;i <= num;i++){
            for(j = 1;j <= num-i;j++){
                System.out.print(" ");
            }

            for(j = 0;j < i * 2-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}

