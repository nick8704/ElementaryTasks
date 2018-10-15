package com.anikonets.task3;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

public class Triangle implements Comparable<Triangle> {

    private String name;
    private double firstSide;
    private double secondSide;
    private double thirdSide;
    private double square;

    public Triangle() {
    }

    public Triangle(String name, double firstSide, double secondSide, double thirdSide) {
        this.name = name;
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
        this.square = getGeroneSquare(firstSide, secondSide, thirdSide);
    }

    private double getGeroneSquare(double firstSide, double secondSide, double thirdSide) {
        double p = (firstSide + secondSide + thirdSide) / 2;
        return Math.sqrt(p * (p - firstSide) * (p - secondSide) * (p - thirdSide));
    }

    @Override
    public int compareTo(Triangle o) {
        int result = Double.compare(o.square, square);
        if (result == 0) {
            result = this.name.compareTo(o.name);
        }
        return result;
    }

    @Override
    public String toString() {
        BigDecimal bd = new BigDecimal(square).setScale(2, RoundingMode.HALF_EVEN);
        square = bd.doubleValue();
        return "[Triangle "
                + name + "]: "
                + square + " cm";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.firstSide, firstSide) == 0 &&
                Double.compare(triangle.secondSide, secondSide) == 0 &&
                Double.compare(triangle.thirdSide, thirdSide) == 0 &&
                Objects.equals(name, triangle.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, firstSide, secondSide, thirdSide);
    }

    public String getName() {
        return name;
    }

    public double getFirstSide() {
        return firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    public double getThirdSide() {
        return thirdSide;
    }

    public double getSquare() {
        return square;
    }

}