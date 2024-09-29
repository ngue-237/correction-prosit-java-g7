package com.logonedigital.gestionmagasin.Magasins;

import com.logonedigital.gestionmagasin.Employes.Employes;
import com.logonedigital.gestionmagasin.ProduitsAlimentaires.Produit;

import java.util.Arrays;

public class Magasin {
    private int idMagasin ;
    private String adresse;
    private int capaciteMagasin ;
    private Produit[] produitAlimentaire ;
    private int nbProduits ;
    private Employes[] employes ;
    private int nbEmployes ;


    public Magasin() {
        this.capaciteMagasin = 50 ;
        this.nbProduits = 0 ;
        this.nbEmployes = 0 ;
    }

    public Magasin(int idM , String ad) {
        this.idMagasin = idM ;
        this.adresse = ad ;
        this.capaciteMagasin = 50 ;
        this.nbProduits = 0 ;
        this.nbEmployes = 0 ;
        this.produitAlimentaire = new Produit[this.capaciteMagasin] ;
        this.employes = new Employes[20] ;
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

    public int getNbEmplyes() {
        return nbEmployes;
    }

    public void setNbEmplyes(int nbEmplyes) {
        this.nbEmployes = nbEmplyes;
    }

    public Employes[] getEmployes() {
        return employes;
    }

    public void setEmployes(Employes[] employes) {
        this.employes = employes;
    }


    public void ajouterProduit(Produit produitA) {
        if (this.nbProduits < this.capaciteMagasin) {
            if (!this.rechercherProduit(produitA)) {
                this.produitAlimentaire[this.nbProduits] = produitA ;
                this.nbProduits++ ;
            } else {
                System.out.println("Ce produit Alimentaire existe déjà!");
            }
        } else {
            System.out.println("Vous avez atteint les limites de stockage");
        }
    }

    public void afficherMagasin() {
        System.out.println("Identifiant : " + this.idMagasin);
        System.out.println("Adresse : " + this.adresse);
        System.out.println("Capacité du magasin : " + this.capaciteMagasin);
        System.out.println("Liste de produits");
        for (int i = 0; i  < nbProduits; i++) {
            System.out.print("Nom du produit : " + this.produitAlimentaire[i].getLibelle());
            System.out.println(" , Prix du produit : " + this.produitAlimentaire[i].getPrix() );
        }
        System.out.println("Liste des employers");
        for (int i = 0; i < nbEmployes; i++){
            System.out.print("Id employé : " + this.employes[i].getIdEmploye());
            System.out.println(" , Nom employé : " + this.employes[i].getNomEmploye());
        }
    }

    public boolean rechercherProduit(Produit P) {
        for (int i = 0; i < this.nbProduits; i++ ) {
            if (this.produitAlimentaire[i].comparer(P))
                    return true;
        }
        return false;

    }

    public void supprimer(Produit Ps) {
        if (this.rechercherProduit(Ps)){
            for (int i = 0; i < this.nbProduits; i++) {
                if (produitAlimentaire[i].comparer(Ps)) {
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

    public static Magasin comparerNbProduitMagasin(Magasin m1,Magasin m2) {
        return (m1.nbProduits>m2.nbProduits)? m1 :m2 ;
    }


    //PROSITE IV
    public boolean rechercherEmploye(Employes employe) {
        for (int i = 0; i < this.nbEmployes; i++ ) {
            if(employes[i] == employe)
                return true;
        }
        return false;

    }
    public void ajouterEmployes(Employes employe){
        if (this.nbEmployes < 20) {
            if (!this.rechercherEmploye(employe)){
                this.employes[this.nbEmployes] = employe ;
                this.nbEmployes++;
            }
        } else {
            System.out.println("Ce magasin a atteint le limite d'employés !");
        }
    }

}


