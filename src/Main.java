import com.logonedigital.gestionmagasin.Magasins.Magasin;
import com.logonedigital.gestionmagasin.ProduitsAlimentaires.Produit;

import java.util.Calendar;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //PROSITE I

        //1-creation du produit vide P0
        Produit P0 = new Produit() ;
        P0.setIdProduit(2810); P0.setLibelle("Chocolat"); P0.setMarque("Wity"); P0.setPrix(2.500);
        P0.afficher();

        //2-creation des nouveaux produits
        Produit P1 = new Produit(1021 , "Lait" , "Delice") ;
        P1.setPrix(0.7);
        P1.afficher();

        Produit P2 = new Produit(2510 , "Yaourt" , " Vitalait") ;
        P2.setPrix(500);
        P2.afficher();

        Produit P3 = new Produit(3250 , "Tomate" , "Sicam" , 1.200);
        P3.afficher();

        //7-affichage des produits deja crees a l'aide de la methode toString()

        System.out.println(P0) ;
        System.out.println(P1) ;
        System.out.println(P2) ;
        System.out.println(P3) ;
        /*REMARQUE:  Lors de l'exécution du programme, les attributs du produit s'écriveent de
                     manière successive par concatenaton contrairement à la methode afficher()
                     où chaque attribut est sur une ligne différente.*/


        //8-affectation des dates aux produits existants
        //CREATION ET AFFECTAION DES DATES
        System.out.println("Dates");
        Calendar calendar = Calendar.getInstance() ;
        calendar.set(2025 , 01 , 15 , 00 , 00);
        P0.getDateExpiration( calendar.getTime()) ; ;
        P0.afficher();

        calendar.set(2025 , 05 , 20 , 23 , 59);
        P1.getDateExpiration(calendar.getTime())  ;
        P1.afficher();

        calendar.set(2025 , 11 , 23 ,15 , 30);
        P2.getDateExpiration(calendar.getTime()) ;
        P2.afficher();

        calendar.set(2026 , 12 , 31 , 23 , 59);
        P3.getDateExpiration(calendar.getTime())   ;
        P3.afficher();
        Magasin magasin1 = new Magasin(1 , "Total Energie Nsimeyong") ;

        magasin1.ajouterProduit(P0);
        magasin1.ajouterProduit(P1);
        magasin1.ajouterProduit(P2);
        magasin1.ajouterProduit(P3);

        System.out.println("Afficher magasin");
        magasin1.afficherMagasin();

        System.out.println("Nombre total de produits : " + magasin1.getNbProduits());

        System.out.println("comparer produits");
        if (P1.comparer1(P2)) {
            System.out.println("Ils sont égaux");
        } else {
            System.out.println("Ils ne sont pas égaux");
        }

        if (magasin1.comparer2(P0 , P2)) {
            System.out.println("Ils sont égaux");
        } else {
            System.out.println("Ils ne sont pas égaux");
        }

        System.out.println("*Recherche du produit P1*");
        magasin1.chercher(P1);
        System.out.println("*Suppression du produit P2*");
        magasin1.supprimer(P2);
        magasin1.afficherMagasin();

        Magasin magasin2 = new Magasin(2, "azerty" ) ;
        magasin1.RetourSur(magasin2);

    }
}