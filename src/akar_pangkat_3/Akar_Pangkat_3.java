/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package akar_pangkat_3;

import java.util.Scanner;

/**
 *
 * @author Personal
 */
public class Akar_Pangkat_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        double akarBaru, akar, bilangan, galat;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print  ("Masukkan Bilangan = ");
        bilangan = input.nextDouble();
        akar = bilangan;
        galat = akar;
        
        while(galat > 0.000001)
        {
            akarBaru = ( ( (2 * akar) + (bilangan / (akar * akar)) ) / 3);
            galat = akar - akarBaru;
            System.out.printf("akar = %5.7f, galat = %5.7f \n", akar, galat);
            akar = akarBaru;
        }
        System.out.printf ("Akar dari %f adalah %f ", bilangan, akar);
    }
}