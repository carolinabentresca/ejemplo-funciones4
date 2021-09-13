/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplopromedio;

import java.util.Scanner;

public class EjemploPromedio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, n3;
        double promedio;
        System.out.println("INGRESE LA PRIMERA NOTA: ");
        n1 = sc.nextInt();
        System.out.println("INGRESE LA SEGUNDA NOTA: ");
        n2 = sc.nextInt();
        System.out.println("INGRESE LA TERCERA NOTA: ");
        n3 = sc.nextInt();
        System.out.println();
        System.out.println("SU PROMEDIO ES: " + (promedio = GetPromedio(n1, n2, n3)));
        System.out.println("*****************");
        if (promedio >= 7 && promedio <= 10) {
            System.out.println("SU NOTA ES EXCELENTE!!!");
        } else if (promedio >= 4 && promedio <= 6) {
            System.out.println("SU NOTA ES REGULAR!!!");
        } else {
            System.out.println("SU NOTA ES MUY MALA!!!");
        }
    }

    public static double GetPromedio(int num1, int num2, int num3) {
        return ((num1 + num2 + num3) / 3);
    }

}
