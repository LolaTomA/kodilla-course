package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main (String args[]) {

        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(3.0, 2.0);

        } catch (Exception e) {

            System.out.println("Oops! Mistake!!! ");

        }  finally {

            System.out.println("Ok. End of task.");

        }
    }
}
