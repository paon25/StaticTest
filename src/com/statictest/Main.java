package com.statictest;

/**
 * Main class - tests static and non-static counters.
 */
public class Main {

    @SuppressWarnings("unused")
    public static void main(String[] args) {

        // Creating 4 instances of Personne
        Personne personne1 = new Personne();
        Personne personne2 = new Personne();
        Personne personne3 = new Personne();
        Personne personne4 = new Personne();

        // Display both counters
        System.out.println("(" + personne4.nbLocal + "," + Personne.nbInstances + ")");
    }
}