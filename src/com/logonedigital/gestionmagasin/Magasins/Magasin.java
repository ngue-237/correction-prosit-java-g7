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

    public  void RetourSup(Magasin mag ) {
        if ( mag.getNbProduits() > this.getNbProduits()){
            System.out.println("Le magasin ayant le plus grand nombre de produits est : " + mag);
        } else if (mag.getNbProduits() < this.getNbProduits()) {
            System.out.println("Le magasin ayant le plus grand nombre de produits est : " + this);
        } else {
            System.out.println("Ces deux magasins ont un nombre de produits identique");
        }
    }


    //PROSITE IV
    public void ajouterEmployes(Employes employe){
        if (this.nbEmployes < 20) {
            this.employes[this.nbEmployes] = employe ;
            this.nbEmployes++;
        } else {
            System.out.println("Ce magasin a atteint le limite d'employés !");
        }
    }

}


