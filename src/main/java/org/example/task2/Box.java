package org.example.task2;

public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        setDimension(length);
        setDimension(width);
        setDimension(height);
        this.length = length;
        this.width = width;
        this.height = height;
    }

    // приватний валідатор для всіх сторін
    private void setDimension(double value) {
        if (value <= 0) {
            throw new IllegalArgumentException("Side must be > 0");
        }
    }

    public double getSurfaceArea() {
        // 2(lw + lh + wh)
        return 2 * (length * width + length * height + width * height);
    }

    public double getLateralSurfaceArea() {
        // 2h(l + w)
        return 2 * height * (length + width);
    }

    public double getVolume() {
        return length * width * height;
    }
}
