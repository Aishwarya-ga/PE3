package com.pe3;

public class Main {
    Main(String message) {
        message="Hello world";
        System.out.println(message);
    }

    public static void main(String[] args) {
        try
        {
            throw new Exception();

        }
        catch(Exception e)
        {
            System.out.println(e);
            //e.printStackTrace();
        }
        finally {
            System.out.println("Its a finally block");
        }
    }
}
