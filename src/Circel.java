
public class Circel {

    private int radie;

    // Konstruktor
    public Circel(int radie){
        this.radie = radie;
    }

    public double getArea(){
        return Math.round(radie*radie*Math.PI*100)/100.0;
    }

    public double getCircumference(){
        return Math.round(radie*2*Math.PI*100)/100.0;
    }

}
