package bf.ibam.geometrie.figure3D;
import bf.ibam.geometrie.figure;
public class Cube implements figure {
   private double cote;
public Cube(){
    this.cote=0;
}
public Cube(double cote){this.cote=cote;}
public double getCote(){
    return cote;
}
public void setCote(double cote){
    this.cote=cote;
}
public double Surface(){return 6*cote*cote;}
public double volume(){return Math.pow(cote,3);}
@Override
public String toString(){
    return "Cube: " + ' '+ "Surface="+Surface()+"cm^2" +' '+ "volume=" + volume()+"cm";

}
}
