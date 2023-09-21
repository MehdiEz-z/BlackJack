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

    public static List<Carte> construireJeuDeCartes(Carte carteDeDepart) {
        List<Carte> jeuDeCartes = new ArrayList<>();

        int hauteur = carteDeDepart.getHauteur();
        int couleur = carteDeDepart.getCouleur();

        for (int c = couleur; c <= 4; c++) {
            for (int h = hauteur; h <= 13; h++) {
                jeuDeCartes.add(new Carte(h, c));
            }
            hauteur = 1;
        }

        return jeuDeCartes;
    }


}
