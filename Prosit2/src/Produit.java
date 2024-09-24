import java.util.Scanner;

public class Produit {
    protected String nom;
    protected   Double prix;
    protected int nbreProduit;

    public Produit() {
       // this.nbreProduit=0;

    }

    public Produit(String nom, Double prix) {
        this.nom = nom;
        this.prix = prix;
       // this.nbreProduit=0;
    }

    public void ajoutProduit(String nom, Double prix) {


        if (prix >= 0 && nbreProduit < 50) {
            this.nom = nom;
            this.prix = prix;
            this.nbreProduit++;
        } else if (prix <= 0 && nbreProduit>50) {
            System.out.println("LE PRIX DOIT ETRE POSITIF ET NON NULLE");
            System.out.println("LA QUANTITÉ DES PRODUITS DU MAGASIN EST ATTEINTE");

        } else if(nbreProduit>50){
            System.out.println("LA QUANTITÉ DES PRODUITS DU MAGASIN EST ATTEINTE");
        } else if (prix<=0) { System.out.println("LE PRIX DOIT ETRE POSITIF ET NON NULLE");

        }
    }
    public void lireProdit(){
        System.out.println(" LIRE LE NOM DU PRODUIT");
        String name;
        Double montprix;
        Scanner nameP= new Scanner(System.in);
        name=nameP.nextLine();
        montprix=nameP.nextDouble();
        this.nom=name;
        this.prix=montprix;
    }
}
