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
public class Exercice11 {
    
    public static void launch() {
        
        System.out.println("*******Exercice11*******");
        System.out.println("Non reussi");
        
        int longueur = 1000;
        long nombre1 = 0;
        long nombre2 = 1;
        long result = 0;
        long[] suite = new long[longueur];
        long[] nombrespairs = new long[longueur];
        
        
        for (int i = 0; i < longueur; i++) {
            
            nombre1 = nombre2;
            nombre2 = result;
            result = nombre1 +nombre2;
            
            if (result%2 == 0) {
                //nombrespairs[i] = new long[i];
                
                
                //System.out.print(suite.length +  " ");
            }
        }
    }
    
}
