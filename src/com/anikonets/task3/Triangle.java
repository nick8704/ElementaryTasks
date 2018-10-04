package com.anikonets.task3;

import java.math.BigDecimal;
import java.math.RoundingMode;

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
        square = geroneSquare(firstSide, secondSide, thirdSide);
    }

    private double geroneSquare(double firstSide, double secondSide, double thirdSide) {
        double p = (firstSide + secondSide + thirdSide) / 2;
        return Math.sqrt(p * (p - firstSide) * (p - secondSide) * (p - thirdSide));
    }

    @Override
    public int compareTo(Triangle o) {
        int result = Double.compare(square, o.square);
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

}