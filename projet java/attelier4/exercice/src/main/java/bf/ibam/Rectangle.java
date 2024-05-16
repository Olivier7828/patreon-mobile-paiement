package bf.ibam;
import bf.ibam.classes.FormeGeometrique;

public class Rectangle implements FormeGeometrique{
    private double longeur;
    private double largeur;
    public Rectangle(double longeur, double largeur){
        super();
        this.longeur=longeur;
        this.largeur=largeur;
    }
    public double perimetre(){
        return 2*(longeur+largeur);
    }
    public double surface(){
        return longeur*largeur;
    }
}
