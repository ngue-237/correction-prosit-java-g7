import java.util.Calendar;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //PROSITE I

        //1-creation du produit vide P0
        Produit P0 = new Produit() ;

        //2-creation des nouveaux produits
        Produit P1 = new Produit(1021 , "Lait" , "Delice") ;
        Produit P2 = new Produit(2510 , "Yaourt" , " Vitalait") ;
        Produit P3 = new Produit(3250 , "Tomate" , "Sicam" , 1.200) ;

        //3-Affichage des details des nouveaux roduits
        P1.afficher();
        P2.afficher();
        P3.afficher();

        //4-attribution du prix et affichage du produit lait
        P1.setPrix(0.7);
        P1.afficher();

        //5-completer les informations manqantes des autres produits
        P0.setId(2810); P0.setLibelle("Chocolat"); P0.setMarque("Wity"); P0.setPrix(2.500);
        P2.setPrix(500);

        //6-afficher les produits modifies
        P0.afficher();
        P2.afficher();

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
        Calendar calendar = Calendar.getInstance() ;
        calendar.set(2025 , 01 , 15 , 00 , 00);
        P0.dateExpiration = calendar.getTime(); ;
        P0.affichera();

        calendar.set(2025 , 05 , 20 , 23 , 59);
        P1.dateExpiration = calendar.getTime() ;
        P1.affichera();

        calendar.set(2025 , 11 , 23 ,15 , 30);
        P2.dateExpiration = calendar.getTime() ;
        P2.affichera();

        calendar.set(2026 , 12 , 31 , 23 , 59);
        P3.dateExpiration = calendar.getTime() ;
        P3.affichera();


        //PROSITE II

        int choix;
        int nombreDeProduits = 0 ;
        double prix ;
        double prixProduits[] = new double[50] ;
        String produits[] = new String[50] ;

        Scanner Sc = new Scanner(System.in);


        //Menu principal
        do {
            System.out.println("MENU DE GESTION DU MAGASIN");
            System.out.println("1. Ajouter un produit");
            System.out.println("2. Caractéristiques du magasin");
            System.out.println("3. Nombre de produits en stock");
            System.out.println("Quitter");
            System.out.println("Choisissez une option");
            choix = Sc.nextInt();


            switch (choix) {
                case 1:
                    if (nombreDeProduits < 50){
                        Produit produit = new Produit();
                        System.out.println("Entrez le nom du produit");
                        produits[nombreDeProduits] = Sc.next();
                        System.out.println("Entrez le prix du produit");
                        prix = Sc.nextDouble() ;
                        if (prix >= 0) {
                            prixProduits[nombreDeProduits] = prix;
                            nombreDeProduits++;
                            System.out.println("Produit ajouté avec succès !");
                        } else {
                            System.out.println("Erreur: le prix d'un produit ne peut pas être négatif.");
                        }

                    } else {
                        System.out.println("La capacité du magasin est atteinte. Vous ne pouvez plus ajouter de produits !");
                    }
                    break;

                case 2:
                    System.out.println("Caractéristiques du magasin");
                    Magasin magasin = new Magasin(422, "4eAenue", 50  ) ;
                    magasin.visualiser();
                    System.out.println("Liste des produits");
                    for (int i = 0; i < nombreDeProduits ; i++){
                        System.out.println((i + 1) + ". " + produits[i] + " " + prixProduits[i]);
                    }
                    break;

                case 3:
                    System.out.println("Vous avez " + nombreDeProduits + " produits en stock !");
                    break;

                case 4:
                    System.out.println("AU REVOIR !");
                    break;

                default:
                    System.out.println("Erreur: choix non valide !");
            }

        } while (choix != 4) ;

        Sc.close();
    }
}