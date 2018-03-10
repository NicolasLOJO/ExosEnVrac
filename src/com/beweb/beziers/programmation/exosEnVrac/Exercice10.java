/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beweb.beziers.programmation.exosEnVrac;

/**
 *
 * @author niko
 */
public class Exercice10 {
    
    public static void launch() {
        
        System.out.println("*******Exercice10*******");
        
        //Mes variable qui serve a la boucle
        long nombre1 = 0;
        long nombre2 = 1;
        long result = 0;
        int longueur = 100;
        int loop = 0;
        
        System.out.print(nombre1 + " ");
        
        //Boucle permettant de calculer le resultat avec le nombre actuelle
        //plus le nombre precedent
        while (loop < longueur) {
            loop++;
                
            nombre1 = nombre2;
            nombre2 = result;
            result = nombre1 + nombre2;
            
            System.out.print(result + " ");
        }
        
        System.out.println();
        
    }
    
}
