public class Magasin {
    private int idMagasin;
    private String adress;
    private int capaciteMagasin;
    private ProduitAlimentaire[] produitAlimentaires;
    private int nbProduit;

    public Magasin(){
        this.capaciteMagasin = 50;
        this.nbProduit = 50;
    }
     public Magasin(int idM, String ad){
        this.idMagasin = idM;
        this.adress = ad;
        this.capaciteMagasin = 50;
        this.nbProduit = 0;
        this.produitAlimentaires = new ProduitAlimentaire[this.capaciteMagasin];
     }
     public int getIdMagasin(){
        return idMagasin;
     }
     public void setIdMagasin(){
        this.idMagasin = idMagasin;
     }
     public String getAdress(){
        return adress;
     }
     public void setAdress(String adress){
        this.adress = adress;
     }
     public int getCapaciteMagasin(){
        return capaciteMagasin;
     }
     public void setCapaciteMagasin(int capaciteMagasin){
        this.capaciteMagasin = capaciteMagasin;
     }

    public ProduitAlimentaire[] getProduitAlimentaires() {
        return produitAlimentaires;
    }
    public void setProduitAlimentaires(ProduitAlimentaire[] produitAlimentaires){
        this.produitAlimentaires = produitAlimentaires;
    }
    public int getNbProduit(){
        return nbProduit;
    }
    public void setNbProduits(int nbProduits){
        this.nbProduits = nbProduits;
    }
    public void ajouterProduit(ProduitAlimentaire produitA){
        if(this.nbProduits<this.capaciteMagasin);
        {
            this.produitAlimentaires[this.nbProduit]=produitA;
            this.nbProduit++;
        }else
            System.out.println("Vous avez atteint les limites de stokage");
    }


    public void afficherMagasin(){
        System.out.println("identifiant :"+this.idMagasin);
        System.out.println("Adresse :"+this.adress);
        System.out.println("Capacité du magasin :"+this.capaciteMagasin);
        for (int i = 0; i<this.nbProduit; i++){
            System.out.println("Nom produit  :"+this.produitAlimentaires[i].getlibelle());
            System.out.println("Prix produit :"+this.produitAlimentaires[i].getprix());
        }
    }
}
