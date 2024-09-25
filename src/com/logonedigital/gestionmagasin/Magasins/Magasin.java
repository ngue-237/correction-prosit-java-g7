package com.logonedigital.gestionmagasin.Magasins;

import com.logonedigital.gestionmagasin.ProduitsAlimentaires.Produit;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Magasin {
    private int idMagasin ;
    private String adresse;
    private int capaciteMagasin ;
    private Produit[] produitAlimentaire ;
    private int nbProduits ;

    public Magasin() {
        this.capaciteMagasin = 50 ;
        this.nbProduits = 0 ;
    }

    public Magasin(int idM , String ad) {
        this.idMagasin = idM ;
        this.adresse = ad ;
        this.capaciteMagasin = 50 ;
        this.nbProduits = 0 ;
        this.produitAlimentaire = new Produit[this.capaciteMagasin] ;
    }
    public Magasin ( Produit[] produitAlimentaire ){
        this.produitAlimentaire = produitAlimentaire ;
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

    public Produit[] getProduitAlimentaire() {
        return produitAlimentaire;
    }

    public void setProduitAlimentaire(Produit[] produitAlimentaire) {
        this.produitAlimentaire = produitAlimentaire;
    }

    public int getNbProduits() {
        return nbProduits;
    }

    public void setNbProduits(int nbProduits) {
        this.nbProduits = nbProduits;
    }


    public void ajouterProduit(Produit produitA) {
        if (this.nbProduits < this.capaciteMagasin) {
            if (Arrays.asList(produitAlimentaire).contains(produitA)){
                    System.out.println("Ce produit Alimentaire existe déjà!");
            } else {
                this.produitAlimentaire[this.nbProduits] = produitA ;
                this.nbProduits++ ;
            }

        } else {
            System.out.println("Vous avez atteint les limites de stockage");
        }
    }

    public void afficherMagasin() {
        System.out.println("Identifiant : " + this.idMagasin);
        System.out.println("Adresse : " + this.adresse);
        System.out.println("Capacité du magasin : " + this.capaciteMagasin);
        for (int i = 0; i  < nbProduits; i++) {
            System.out.print("Nom du produit : " + this.produitAlimentaire[i].getLibelle());
            System.out.println(" , Prix du produit : " + this.produitAlimentaire[i].getPrix() );
        }

    }


    public Boolean comparer2(Produit P1, Produit P2) {
        if (P1.getIdProduit() == P2.getIdProduit()){
            return true ;

        }
        if ( P1.getLibelle().equals(P2.getLibelle()) ) {
            return true ;
        }
        if (P1.getPrix() == P2.getPrix() ) {
            return true ;
        }

        return false;
    }


    public void chercher(Produit P) {
        if (Arrays.asList(produitAlimentaire).contains(P)){
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }

    public void supprimer(Produit Ps) {
        if (Arrays.asList(produitAlimentaire).contains(Ps)){
            for (int i = 0; i < this.nbProduits; i++) {
                if (produitAlimentaire[i].equals(Ps)) {
                    for (int s = i; s < this.nbProduits; s++){
                        produitAlimentaire[s] = produitAlimentaire[s +1] ;
                        this.nbProduits--;
                        System.out.println("Produit alimentaire supprimer avec succès !");
                    }
                }
            }
        } else {
                System.out.println("Produit alimentaire non trouvé");
        }
    }

}
