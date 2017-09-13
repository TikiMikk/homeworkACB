package base.week1.Homework;

import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {

        Scanner sv = new Scanner(System.in);

        System.out.println("Швидкість в км");
        double km = sv.nextDouble(); // км = 1 км/ч = 1000/3600 м/с
        System.out.println("Швидкість в м");
        double m = sv.nextDouble();  // м = 1 м/с

        km = (km * 1000) / 3600;

        if (km > m){
            System.out.println("Швидкість, яка задана в км більша");
        } else {
            System.out.println("Швидкість, яка задана в м більша");
        };
        System.out.println(km);
        System.out.println(m);
    }
}
