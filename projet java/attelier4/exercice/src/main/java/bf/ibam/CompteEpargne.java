package bf.ibam;

public class CompteEpargne  extends Compte{
    private double taux;
    public CompteEpargne(String num, String prop, double sol, double t){
         super(num, prop, sol);
         taux=t;
    }
    public double getsolde(double sol){
        return (float) (sol*(1+taux/100));
    }
}
