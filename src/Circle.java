public class Circle
{
    private float radius;

    public Circle(float radius)
    {
        if (radius <= 0) throw new IllegalArgumentException("Радиус должен быть больше нуля");

        this.radius = radius;
    }

    public float getArea()
    {
        return (float) Math.PI * radius * radius;
    }
}
