import java.util.ArrayList;
import java.util.List;

public class Magasin {
    private int identifiant;
    private String adresse;
    private int capacitedumagasin;
    private List<ProduitAlimentaire> produitAlimentaire ;
private double prix;
    public Magasin(int identifiant,String adresse,int capacitedumagasin) {
        this.identifiant = identifiant;
        this.adresse=adresse;
        this.capacitedumagasin=capacitedumagasin;
        this.produitAlimentaire = new ArrayList<>();

    }

    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getCapacitedumagasin() {
        return capacitedumagasin;
    }

    public void setCapacitedumagasin(int capacitedumagasin) {
        this.capacitedumagasin = capacitedumagasin;
    }

    public List<ProduitAlimentaire> getProduitAlimentaire() {
        return produitAlimentaire;
    }

    public void setProduits(String ensembledeproduit) {
        this.produitAlimentaire = produitAlimentaire;
    }
    public void ajouterProduit(ProduitAlimentaire produit) {
        if (produitAlimentaire.size() >= capacitedumagasin) {
            throw new IllegalStateException("Le magasin a atteint sa capacité maximale de produits.");
        }
        produitAlimentaire.add(produit);
    }
    public void afficherDetails() {
        System.out.println("Magasin: " + identifiant);
        System.out.println("Adresse: " + adresse);
        System.out.println("Capacité: " + capacitedumagasin);
        System.out.println("Produits disponibles:");
        for (ProduitAlimentaire produit : produitAlimentaire) {
            System.out.println("- " + produit.getLibelle() + ": " + produit.getPrix() + "€");

        }
    }



    public void afficherMagasin(){
        System.out.println("Identifiant : "+this.identifiant);
        System.out.println("Adresse : "+this.adresse);
        System.out.println("Capacité du magasin : "+this.capacitedumagasin);
        System.out.println("Produits disponibles:");

        }

    public int nombreTotalProduits() {
   return produitAlimentaire.size(); }
}



