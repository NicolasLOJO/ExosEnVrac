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
public class Exercice6 {
    
    public static void launch() {
        
        System.out.println("*******Exercice6*******");
        
        //Initialisation tableau booleen
        boolean tableau[] = new boolean[10];
        
        //Variable servant pour incrementation et boucle
        int i = 0;
        int j = 0;
        int k = 0;
        
        //Boucle pour n'avoir que des true dans les 10 index
        while (j < tableau.length - 1) {
            j++;
            tableau[j] = true;
            
        //System.out.print(tableau[j] + " ");
        }
        
        //Boucle pour n'avoir que des false dans chaque index
        while (k < tableau.length - 1) {
            k++;
            tableau[k] = false;
            
        //System.out.print(tableau[k] + " ");
        }
        
        //Boucle pour alterner true false
        while (i < tableau.length - 1) {
        i++;
        
        if (i%2 != 0) {
            tableau[i] = true;
        }
        System.out.print(tableau[i] + " ");
    }
        System.out.println();
    }
    
}
