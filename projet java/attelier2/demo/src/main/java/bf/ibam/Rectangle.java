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
public class Rectangle implements FormeGeometrique {
       	private double largeur;
        private double longeur;

	public Rectangle(double longeur, double largeur) {
		super();
		this.longeur = longeur;
		this.largeur = largeur;	
	}
    
    public double périmètre() {    	
    	       return 2* (longeur+ largeur);
    }

	@Override
	public double perimetre() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'perimetre'");
	}

	@Override
	public double surface() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'surface'");
	}

}
