package com.example.math;

import static com.example.converters.numberConverter.convertToDouble;

public class SimpleMath {


    public Double sum(String numberOne, String numberTwo) {
        return convertToDouble(numberOne) + convertToDouble(numberTwo);
    }

    public Double subtract(String numberOne, String numberTwo) {
        return convertToDouble(numberOne) - convertToDouble(numberTwo);
    }

    public Double multiply(String numberOne, String numberTwo) {
        return convertToDouble(numberOne) * convertToDouble(numberTwo);
    }

    public Double divide(String numberOne, String numberTwo) {
        return convertToDouble(numberOne) / convertToDouble(numberTwo);
    }
    public Double average(String numberOne, String numberTwo) {
        return (convertToDouble(numberOne) + convertToDouble(numberTwo)) / 2;
    }

    public Double squareRoot(String numberOne) {
        return Math.sqrt(convertToDouble(numberOne));
    }



}
