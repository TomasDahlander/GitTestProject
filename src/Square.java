
public class Square {

    private int side;

    // Konstruktor
    public Square(int side){
        this.side = side;
    }

    public int getArea(){
        return side*side;
    }

    public int getPerimiter(){
        return side*4;
    }

}
