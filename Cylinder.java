package ss4;

public class Cylinder extends Circle {
    private double length = 1.0;

    public Cylinder() {
    }

    public Cylinder(double length) {
        this.length = length;
    }

    public Cylinder(double length, String color, double radius) {
        super(color, radius);
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getVolume() {
        return getRadius() * getRadius() * Math.PI * length;
    }

    @Override
    public String toString() {
        return "Length = "
                + getLength()
                +" A Cylinder with volume = "
                + getVolume()
                +super.toString();
    }
}
