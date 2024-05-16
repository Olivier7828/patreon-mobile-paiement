package bf.ibam;

public class Carre extends Rectangle{
    @SuppressWarnings("unused")
    private double cote;
    public Carre(double cote){
        super(cote, cote);
        this.cote=cote;
    }
}
