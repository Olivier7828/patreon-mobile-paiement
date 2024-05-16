/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bf.ibam;

import bf.ibam.classes.FormeGeometrique;

/**
 *
 * @author User
 */
 public class UtilisationFormeGeometrique {
  public static void main(String[] args) {

    FormeGeometrique[] tab = {new Carre(10), new Rectangle(100, 50), new Cercle(10)};
    for (FormeGeometrique f : tab) {
      System.out.println("Le périmètre est : " + f.perimetre());
    }
  }
	
 }

