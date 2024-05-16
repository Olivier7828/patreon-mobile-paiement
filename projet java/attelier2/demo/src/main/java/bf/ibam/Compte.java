/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bf.ibam;

/**
 *
 * @author User
 */
public class Compte {
    private String numero;
    private String proprietaire;
    double solde;
    
    public Compte(String numero, String proprietaire, double solde)
    {
        this.numero=numero;
        this.proprietaire=proprietaire;
        this.solde=solde;
    }

    private Compte() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getNumero() {
        return numero;
    }

    public String getProprietaire() {
        return proprietaire;
    }

    public double getSolde() {
        return solde;
    }

    @Override
    public String toString() {
        return "Compte{" + "numero=" + numero + ", proprietaire=" + proprietaire + ", solde=" + solde + '}';
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setProprietaire(String proprietaire) {
        this.proprietaire = proprietaire;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }
      public static void main(String[] args) {
          Compte test;
          test = new Compte();
        System.out.println(test);
    }
    
}
