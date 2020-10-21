
public class Main {

    public static void main(String[] args) {
        Square square = new Square(4);
        Circel circel = new Circel(5);

        System.out.println("Kvadrat omkrets = " + square.getPerimiter());
        System.out.println("Kvadrat are     = " + square.getArea());

        System.out.println("Circel omkrets  = " + circel.getCircumference());
        System.out.println("Circel are      = " + circel.getArea());
    }
}
