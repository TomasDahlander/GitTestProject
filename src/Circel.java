
public class Circel {

    private int radie;

    // Konstruktor
    public Circel(int radie){
        this.radie = radie;
    }

    public double getArea(){
        return radie*radie*Math.PI;
    }

    public double getOmkrets(){
        return radie*2*Math.PI;
    }

}
