package base.week1.Homework;

import java.util.Scanner;

public class Homework13 {
    public static void main(String[] args) {
        Scanner sv = new Scanner(System.in);

        System.out.println("Цифра 1");
        int nomberA = sv.nextInt();
        System.out.println("Цифра 2");
        int nomberB = sv.nextInt();
        System.out.println("Цифра 3");
        int nomberC = sv.nextInt();

        if ((nomberA + nomberB + nomberC) > 0 ) {
            nomberA = nomberA * 2;
            nomberB = nomberB * 2;
            nomberC = nomberC * 2;
            System.out.println("A = " + nomberA + "  B = " + nomberB + "  C = " + nomberC);
        } else {
            nomberA = 0;
            nomberB = 0;
            nomberC = 0;
            System.out.println("A = " + nomberA + "  B = " + nomberB + "  C = " + nomberC);

        }
    }
}
