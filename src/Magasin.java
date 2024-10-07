import Employe.Employe;
import Employe.Produit;

import java.util.Arrays;

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
        this.nbProduit = nbProduits;
    }
    public void ajouterProduit(ProduitAlimentaire produitA){
        if(this.nbProduit<this.capaciteMagasin);
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
        public boolean rechercherProduit(ProduitAlimentaire){
            for(int i = 0; i<this.nbProduit; i++){
                if(this.produitAlimentaires[i].comparer(p))
                    return true;
            }
            return false;
        }

        public static Magasin comparerNbProduitMagasin(Magasin m1, Magasin m2){
    /*
        if(m1.nbProduit>m2.nbProduits)
               return m1;
     */

            return (m1.nbProduit>m2.nbProduits)? m1 : m2;
        }
    public void supprimer(Produit p){
            if(Arrays.asList(produitAlimentaires).contains(Ps)){
                for(int i = 0; i < this.nbProduit;  i++){
                    if (produitAlimentaires[i].equals(Ps)){
                        for (int s = 1; s < this.nbProduit; s++){
                            produitAlimentaires[s] = produitAlimentaires[s +1];
                            this.nbProduit --;
                            System.out.println("produit alimentaire supprimer avec succès !");
                        }
                    }
                }
            }else{
                System.out.println("produit alilentaire non trouvé");
            }

        @Override
        public String toString() {
            return "Magasin{" +
                    "idMagasin=" + idMagasin +
                    ", adresse='" + adress + '\'' +
                    ", capaciteMagasin=" + capaciteMagasin +
                    ", produitAlimentaire=" + Arrays.toString(produitAlimentaires) +
                    ", nbProduits=" + nbProduits +
                    '}';
            }
            public void ajouterProduit(Produit p){
                if(this.nbProduit<this.capaciteMagasin)
                {
                    boolean trouve = this.rechercherProduit(produitAlimentaires);
                    if(!trouve){
                        this.produitAlimentaire[this.nbProduit]=produitA;
                        this.nbProduit++;
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

        }
    }
}
