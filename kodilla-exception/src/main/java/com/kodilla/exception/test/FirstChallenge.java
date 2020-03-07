package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(double a, double b) {

    try { return a / b;

    } catch (ArithmeticException e)  {

            System.out.println("Oh no! Something went wrong!" + e );

        } finally {

            System.out.println("Good job! Task done.");
        }
    return a / b;
    }

    /**
     * This main can throw an ArithmeticException!!!
     *
     * @param args
     */
    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();

        double result = firstChallenge.divide(3, 0);

        System.out.println(result);

    }
}