
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
public class Exercise2 {
    
    public static void main(String[] args) {
        int s1 = 0;
        int s2 = 0;
        int s3 = 0;
        
        Scanner x = new Scanner(System.in);
        System.out.println("Vendos brinjet e trekendeshit: ");
        System.out.println("Brinja e pare: ");
        s1 = x.nextInt();
        System.out.println("Brinja e dyte");
        s2 = x.nextInt();
        System.out.println("Brinja e trete");
        s3 = x.nextInt();
        if(s1 == s2 || s1 == s3 || s2 == s3){
            System.out.println(s1 + " " + s2 + " " + " " + s3);
            System.out.println("Yes");
        }else{
            if(s1 == s2 && s1 == s3){
            System.out.println(s1 + " " + s2 + " " + " " + s3);
            System.out.println("Yes");
            }
            else{
            System.out.println(s1 + " " + s2 + " " + " " + s3);
            System.out.println("No");
            }
        }
    }
    
}
