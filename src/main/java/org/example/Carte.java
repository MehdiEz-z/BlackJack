package org.example;


public class Carte {
    private final int hauteur;
    private final int couleur;

    public Carte(int hauteur, int couleur) {
        this.hauteur = hauteur;
        this.couleur = couleur;
    }

    public int getHauteur() {return hauteur;}

    public int getCouleur() {return couleur;}

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

    public static Object[] extraire_ieme_carte(Carte[] cartes, int indice) {
        Carte[] nouvellesCartes = new Carte[cartes.length - 1];
        Carte carteExtraite = cartes[indice];

        int j = 0;
        for (int i = 0; i < cartes.length; i++) {
            if (i != indice) {
                nouvellesCartes[j] = cartes[i];
                j++;
            }
        }

        return new Object[]{carteExtraite, nouvellesCartes};
    }

    public static Object[] tirer_une_carte(Carte[] cartes) {
        int indiceAleatoire = (int) (Math.random() * cartes.length);
        return extraire_ieme_carte(cartes, indiceAleatoire);
    }

    public static Carte[] melanger_jeu_cartes(Carte[] cartes) {
        int n = cartes.length;
        Carte[] jeuMelange = new Carte[n];

        for (int i = 0; i < n; i++) {
            jeuMelange[i] = cartes[i];
        }

        for (int i = n - 1; i > 0; i--) {
            int j = (int) (Math.random() * (i + 1));

            Carte temp = jeuMelange[i];
            jeuMelange[i] = jeuMelange[j];
            jeuMelange[j] = temp;
        }

        return jeuMelange;
    }




}
