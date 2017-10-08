package base.week1.Homework;

import java.util.Scanner;

public class Homework10 {
    public static void main(String[] args) {

        Scanner sv = new Scanner(System.in);

        System.out.println("Week");
        int week = sv.nextInt();
        System.out.println("Time - (minute)");
        int time = sv.nextInt();
        int money;

        money = time + 1;

        if (week == 1) {
            System.out.println("Money = " + money);
        } else if (week == 2){
            System.out.println("Money = " + money);
        } else if (week == 3){
            System.out.println("Money = " + money);
        } else if (week == 4){
            System.out.println("Money = " + money);
        } else if (week == 5){
            System.out.println("Money = " + money);
        } else if (week == 6){
            money = money - (money * 2 / 10);
            System.out.println("Money = " + money);
        } else if (week == 7){
            money = money - (money * 2 / 10);
            System.out.println("Money = " + money);
        }


    }
}
