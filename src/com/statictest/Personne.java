package com.statictest;

/**
 * Classe Personne avec un compteur static et un compteur non-static.
 */
public class Personne {

    // Compteur static — partagé entre toutes les instances
    public static int nbInstances;

    // Compteur non-static — propre à chaque instance
    public int nbLocal;

    public Personne() {
        nbInstances++;
        nbLocal++;
    }
}