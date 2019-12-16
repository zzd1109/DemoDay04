package Demo01;

public abstract class Shape {
    private String color;
    public abstract double calPerimeter();
    public abstract String getType();

    public Shape() {
    }

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
