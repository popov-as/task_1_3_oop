public class Figure
{
    private final int PART_COUNT = 8;

    private Circle smallCircle;
    private Circle bigCircle;
    private Square square;

    private float pieArea;      // Площадь внутреннего куска пирога
    private float segmentArea;  // Площадь сегмента между большим и малым кругом
    private float cornerArea;   // Площадь угла квадрата вне круга

    public Figure(float smallRadius, float bigRadius)
    {
        smallCircle = new Circle(smallRadius);
        bigCircle = new Circle(bigRadius);
        square = new Square(2 * bigRadius);

        pieArea = getPieArea();
        segmentArea = getSegmentArea();
        cornerArea = getCornerArea();
    }

    private float getPieArea() {
        return smallCircle.getArea() / PART_COUNT;
    }

    private float getSegmentArea() {
        return (bigCircle.getArea() - smallCircle.getArea()) / PART_COUNT;
    }

    private float getCornerArea() {
        return (square.getArea() - bigCircle.getArea()) / PART_COUNT;
    }

    public float getArea(int pieCount, int segmentCount, int cornerCount)
    {
        return pieArea * pieCount + segmentArea * segmentCount + cornerArea * cornerCount;
    }
}
