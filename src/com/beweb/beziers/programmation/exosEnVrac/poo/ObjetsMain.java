/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beweb.beziers.programmation.exosEnVrac.poo;

import com.beweb.beziers.programmation.exosEnVrac.poo.exercice1.Personne;

/**
 *
 * @author niko
 */
public class ObjetsMain extends Personne {
    
    public static void main(String[] args) {
    
    Personne maPersonne = new Personne();
    Personne maPersonne1 = new Personne();
    
    
    maPersonne.nom();
    maPersonne1.taille();
    maPersonne.emploi();
    maPersonne1.sexe();
    
    }
}
