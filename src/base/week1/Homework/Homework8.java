package base.week1.Homework;

import java.util.Scanner;

public class Homework8 {
    public static void main(String[] args) {

        Scanner sv = new Scanner(System.in);

        System.out.println("Назва продукту");
        String productName = sv.next();
        System.out.println("Ціна");
        int product = sv.nextInt();

        if (product > 1000) {
            product = product - (product * 1 / 10);
            System.out.println("Ціна зі знижкою: " + product);
        } else {
            System.out.println("Ціна: " + product);
        }


    }
}
