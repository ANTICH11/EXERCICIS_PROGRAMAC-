/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data2;

import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author alumne-DAM
 */
public class DATA2 {

    public static int dies_mes(int mes) {
        int dias_mes = 0 ;

        switch (mes) {
            case 0 : dias_mes =0 ;//ENERO //
            case 1 : dias_mes= 31;//FEBRERO//
            case 2 : dias_mes= 59 ; //MARZO//
            case 3 : dias_mes =90 ; //ABRIL//
            case 4 : dias_mes =120 ;//MAYO
            case 5 : dias_mes = 151 ;//JUNIO
            case 6 : dias_mes = 181 ;//JULIO
            case 7 : dias_mes = 212 ; //AGOSTO
            case 8 : dias_mes = 243 ; //SEPTIEMBRE
            case 9: dias_mes =273 ; //OCTUBRE
            case 10: dias_mes = 304; //NOVIEMBRE
            case 11 dias_mes = 334 ; //DICIEMBRE
        }
                
        
    }

    public static int Bisiesto(int b) {

        int w = 0;

        if ((b % 4 == 0) && ((b % 100 != 0) || (b % 400 == 0))) {

            w += 1;

        } else {
            w += 0;

        }
        return w;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        GregorianCalendar data = new GregorianCalendar();
        Scanner sc = new Scanner(System.in);

        int dia = (data.get(GregorianCalendar.DATE));
        int mes = (data.get(GregorianCalendar.MONTH));
        int any = (data.get(GregorianCalendar.YEAR));
        //----------------------------------------------------//
        System.out.println("Introduce un dia : ");
        int dia1 = sc.nextInt();
        System.out.println("Tntroduce un mes : ");
        int mes1 = sc.nextInt();
        System.out.println("Introduce un año : ");
        int ano1 = sc.nextInt();

        for (int i = any; any + 1 <= ano1 - 1; i++) {

        }
        
        for( int i = mes +1 ;i<=12;i++){
            dia+ = (dies_mes (mes1));
            
        }
        

        if (Bisiesto(ano1) == 1) {
            System.out.println(("El a�o es bisiesto"));

        } else {
            System.out.println("Este año no es bisiesto ");
        }

    }

}
