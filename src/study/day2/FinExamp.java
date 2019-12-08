package study.day2;

import org.junit.Test;

import java.util.Arrays;

public class FinExamp {
    @Test
    public void Fin1(){
        printHello();
        int c,b;
        c = DoubleData(5);
        b = DoubleData(5,6);
        System.out.println(c + " " + b);
    }

    public void printHello(){
        System.out.println("Hello Word!");
    }

    public int DoubleData(int num){
        return num*2;
    }

    public int DoubleData(int num, int num1){
        return(num + num1);
    }

    @Test
    public void maopao(){
        int[] b = {5,8,2,85,1,13};
        int i,j,temp;
        for(i = b.length -1;i > 0;i --){
            for(j = b.length - 1;j > b.length - i - 1 ;j --){
                if(b[j] < b[j - 1]){
                    temp = b[j];
                    b[j] = b[j-1];
                    b[j-1] = temp;
                }
            }
            System.out.println(Arrays.toString(b));
        }
        for (int x: b) {
            System.out.println(x);

        }
    }


}
