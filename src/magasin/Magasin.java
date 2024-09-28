package magasin;

import produit.ProduitAlimentaire;

public class Magasin {
    private int idMagasin;
    private String adresse;
    private int capaciteMagasin;
    private ProduitAlimentaire[] produitAlimentaire;
    private int nbProduits;

    public Magasin(){
        this.capaciteMagasin = 50;
        this.nbProduits = 0;
    }

    public Magasin(int idM, String ad){
        this.idMagasin = idM;
        this.adresse = ad;
        this.capaciteMagasin = 50;
        this.nbProduits = 0;
        this.produitAlimentaire = new ProduitAlimentaire[this.capaciteMagasin];
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

   public Magasin comparerNbProduitMagasin(Magasin m1, Magasin m2){
    /*
        if(m1.nbProduits>m2.nbProduits)
               return m1;
     */

        return (m1.nbProduits>m2.nbProduits)? m1 : m2;
   }


}
