package base.week1.day2;

import java.util.Scanner;
public class Shop {
    public static void main(String[] args) {


       Scanner sc = new Scanner(System.in);

        System.out.println("Time");
        int time = sc.nextInt();
        System.out.println("Money");
        double money = sc.nextDouble();
        System.out.println("Name");
        String name = sc.next() ;
        System.out.println("Energy");
        boolean energy = sc.nextBoolean();
        System.out.println("NameProdyct");
        String productName = sc.next();
        System.out.println("Price");
        double productPrice = sc.nextDouble();

        boolean timeLogicRes = time <= 24 &&
                time > 8;

        boolean moneyLogicRes = money >= productPrice;

        boolean finanRes = timeLogicRes && moneyLogicRes
                && energy;
        String resultMessage = " Did you buy " +productName
                + " price " + productPrice + " ? " + finanRes;

        System.out.println(resultMessage);



    }

}
