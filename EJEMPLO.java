/*
 * EJEMPLO.java
 * 
 * Copyright 2017 alumne-DAM <alumne-DAM@EQUIPOSMX>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */

import java.util.Scanner;

public class EJEMPLO {



    public static void main(String[] args) {     
           Scanner sc = new Scanner(System.in);  //crear un objeto Scanner
           String nombre;
           double radio;
           int n;
           System.out.print("Introduzca su nombre: ");       
           nombre = sc.nextLine();  //leer un String
           System.out.println("Hola " + nombre + "!!!");
           System.out.print("Introduzca el radio de la circunferencia: ");
           radio = sc.nextDouble(); //leer un double
           System.out.println("Longitud de la circunferencia: " + 2*Math.PI*radio);
           System.out.print("Introduzca un número entero: ");
           n = sc.nextInt(); //leer un entero
           System.out.println("El cuadrado es: " + Math.pow(n,2));

	
	
		
	}
}

