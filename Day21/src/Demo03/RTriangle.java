package Demo03;

public class RTriangle implements IShape{
    private double aSide;
    private double bSide;

    public RTriangle(double aSide, double bSide) {
        this.aSide = aSide;
        this.bSide = bSide;
    }

    public RTriangle() {
    }

    public double getaSide() {
        return aSide;
    }

    public void setaSide(double aSide) {
        this.aSide = aSide;
    }

    public double getbSide() {
        return bSide;
    }

    public void setbSide(double bSide) {
        this.bSide = bSide;
    }

    @Override
    public double getArea() {
        return aSide*bSide;
    }

    @Override
    public double getPerimeter() {
        return aSide+bSide+(Math.sqrt(aSide*aSide + bSide*bSide));
    }
}
