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
public class Exercice8 {
    
    public static void launch() {
        
        System.out.println("*******Exercice8*******");
        
        int valeur = 243;
        
        //Lancement de la boucle pour decrementation
        while (valeur > 0) {
            valeur--;
            
            //Condition pour les multiple de 5 et 10 qui sont pair
            if (valeur%2 == 0 && valeur%5 == 0 && valeur%10 == 0) {
               System.out.println(valeur + " est pair et est un multiple de 5 et de 10");
               
            //Condition pour les multiple de 5 impair
           } else if (valeur%2 != 0 && valeur%5 == 0) {
               System.out.println(valeur + " est impair et est un multiple de 5");
               
            //Condition pour les nombre pair   
           } else if (valeur%2 == 0) {
               System.out.println(valeur + " est pair");
               
            //Condition pour les nombre impair   
           } else {
               System.out.println(valeur + " est impair");
           }
        }
        
        System.out.println();
    }
    
}
