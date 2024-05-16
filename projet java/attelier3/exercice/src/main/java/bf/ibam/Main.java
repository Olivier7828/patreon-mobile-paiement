package bf.ibam;

import java.util.Scanner;

import bf.ibam.geometrie.figure;
import bf.ibam.geometrie.figure2D.Carre;
import bf.ibam.geometrie.figure2D.Cercle;
import bf.ibam.geometrie.figure3D.Cube;
import bf.ibam.geometrie.figure3D.Sphere;
public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenu et Bonjour!");
         System.out.print("entrez la dimension du coté en cm: ");
        @SuppressWarnings("resource")
        Scanner entree=new Scanner (System.in);
        double cote= entree.nextDouble();
        figure[] tab= {new Carre(cote), new Cube(cote), new Cercle(cote), new Sphere(cote)};
        for(int i=0;i<tab.length;i++)
        {
            System.out.println(tab[i]);
        }
      
    }
}