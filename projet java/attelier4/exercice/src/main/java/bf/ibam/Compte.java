package bf.ibam;
public class Compte {
    private String numero;
    private String proprietaire;
    private double solde;
    public Compte(String numero, String proprietaire, double solde ){
         this.numero=numero;
         this.proprietaire=proprietaire;
         this.solde=solde;
    }
    public String getNum(){
        return numero;
    }
    public String getProp(){
        return proprietaire;
    }
    public double getSol(){
        return solde;
    }
    public void setNum(String numero){
        this.numero=numero;
    }
    public void setProp(String proprietaire){
        this.proprietaire=proprietaire;
    }
    public void setSol(Double solde){
        this.solde=solde;
    }
    public String toString(){
        return "numero= "+numero+ "proprietaire: "+proprietaire+ "solde: "+ solde;
    }
}
