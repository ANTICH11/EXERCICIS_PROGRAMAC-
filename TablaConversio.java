/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablaconversio;

/**
 *
 * @author alumne-DAM
 */
import java.util.Scanner;

public class TablaConversio {

    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc = new Scanner(System.in);
        // LA X FERA REFERENCIA A LA CONVERSIÓ DE CELCIUS A FARENHEIT
        double x = 0;
        double y = 0;
        double resultat = (x - 32) / 1.8;
        double resultat1 = (1.8 * y + 32);

        System.out.println("Elige una opción: 1-CELCIUS A FARENHEIT. 2-FARENHEIT A CELCIUS");
        int d = sc.nextInt();
        System.out.println("AHORA INDICA EL VALOR QUE QUIERES CONVERTIR ");
        double z = sc.nextDouble();

        if (d == 1) {

            System.out.println("El resultat de la conversió es :" + resultat);
        } else {
            System.out.println("El resultat de la conversió es : " + resultat1);
        }

        //x = sc.nextDouble();
    }// LA Y FERA REFERENCIA A LA CONVERSIO DE FARENHEIT A CELCIUS

}
