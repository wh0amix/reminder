package org.example;
import javax.swing.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Main {
    static void main() throws InterruptedException {
        // Récupération date du jour
        Date date = new Date();
        // Récupération du jour
        int jour = date.getDay();
        // Récupération de l'heure
        int heure = date.getHours();

        //Indiquation du jour (lundi soir et vendredi)
        if(verificationJour(jour)){
            //Lancement du programme à partir de 19h
            while(!verificationHeure(heure)){
                TimeUnit.MINUTES.sleep(30);
                heure = date.getHours();
            }
            Fenetre fenetre = new Fenetre();
            int reponse = fenetre.getReponse();
            if(reponse == 0){
                System.exit(0);
            }
            while(reponse != 0){
                TimeUnit.MINUTES.sleep(15);
                reponse = fenetre.getReponse();
            }
        }
        else{
            System.exit(0);
        }
        System.out.print(date);

       // Réitération si non validé par l'utilisateur tout les 30 min

    }

    public static boolean verificationJour(int jour){
        boolean res = false;
        if(jour == 1 || jour == 5){
            res = true;
        }
        return res;
    }

    public static boolean verificationHeure(int heure){
        boolean res = false;
        if(heure >= 18 ){
            res = true;
        }
        return res;
    }
}
