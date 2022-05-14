package com.company.Lessons.les28generic;

public class Matrix<T> {
    private T[] array;

    public Matrix(T[] array) {
        this.array = array;
    }

    public static void main(String[] args) {
        Matrix<Integer> integerMatrix = new Matrix<>(new Integer[4]);
        Matrix<Double> doubleMatrix = new Matrix<>(new Double[5]);
        Matrix<Byte> byteMatrix = new Matrix<>(new Byte[6]);

    }
}
