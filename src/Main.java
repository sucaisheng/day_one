import java.util.Scanner;

public class Main {

    private static int age = 18;
    static char str = 'c';
    static String str1 = "sucaisheng";

    public static void main(String[] args){
        boolean b = true;//不确定 默认值为false
        byte c = 1;
        short d = 2;
        int e = 4;
        long f = 8;
        float f1 = 10.4f;//单精度浮点型所占字节数为4,默认值为0.0f
        double d1 = 8.0d;//双精度浮点型,默认值为0.0d
        char c1 = 'c';//字节数为2，默认值为/u0000
        char str = 'b';//Java里面取值就近原则
        e = e+10;//类里面不允许直接写表达式，需要在方法中写
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个数字:");
        int bb = input.nextInt();
        System.out.println(bb);

        System.out.println("Hello Word!" + age);
        testFn();
        if(bb>e && bb>20){
            System.out.println(bb+e);
        }
    }

    /*
     *打印字符str1
     */
    public static void testFn(){
        System.out.println(str);
    }
}
