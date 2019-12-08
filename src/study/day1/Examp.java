package study.day1;

import org.junit.Test;

import java.util.Scanner;

public class Examp {
    @Test
    public void Fin() {
        int r = 5;
        int h = 6;
        double pi = 3.14;
        System.out.println("圆柱体体积为：" + (pi * r * r * h));

    }

    @Test
    public void Fine() {//运算的优先级
        int i = 6;
        int j = 10;
        if (i < 7 || j++ > 10) {
            System.out.println(i + j);
        } else {
            System.out.println(i - j);
        }
        if (i < 7 & j++ > 10)
            System.out.println(i + j);
        else {
            System.out.println(i - j);
        }
    }

    @Test
    public void Finc() {//求圆柱体体积
        Scanner input = new Scanner(System.in);
        System.out.println("请输入圆柱体的半径：");
        int r = input.nextInt();
        System.out.println("请输入圆柱体的高：");
        int h = input.nextInt();
        double pi = 3.14;
        System.out.println("圆柱体的体积为：" + (pi * r * r * h));
    }

    @Test
    public void Fin2() {//if else 练习
        int sore = 99;
        if (sore >= 90) {
            System.out.println("A");
        } else if (sore >= 80) {
            System.out.println("B");
        } else if (sore >= 70) {
            System.out.println("C");
        } else if (sore >= 60) {
            System.out.println("D");
        } else {
            System.out.println("E");
        }
    }

    @Test
    public void Fin3() {//闰年判断
        int year = 2021;
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("是闰年");
        } else {
            System.out.println("不是闰年");
        }
    }

    @Test
    public void Fin4() {//三目运算符求最小值
        int i = 50;
        int j = 40;
        System.out.println(i < j ? i : j);
    }

    @Test
    public void Fin5() {
        char t = '晴';
        double w = 30.5;
        if (t == '晴') {
            if (w < 30)
                System.out.println("逛街");
            else {
                System.out.println("逛公园");
            }
        } else {
            if (w > 25)
                System.out.println("看电影");
            else
                System.out.println("玩游戏");
        }
    }

    @Test
    public void Fin6(){
        int i = 0;
        while(i < 100){
            if(i%2 == 0){
                System.out.println("偶数：" + i);
            }else{
                System.out.println("奇数：" + i);
            }

            if(i%3 == 0 && i!=0){
                System.out.println("3的倍数：" + i);
            }
            i++;
        }
    }
}
