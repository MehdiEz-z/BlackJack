package org.example;

public class BlackJack {
    public static void main(String[] args) {
        Carte carteDepart = new Carte(1, 1);
        Carte[] jeuDeCartes = Carte.construireJeuDeCartes(carteDepart);
        jeuDeCartes = Carte.melanger_jeu_cartes(jeuDeCartes);

        for (Carte carte : jeuDeCartes) {
            if (carte != null) {
                System.out.println(carte);
            }
        }
    }
}
