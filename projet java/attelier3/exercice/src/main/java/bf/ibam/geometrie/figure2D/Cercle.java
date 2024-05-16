package bf.ibam.geometrie.figure2D;
import bf.ibam.geometrie.figure;
public class Cercle implements figure, figure2D {
        private double cote;
        public Cercle(){this.cote=0;}
        public Cercle(double cote)
        {
            this.cote=cote;
        }
        public double getcote(){
            return cote;
        }
        public void setCote(double cote){
            this.cote=cote;
        }
        public double  Perimetre(){
        return 2*Math.PI*cote;}
        public double Surface(){return Math.PI*cote*cote;}
        @Override
        public String toString(){
            return "Cercle:" + ' ' + "Surface=" + Surface()+"cm^2" +' '+ "périmetre=" + Perimetre()+"cm";

        }
}
