package com.iesgo.pontoseguro.model.converter;

import java.util.Objects;

public class Point {
    private Double x;
    private Double y;

    public Point() {}

    public Point(Double x, Double y) {
        this.x = x;
        this.y = y;
    }

    public Double getX() { return x; }

    public void setX(Double x) { this.x = x; }

    public Double getY() { return y; }

    public void setY(Double y) { this.y = y; }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return Objects.equals(x, point.x) && Objects.equals(y, point.y);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
