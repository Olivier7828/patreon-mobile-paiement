package bf.ibam.geometrie.figure2D;
import bf.ibam.geometrie.figure;
public class Carre implements figure, figure2D {
    private double cote;

    public Carre() {
        this.cote = 0;
    }

    public Carre(double cote) {
        this.cote = cote;
    }

    public double getCote() {
        return cote;
    }

    public void setCote(double cote) {
        this.cote = cote;
    }



    // calcul du perimetre
    public double Perimetre() {
        return 4 * cote;
    }

    // calcul surface
    public double Surface() {
        return cote * cote;
    }

    // toString
    @Override
    public String toString() {
        return "Carre" +' '+ "surface=" + Surface()+"cm^2" +' '+ "périmetre=" + Perimetre() +"cm";
    }

}
