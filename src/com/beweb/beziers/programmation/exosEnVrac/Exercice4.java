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

//la variable entiere va valloir -2 dans notre cas
public class Exercice4 {
    
    public static void launch() {
        
        System.out.println("*******Exercice4*******");
        
        //Declaration de nos variable
        boolean flag = true;
        int entiere = 0;
        
        //Condition qui va incrementer ou decrementer selon le booleen
        if (flag == false) {
            entiere++;
        } else {
            entiere--;
        }
        
        //On inverse notre booleen
        flag = false;
        
        //on recrée une condition qui va incrementer ou decrementer selon booleen
        if (flag == true) {
            entiere ++;
        } else {
            entiere --;
        }
        
        System.out.println(entiere);
        
        System.out.println();
    }
    
}
