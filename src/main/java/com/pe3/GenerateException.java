package com.pe3;

public class GenerateException {
    public int x=10;

    //Negative Array size exception
    public static void generateNegativeArraySizeException()
    {
        int arraySize = -8;
        try {
            int[] array = new int[arraySize];
        }
        catch (NegativeArraySizeException e) {
            System.out.println(e);
            System.out.println("Array size cannot be negative");
        }
    }

    //IndexOutOfBound exception
    public static  void generateIndexOutOfBoundsException()
    {
        int array[]=new int[5];
        try{
            array[6]=5;
        }
        catch(IndexOutOfBoundsException e) {
            System.out.println(e);
            System.out.println("Array Index out of bound");
        }
    }

    //NullPointer exception
    private static GenerateException nullPointer() {
        return null;
    }

    public static void main(String[] args) {

        generateNegativeArraySizeException();
        generateIndexOutOfBoundsException();

        GenerateException  generateException = nullPointer();

        try {
            int i = generateException.x;
        }
        catch(NullPointerException e)
        {
            System.out.println(e);
            System.out.println("Nullpointer Exception");
        }

    }
}
