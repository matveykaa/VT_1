package laba1;
enum Color{
    Blue,
    Yellow,
    Red,
    Black,
    White
}
public class Ball {
    private final int weight;
    private final Color color;

    public  Ball(int weight, Color color)
    {
        this.weight = weight;
        this.color = color;
    }

    public int getWeight(){
        return weight;
    }
    public Color getColor(){
        return color;
    }
}
