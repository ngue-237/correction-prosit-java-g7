import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int choix ;
        int nombreDeProduits = 0 ;
        int capacite = 50 ;
        String nom ;
        double prix ;
        double prixProduits[] = new double[50] ;
        String produits[] = new String[50] ;

        Scanner Sc = new Scanner(System.in);


        do {
            System.out.println("MENU DE GESTION DU MAGASIN");
            System.out.println("1. Ajouter un produit");
            System.out.println("2. Caractéristiques du magasin");
            System.out.println("Nombre de produits en stock");
            System.out.println("Choisissez une option");
            choix = Sc.nextInt();

            switch (choix) {
                case 1:
                    if (nombreDeProduits < 50){
                            Produit produit = new Produit();
                            System.out.println("Entrez le nom du produit");
                            produits[nombreDeProduits] = produit.setNom(Sc.next());
                            System.out.println("Entrez le prix du produit");
                            prix = Sc.nextDouble() ;
                            if (prix >= 0) {
                                prixProduits[nombreDeProduits] = produit.setPrix(prix);
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



            }

        } while (choix == 3) ;
    }
}