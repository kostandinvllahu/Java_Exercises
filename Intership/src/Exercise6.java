
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author User
 */
public class Exercise6 {

    public static void main(String[] args) {
        int min = 0; //charge
        double price = 0;
        //double total = 0;

        Scanner x = new Scanner(System.in);
        System.out.println("Enter the minutes in seconds: ");
        min = x.nextInt();
        if (min >= 0 && min <= 20000) {

            if (min <= 180 || min == 0) {
                System.out.println("6$");
            } else {
                price = 6;
                double num = min - 180;
                num /= 10;
                num *= 0.5;
                price += num;
//                for (int i = 180; i < min; i++) {
//                    price += 0.5;
//                }
                System.out.println(price);
            }
        }
    }

}
