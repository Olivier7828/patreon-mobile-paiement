package bf.ibam;

import bf.ibam.classes.FormeGeometrique;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
		FormeGeometrique [] tab = {new Carre(10),new Rectangle(100,50),new Cercle(10)};
		for (FormeGeometrique f : tab ){
			System.out.println(" Le périmètre est : "+ f.perimetre());
	}

    }
}