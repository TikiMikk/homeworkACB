package base.week1.Home;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner sv = new Scanner(System.in);

        System.out.println("Ведіть число");
        double a = sv.nextDouble();

        if (a >= 0&& a <= 1){
            System.out.println("Число знаходиться в діапазоні від 0 до 1");
        } else {
            System.out.println("Число не входить у відрізок від 0 до 1");
        }
    }
}
