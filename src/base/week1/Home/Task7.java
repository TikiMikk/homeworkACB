package base.week1.Home;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {

        Scanner sv = new Scanner(System.in);

        System.out.println("Nomber 1");
        int a = sv.nextInt();
        System.out.println("Nomber 2");
        int b = sv.nextInt();
        int c,c1,d,d1;
        c = a / b;
        c1 = b / a;
        d = a % b;
        d1 = b % a;

        if (a % b == 0) {
            String result = a + " / " + b + " = " + c + " Остача " + d;
            System.out.println(" True " + result);
        } else if (a % b >= 1){
            String result = a + " / " + b + " = " + c + " Остача " + d;
            System.out.println(" False " + result);

        } else if (b % a == 0) {
            String result = b + " / " + a + " = " + c1 + " Остача " + d1;
            System.out.println(" True " + result);
        } else if (b % a >= 1 ){
            String result = b + " / " + a + " = " + c1 + " Остача " + d1;
            System.out.println(" False " + result);
        }



    }
}
