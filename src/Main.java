import com.logonedigital.gestionmagasin.Employes.Caissier;
import com.logonedigital.gestionmagasin.Employes.Responsable;
import com.logonedigital.gestionmagasin.Employes.Vendeur;
import com.logonedigital.gestionmagasin.Magasins.Magasin;
import com.logonedigital.gestionmagasin.Magasins.MagasinPleinException;
import com.logonedigital.gestionmagasin.Magasins.PrixNegatifException;
import com.logonedigital.gestionmagasin.ProduitsAlimentaires.*;

import java.util.Calendar;
import java.util.Date;

import static com.logonedigital.gestionmagasin.Magasins.Magasin.comparerNbProduitMagasin;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws MagasinPleinException, PrixNegatifException {

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
        P2.setDateExpiration(new Date("12/12/2024"));
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
        P0.setDateExpiration( calendar.getTime()) ;
        P0.afficher();

        calendar.set(2025 , 05 , 20 , 23 , 59);
        P1.setDateExpiration(calendar.getTime())  ;
        P1.afficher();

        calendar.set(2025 , 11 , 23 ,15 , 30);
        P2.setDateExpiration(calendar.getTime()) ;
        P2.afficher();

        calendar.set(2026 , 12 , 31 , 23 , 59);
        P3.setDateExpiration(calendar.getTime())   ;
        P3.afficher();
        Magasin magasin1 = new Magasin(1 , "Niki", "Total Energie Nsimeyong") ;

        magasin1.ajouterProduit(P0);
        magasin1.ajouterProduit(P1);
     //   magasin1.ajouterProduit(P2)
     //   magasin1.ajouterProduit(P3);

        System.out.println("Afficher magasin");
        magasin1.afficherMagasin();

        System.out.println("Nombre total de produits : " + magasin1.getNbProduits());

        System.out.println("*Suppression du produit P1*");
        magasin1.supprimer(P1);
        magasin1.afficherMagasin();

        //System.out.println("*Magasin ayant un nombre supérieur de produits*");
        Magasin magasin2 = new Magasin(2, "Mahima", "Coron" ) ;
        comparerNbProduitMagasin(magasin1 , magasin2) ;


        //PROSITE IV

        //creation des magasins
        Magasin Carrefour = new Magasin(3,"Carrefour","Centre-Ville") ;
        Magasin SantaLucia = new Magasin(4,"SantaLucia","Nkoabang") ;

        //creation et ajout des employés
        Caissier Caissier1 = new Caissier("124AO778" , "Maxine Karol" , "Nkomo" , 180 , 01 );
        Caissier Caissier2 = new Caissier("124AO742" , "Ondoua Ulrich" , "Barrièrre" , 185 , 02);
        Vendeur Vendeur1 = new Vendeur("254EF767", "Elise Zoa" , "Coron" , 180 , 10);
        Responsable Responsable1 = new Responsable("466YT525" , "Astride Ngbwa" , "Nsimeyong" , 160 , 2000);
        Carrefour.ajouterEmployes(Caissier1); Carrefour.ajouterEmployes(Caissier2);
        Carrefour.ajouterEmployes(Vendeur1);
        Carrefour.ajouterEmployes(Responsable1);
        Carrefour.afficherMagasin();

        Caissier CaissierA = new Caissier("569DG785" , "Realiana" , "Bastos" , 175 , 01);
        Vendeur VendeurA= new Vendeur("523YJ457", "Axel" , "Nkoabang" , 190 , 15);
        Vendeur VendeurB= new Vendeur("489FK754", "Lucie" , "Nkomo" ,175 , 20);
        Vendeur VendeurC= new Vendeur("768SF887", "Marie" , "Ekounou" , 180 , 10);
        Responsable ResponsableA = new Responsable("466YT525" , "Astride Ngbwa" , "Nsimeyong" , 160 , 1500);
        SantaLucia.ajouterEmployes(CaissierA);  SantaLucia.ajouterEmployes(VendeurA);  SantaLucia.ajouterEmployes(VendeurB);
        SantaLucia.ajouterEmployes(VendeurC);  SantaLucia.ajouterEmployes(ResponsableA);

        System.out.println("Caractéristiques des employés");
        System.out.println("Employés de Carrefour");
        Caissier1.afficher();
        Caissier2.afficher();
        Vendeur1.afficher();
        Responsable1.afficher();
        System.out.println("Employés de Santalucia");
        CaissierA.afficher();
        VendeurA.afficher();
        VendeurB.afficher();
        VendeurC.afficher();
        ResponsableA.afficher();
         //Remarque : chaque enployé vient avec un attribut qui lui est propre

        //creation et ajout de produits
        Produit produit1 = new Produit(452 , "piment doux" , "Roma" , 1000);
        Produit produit2 = new Produit(554 , "mais doux" , "Soleil", 1500);
        Produit produit3 = new Produit(564 , "Mayonnaise" , "Roma" , 750);
        Carrefour.ajouterProduit(produit1); Carrefour.ajouterProduit(produit2);
//        Carrefour.ajouterProduit(produit3);

        Produit produitA = new Produit(565 , "huile d'arrachide" , "Mayor" , 1500);
        Produit produitB = new Produit(859 , "sardine" , "Le vieux", 400);
        Produit produitC = new Produit(568 , "beurre" , "   President" , 1250);
        SantaLucia.ajouterProduit(produitA); SantaLucia.ajouterProduit(produitB);
//        SantaLucia.ajouterProduit(produitC);

        System.out.println("Affichage des détails des magasins");
        System.out.println("Détails du magasin carrefour");
        Carrefour.afficherMagasin();
        System.out.println("Détails du magasin SantaLucia");
        SantaLucia.afficherMagasin();

        System.out.println("affichage des salaires");
        System.out.println("Carrefour");
        System.out.println("Caissier 1");
        Caissier1.calculerSalaire();
        Caissier1.afficerSalaire();
        System.out.println("Caissier 2");
        Caissier2.calculerSalaire();
        Caissier2.afficerSalaire();
        System.out.println("Responsable 1");
        Responsable1.calculerSalaire();
        Responsable1.afficerSalaire();
        System.out.println("Vendeur 1");
        Vendeur1.calculerSalaire();
        Vendeur1.afficerSalaire();
        System.out.println("Santalucia");
        System.out.println("Caissier A");
        CaissierA.calculerSalaire();
        CaissierA.afficerSalaire();
        System.out.println("Responsable A");
        ResponsableA.calculerSalaire();
        ResponsableA.afficerSalaire();
        System.out.println("Vendeur A");
        VendeurA.calculerSalaire();
        VendeurA.afficerSalaire();
        System.out.println("Vendeur B");
        VendeurB.calculerSalaire();
        VendeurB.afficerSalaire();
        System.out.println("Vendeur C");
        VendeurC.calculerSalaire();
        VendeurC.afficerSalaire();

        //CREATION DES PRODUITS
        Produit p1 = new ProduitFruit(1254, "fruit", "Fraise", 12.3, "Mars");
        Produit p2 = new ProduitFruit(1224, "fruit", "Pastèque", 50, "Juin");
        Produit p3 = new ProduitFruit(7896, "fruit", "Mandarine", 25.6, "Décembre");
        Produit p4 = new ProduitLegume(8521, "legume", "Artichauts", 14, "Janvier");

        //AJOUT DES PRODUITS A UN MAGASIN
        magasin2.ajouterProduit(p1);
        magasin2.ajouterProduit(p2);
        magasin2.afficherMagasin();
//        magasin2.ajouterProduit(p3);
//        magasin2.ajouterProduit(p4);
      System.out.println( Produit.determinerTypePoduit(p1));
        System.out.println("**Determination du stock**");
        System.out.println(magasin2.calculStock());
        System.out.println(ProduitFruit.calculStock(magasin2));



    }
}
