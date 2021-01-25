
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
public class Exercise3 {
    
    public static void main(String[] args) {
        
        int cube = 0;
       int a = 0;
        Scanner x = new Scanner(System.in);
        
        System.out.println("Vendos numerin e kubave");
        cube = x.nextInt();
        
        for(int i = 0; i<cube; i++){
           a = i;
        }
         System.out.println(a);
    }
}
