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
public class Cercle implements FormeGeometrique {
    private double rayon;

	public Cercle(double rayon) {
		super();
		this.rayon = rayon;
	}
	public double perimetre() {
		return 2* Math.PI*rayon;
	}
	@Override
	public double surface() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'surface'");
	}

}
