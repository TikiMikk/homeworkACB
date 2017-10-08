package base.week1.Homework;

import java.util.Scanner;

public class Homework14 {
    public static void main(String[] args) {

        Scanner sv = new Scanner(System.in);

        System.out.println("");
        int nomber = sv.nextInt();

        int a = nomber % 10;
        int b = (nomber / 10) % 10;
        int c = (nomber / 100) % 10;

        int d = (nomber / 1000) % 10;
        int e = (nomber / 10000) % 10;
        int f = (nomber / 100000);

       if (a + b + c == d + e + f){
           System.out.println("Щасливе число");
       } else {
           System.out.println("Звичайне число");
       }
    }
}
