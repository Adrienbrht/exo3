package td3;

import java.util.Random;

public class App {

    public static void main(String[] args) {

        int total = 0;
        int nbrEssais = 5;
        while (total != 20) {

            total = 0;
            Random generateur = new Random();

            for (int i = 0; i < nbrEssais; i++) {

                int lancer = (generateur.nextInt(6) + 1);
                System.out.println("Vous avez fait :" + lancer);

                total += lancer;
                System.out.println("Vous etes a la case :" + total);

            }
            System.out.println("Perdu ! ");
        }
        System.out.println("vous avez gagné ! ");

    }

}
