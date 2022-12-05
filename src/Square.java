public class Square
{
    private float side;

    public Square(float side)
    {
        if (side <= 0) throw new IllegalArgumentException("Длина стороны должна быть больше нуля");

        this.side = side;
    }

    public float getArea()
    {
        return side * side;
    }
}
