
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
public class Exercise1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String std1 = null;
        String std2 = null;
        String std3 = null;
        String std4 = null;
        String std5 = null;
        int grd1 = 0;
        int grd2 = 0;
        int grd3 = 0;
        int grd4 = 0;
        int grd5 = 0;
        String klasa1 = "10A";
        String klasa2 = "11A";
        int k1 = 0;
        int k2 = 0;
        int total = 0;

        Scanner x = new Scanner(System.in);

        //======Klasa e dyte===========
        System.out.println("Klasa e pare fut te dhenat: ");
        System.out.println("Emer Mbiemer i studentit *jo me shume se 15 karaktere i gjat* :");
        System.out.println("Studenti 1");
        std1 = x.nextLine();
        if (std1.length() > 15) {
            System.out.println("Provo perseri");
            std1 = x.nextLine();
        }
        System.out.println("Studenti 2");
        std2 = x.nextLine();
        if (std2.length() > 15) {
            System.out.println("Provo perseri");
            std2 = x.nextLine();
        }
        System.out.println("Studenti 3");
        std3 = x.nextLine();
        if (std3.length() > 15) {
            System.out.println("Provo perseri");
            std3 = x.nextLine();
        }

        /*          System.out.println(klasa1 + " " + std1 + " " + grd1);
            System.out.println(klasa1 + " " + std2 + " " + grd2);
            System.out.println(klasa1 + " " + std3 + " " + grd3);
         */
        //============KLASA E Dyte=====================
        System.out.println("Klasa e dyte fut te dhenat: ");
        System.out.println("Emer Mbiemer i studentit *jo me shume se 15 karaktere i gjat* :");
        System.out.println("Studenti 1");
        std4 = x.nextLine();
        if (std4.length() > 15) {
            System.out.println("Jane me shume se 15 karaktere provo perseri");
            std4 = x.next();
        }
        System.out.println("Studenti 2");
        std5 = x.nextLine();
        if (std5.length() > 15) {
            System.out.println("Jane me shume se 15 karaktere provo perseri");
            std5 = x.next();
        }
        //============NOTAT E STUDENTAVE========================

        System.out.println("Notat e cdo studenti *fillon nga 1 deri ne 100 : ");
        System.out.println("Nota e " + std1);
        grd1 = x.nextInt();
        if (grd1 > 100 || grd1 < 0) {
            System.out.println("Gabim nuk lejohet me shume se 100 ose me pak se 1");
            System.out.println("Provo perseri");
            grd1 = x.nextInt();
        }
        System.out.println("Nota e " + std2);
        grd2 = x.nextInt();
        if (grd2 > 100 || grd2 < 0) {
            System.out.println("Gabim nuk lejohet me shume se 100 ose me pak se 1");
            System.out.println("Provo perseri");
            grd2 = x.nextInt();
        }
        System.out.println("Nota e  " + std3);
        grd3 = x.nextInt();
        if (grd3 > 100 || grd3 < 0) {
            System.out.println("Gabim nuk lejohet me shume se 100 ose me pak se 1");
            System.out.println("Provo perseri");
            grd3 = x.nextInt();
        }
        System.out.println("Nota e " + std4);
        grd4 = x.nextInt();
        if (grd4 > 100 || grd4 < 1) {
            System.out.println("Gabim provo perseri");
            grd4 = x.nextInt();
        }
        System.out.println("Nota e " + std5);
        grd5 = x.nextInt();
        if (grd5 > 100 || grd5 < 1) {
            System.out.println("Gabim provo perseri");
            grd5 = x.nextInt();
        }

        //========================================================
        System.out.println(klasa1 + " " + std1 + " " + grd1);
        System.out.println(klasa1 + " " + std2 + " " + grd2);
        System.out.println(klasa2 + " " + std4 + " " + grd4);
        System.out.println(klasa1 + " " + std3 + " " + grd3);
        System.out.println(klasa2 + " " + std5 + " " + grd5);

        //======MESATARJA E DY KLASAVE=======
        System.out.println("Klasa me mesataren me te larte: ");
        k1 = Math.round(grd1 + grd2 + grd3) / 3;
        k2 = Math.round(grd4 + grd5) / 2;

        if (k1 > k2) {
            total = Math.round(k1) / 3;
            System.out.println(klasa1 + " " + total);
            System.out.println(k2);
        } else {
            if (k1 < k2) {
                total = Math.round(k2);;
                System.out.println(klasa2 + " " + total);
            }
        }
    }
}
