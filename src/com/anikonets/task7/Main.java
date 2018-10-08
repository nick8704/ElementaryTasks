package com.anikonets.task7;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = NumericalRange.getNumericalRange(9, 25.8);
        NumericalRange.printNumericalRange(list);
    }

}