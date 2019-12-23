package DemoTest;

public class MyRectangle implements ShapeArea{

    private double width;
    private double height;

    public MyRectangle() {
    }

    public MyRectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width*height;
    }

    @Override
    public double getPerimeter() {
        return 2*(width + height);
    }

    @Override
    public String toString() {
        return "MyRectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
