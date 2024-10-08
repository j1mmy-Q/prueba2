

package com.mycompany.repaso2;

import java.util.Scanner;

/**
 *
 * @author JIMMY
 */

public class Repaso2 {

    public static void main(String[] args) {
        var sc = new Scanner (System.in);
        
        System.out.println("Ingresar numero a");
        int a = sc.nextInt();
        System.out.println("Ingresar numero b");
        int b = sc.nextInt();
        
        if(a == b){
            System.out.println("los numeros son iguales");
        }
        else{
            if(a > b){
                System.out.println("el numero "+a+" es mayor que "+b);
            }
            else{
                System.out.println("el numero "+b+" es mayor que "+a);
            }
        }
    }
 }


