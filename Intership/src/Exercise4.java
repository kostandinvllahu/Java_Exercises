
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
public class Exercise4 {

    public static void main(String[] args) {

        int i = 0;
        int j = 0;
        int a;

        Scanner x = new Scanner(System.in);
        System.out.println("Vendos vleren e i : ");
        i = x.nextInt();
        if (i >= 3 && i <= 100) {
            if (i % 2 != 0) {
                j = i;

                for (a = 1; a < j; a++) {

                    if (a % 2 != 0) {
                        a = 1;
                    } else {
                        a = 0;
                    }
                    System.out.println(a);
                }
            } else {
                System.out.println("Nr eshte cift");
            }
        } else {
            System.out.println("Jo me shume se 100 dhe me pak se 3");
        }
    }
}
