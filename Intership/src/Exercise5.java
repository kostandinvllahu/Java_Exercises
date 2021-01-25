
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
public class Exercise5 {
    public static void main(String[] args) {
       
    int n = 0;
    int m = 0;
    int total = 0;
    
    Scanner x = new Scanner(System.in);
        System.out.println("Vendos vlerat e N dhe M");
        n = x.nextInt();
        m = x.nextInt();
        
        total = n*m*4;
        System.out.println(total);
        
    }
}
