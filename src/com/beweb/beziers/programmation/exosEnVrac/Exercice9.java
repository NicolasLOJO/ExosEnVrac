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
public class Exercice9 {
    
    public static void launch() {
        
        System.out.println("*******Exercice9*******");
        
        int valeur = 243;
        int result = 0;
        int storage = 0;
        
        //Lancement de la boucle pour decrementation
        while (valeur > 0) {
            valeur--;
            
            //Condition pour les multiple de 5 et 10 qui sont pair
            if (valeur%2 == 0 && valeur%5 == 0 && valeur%10 == 0) {
               System.out.print(valeur + " est pair et est un multiple de 5 et de 10 |||");
               
               //petit calcul permettant d'additioner avec la precedente valeur
               storage = valeur + 1;
               
               result = storage + valeur;
               
               System.out.print(" " + valeur + " + " + storage + " = " + result);
               
               if (valeur%5 == 0 && valeur%3 == 0) {
                   
                   //Permet de faire que les multiple de 5 et de 3 qui sont aussi
                   //impair soit vrai
                   boolean bool = true;
                   System.out.println(" ||| " + bool);
               }
               System.out.println();
            //Condition pour les multiple de 5 impair
           } else if (valeur%2 != 0 && valeur%5 == 0) {
               System.out.print(valeur + " est impair et est un multiple de 5");
               
               if (valeur%5 == 0 && valeur%3 == 0) {
                   
                   //Permet de faire que les multiple de 5 et pair soit true
                   boolean bool = true;
                   System.out.println(" ||| " + bool);
               }
               System.out.println();
            //Condition pour les nombre pair   
           } else if (valeur%2 == 0) {
               
               System.out.print(valeur + " est pair");
               
               //Petit calcul pour additionner nombre pair avec le prochain
               //nombre pair
               result = valeur + (valeur + 2);
               
               System.out.print(" ||| " + valeur + " + " + (valeur + 2) + " = " + result);
               System.out.println();
               
               
            //Condition pour les nombre impair   
           } else {
               System.out.println(valeur + " est impair");
           }
        }
        
        System.out.println();
    }
    
}
