package magasin;

import employe.Employe;
import produit.ProduitAlimentaire;

import java.util.Arrays;

public class Magasin {
    private int idMagasin;
    private String nomMagasin;
    private String adresse;
    private int capaciteMagasin;
    private ProduitAlimentaire[] produitAlimentaire;
    private Employe[] employes;
    private int nbEmployes;
    private int nbProduits;

    public Magasin(){
        this.capaciteMagasin = 50;
        this.nbProduits = 0;
        this.nbEmployes = 0;
        this.employes = new Employe[20];
    }

    public Magasin(int idM, String ad, String nomM){
        this.idMagasin = idM;
        this.adresse = ad;
        this.nomMagasin = nomM;
        this.capaciteMagasin = 50;
        this.nbProduits = 0;
        this.produitAlimentaire = new ProduitAlimentaire[this.capaciteMagasin];
        this.employes = new Employe[20];
    }

    public int getIdMagasin() {
        return idMagasin;
    }

    public void setIdMagasin(int idMagasin) {
        this.idMagasin = idMagasin;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getCapaciteMagasin() {
        return capaciteMagasin;
    }

    public void setCapaciteMagasin(int capaciteMagasin) {
        this.capaciteMagasin = capaciteMagasin;
    }

    public ProduitAlimentaire[] getProduitAlimentaire() {
        return produitAlimentaire;
    }

    public void setProduitAlimentaire(ProduitAlimentaire[] produitAlimentaire) {
        this.produitAlimentaire = produitAlimentaire;
    }

    public int getNbProduits() {
        return nbProduits;
    }

    public void setNbProduits(int nbProduits) {
        this.nbProduits = nbProduits;
    }

    public void ajouterProduit(ProduitAlimentaire produitA){
        if(this.nbProduits<this.capaciteMagasin)
        {
            boolean trouve = this.rechercherProduit(produitA);
           if(!trouve){
               this.produitAlimentaire[this.nbProduits]=produitA;
               this.nbProduits++;
           }else
               System.out.println("Ce produit existe déjà");

        }else
            System.out.println("Vous avez atteint les limites de stockage");
    }

    public void ajouterEmploye(Employe employe){
        if(this.nbEmployes<20){
            this.employes[nbEmployes]=employe;
            this.nbEmployes++;
        }else
            System.out.println("Vous avez atteint les limites des employés !");
    }



   public void afficherMagasin(){
        System.out.println("Identifiant : "+this.idMagasin);
        System.out.println("Adresse : "+this.adresse);
        System.out.println("Capacité du magasin : "+this.capaciteMagasin);
        for(int i = 0; i<this.nbProduits; i++){
            System.out.println("Nom produit : "+this.produitAlimentaire[i].getLibelle());
            System.out.println("Prix produit : "+this.produitAlimentaire[i].getPrix());
        }
   }

   private boolean rechercherProduit(ProduitAlimentaire p){
        for(int i = 0; i<this.nbProduits; i++){
            if(this.produitAlimentaire[i].comparer(p))
                return true;
        }
       return false;
   }

   public static Magasin comparerNbProduitMagasin(Magasin m1, Magasin m2){
    /*
        if(m1.nbProduits>m2.nbProduits)
               return m1;
     */

        return (m1.nbProduits>m2.nbProduits)? m1 : m2;
   }

    @Override
    public String toString() {
        return "Magasin{" +
                "idMagasin=" + idMagasin +
                ", adresse='" + adresse + '\'' +
                ", capaciteMagasin=" + capaciteMagasin +
                ", produitAlimentaire=" + Arrays.toString(produitAlimentaire) +
                ", nbProduits=" + nbProduits +
                '}';
    }
}
