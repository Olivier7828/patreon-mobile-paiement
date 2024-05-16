package bf.ibam.geometrie.figure3D;
import bf.ibam.geometrie.figure;
public class Sphere implements figure {
    private double cote;
  public Sphere(){
    this.cote=0;
  }
  public Sphere(double cote){this.cote=cote;}
  public double getCote() {
      return cote;
  }
  public void setCote(double cote){
    this.cote=cote;
  }
  public double Surface(){return 4*Math.PI*cote;}
  public double volume(){return (4/3)*Math.PI*Math.pow(cote, 3);}
  @Override
  public String toString(){
    return "Sphère:" + ' '+ "Surface="+Surface()+"cm^2" +' '+ "volume=" + volume()+"cm";
  }
  
}
