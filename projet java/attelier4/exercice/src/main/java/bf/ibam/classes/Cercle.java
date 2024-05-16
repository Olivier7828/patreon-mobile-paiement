package bf.ibam.classes;

public class Cercle extends FormeGeometrique {
    private double rayon;
    public Cercle(double rayon){
        super();
        this.rayon=rayon;
    }
    public double perimetre(){
        return 2*Math.PI*rayon;
    }
    
}
