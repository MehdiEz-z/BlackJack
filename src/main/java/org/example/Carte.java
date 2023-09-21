package org.example;

import java.util.ArrayList;
import java.util.List;

public class Carte {
    private final int hauteur;
    private final int couleur;

    public Carte(int hauteur, int couleur) {
        this.hauteur = hauteur;
        this.couleur = couleur;
    }

    public int getHauteur() {
        return hauteur;
    }

    public int getCouleur() {
        return couleur;
    }

    @Override
    public String toString() {
        String[] couleurs = {"Carreau", "Cœur", "Pique", "Trèfle"};
        String[] hauteurs = {"As", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valet", "Dame", "Roi"};
        return hauteurs[hauteur - 1] + " " + couleurs[couleur - 1];
    }

    public static Carte[] construireJeuDeCartes(Carte carteDeDepart) {
        Carte[] jeuDeCartes = new Carte[52]; //

        int hauteur = carteDeDepart.getHauteur();
        int couleur = carteDeDepart.getCouleur();
        int index = 0;

        for (int c = couleur; c <= 4; c++) {
            for (int h = hauteur; h <= 13; h++) {
                jeuDeCartes[index] = new Carte(h, c);
                index++;
            }
            hauteur = 1;
        }

        return jeuDeCartes;
    }


}
