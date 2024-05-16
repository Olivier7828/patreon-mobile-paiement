/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bf.ibam;

/**
 *
 * @author User
 */
public class CompteEpargne extends Compte {
    private double taux;
    public CompteEpargne(String num, String prop, double s, double t)
    {
       super(num, prop, s);
       taux=t;
    }

    /**
     *
     * @return
     */
    @Override
    public double getSolde()
    {
      return (solde *(1+taux/100));
    }
    
}
