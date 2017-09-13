package base.week1.Homework;

import java.util.Scanner;

public class Homework6 {
    public static void main(String[] args) {

        Scanner sv = new Scanner(System.in);

        System.out.println("Швидкість в км/год");
        double speed = sv.nextDouble();
        System.out.println("Відстань в км");
        double distance = sv.nextDouble();
        double time = distance / speed;

        System.out.println(time);


    }
}
