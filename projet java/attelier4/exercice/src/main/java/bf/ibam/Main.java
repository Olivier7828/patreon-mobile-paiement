package bf.ibam;

import bf.ibam.classes.Cercle;
import bf.ibam.classes.FormeGeometrique;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Compte c= new Compte(null, null, 0);
        System.out.print(c);
        Animal[] tab={new Lion(), new Tigre(), new Ours()};
        for(int i=0;i<tab.length;i++){
            tab[i].dormir();
        }
        FormeGeometrique [] taolib={new Carre(10), new Rectangle(12, 3), new Cercle(3)};
        for(int i=0;i<taolib.length;i++){
            System.out.print("le périmtre est:", taolib[i].perimetre());
        }
    }
}