/* Create a class with a main( ) that throws an object of class Exception inside a try block.
 *        a. Give the constructor for Exception a String argument.
 *        b. Catch the exception inside a catch clause and print the String argument.
 *        c. Add a finally clause and print a message to prove you were there.
*/
package com.stackroute.pe3;

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
        }
        finally {
            System.out.println("Its a finally block");
        }
    }
}
