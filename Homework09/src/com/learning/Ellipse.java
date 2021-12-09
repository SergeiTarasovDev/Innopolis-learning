package com.learning;

public class Ellipse extends Figure {
    protected double verticalRadius;
    protected double horizontalRadius;

    public Ellipse(double centerX, double centerY, double verticalRadius, double horizontalRadius) {
        super(centerX, centerY);
        this.verticalRadius = verticalRadius;
        this.horizontalRadius = horizontalRadius;
    }

    public double getVerticalRadius() {
        return verticalRadius;
    }

    public void setVerticalRadius(double verticalRadius) {
        this.verticalRadius = verticalRadius;
    }

    public double getHorizontalRadius() {
        return horizontalRadius;
    }

    public void setHorizontalRadius(double horizontalRadius) {
        this.horizontalRadius = horizontalRadius;
    }

    public double getPerimeter() {
        if (this.verticalRadius <= 0 || this.horizontalRadius <= 0) {
            return 0;
        }
        return 2 * Math.PI * Math.sqrt((this.verticalRadius * this.verticalRadius + this.horizontalRadius * this.horizontalRadius) / 8);
    }
}
