package study.day1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] pool = getPool();
        String[] sysRedBall = getRedBall(pool);
        String sysBlueBall = getBullBall(pool);
        System.out.println("自己选取球号请输入1，机器随机选择球号请输入2");
        String[] userRedBall = new String[33];
        String userBlueBall = null;
        int mark;
        mark = input.nextInt();
        if(mark == 2){
            userRedBall = getRedBall(pool);
            userBlueBall = getBullBall(pool);
        }
        else if(mark == 1){
            System.out.println("请输入你想要选取的红色号码：");
            int redBall[] = new int[6];
            for(int i = 0; i < 6; i ++){
                redBall[i] = input.nextInt();
            }
            System.out.println("请输入你想要的蓝色球号码：");
            int blueBall;
            blueBall = input.nextInt();
            userRedBall = getRedBall(pool, redBall);
            userBlueBall = getBullBall(pool, blueBall);
        }
        
        System.out.println("本周中奖号码：");
        System.out.println(Arrays.toString(sysRedBall));
        System.out.println(sysBlueBall);
        System.out.println("用户购买的号码：");
        System.out.println(Arrays.toString(userRedBall));
        System.out.println(userBlueBall);

        int codeRed = 0;
        int codeBlue = 0;
        for(String x:sysRedBall){
            for(String y:userRedBall){
                if(x == y)
                    codeRed ++;
            }
        }
        if(sysBlueBall == userBlueBall)
            codeBlue ++;
        System.out.println("中奖情况：");
        System.out.println(getPrise(codeRed, codeBlue));


    }
    public static void CaiSeQiu(){
        System.out.println(Arrays.toString(getPool()));

    }

    /*
    *构造彩色球的奖池pool
     */
    private static String[] getPool(){
        String[] pool = new String[33];
        int i;
        int index = pool.length;
        for(i = 0; i< index; i++){
            if(i < 9){
                pool[i] = "0" + (i + 1);
            }
            else
                pool[i] = (i + 1) + "";
        }
        return pool;
    }

    /*
    *获取红色球
     */
    public static String[] getRedBall(String[] pool){
        String[] redBall = new String[6];
        boolean[] pool1 = new boolean[33];
        int index = 0;
        Random r = new Random();
        while(true){
            int rr = r.nextInt(33);
            if(pool1[rr])
                continue;
            pool1[rr] = true;
            redBall[index] = pool[rr];
            if(++ index == 6)
                break;
        }
        return redBall;
    }

    /*
    *获取蓝色球
     */
    private static String getBullBall(String[] pool){
        Random r = new Random();
        String bullBall = pool[r.nextInt(16)];
        return bullBall;
    }

    /*
    *人工选取红色球
     */
    private static String[] getRedBall(String[] pool, int[] red){
        String[] redBall = new String[6];
        for (int i = 0; i < 6; i ++){
            redBall[i] = pool[red[i] - 1];
        }
        return redBall;
    }

    /*
    *人工选取蓝色球
     */
    private static String getBullBall(String[] pool, int bull){
        String bullBall = pool[bull - 1];
        return bullBall;
    }

    /*
    *中奖情况判断
     */
    private static String getPrise(int codeRed, int codeBlue){
        if(codeRed == 6 && codeBlue == 1)
            return("一等奖");
        else if(codeRed == 6 && codeBlue == 0)
            return("二等奖");
        else if(codeRed == 5 && codeBlue == 1)
            return("三等奖");
        else if((codeBlue + codeRed) == 5)
            return("四等奖");
        else if((codeBlue + codeRed) == 4)
            return("五等奖");
        else if(codeBlue == 1 && codeRed < 3)
            return("六等奖");
        else
            return("未中奖");
    }

}

