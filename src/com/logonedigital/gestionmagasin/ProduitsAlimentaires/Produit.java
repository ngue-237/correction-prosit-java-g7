package com.logonedigital.gestionmagasin.ProduitsAlimentaires;

import java.util.Date;

public class Produit {
    private int idProduit ;
    private String libelle ;
    private String marque ;
    private double prix ;
    private Date dateExpiration ;

    //CREATION DES CONSTRUICTEURS

    //1-non parametre pour le produit vide P0
    public  Produit() {
    }

    //2-parametre à 4 parametres pour le produit P3
    public Produit(int id , String libelle , String marque , double prix){
        this.idProduit = idProduit ;
        this.libelle = libelle ;
        this.marque = marque ;
        this.prix = prix ;
    }
    //parametre à 3 parametres pour les produits P1 et P2
    public Produit(int idProduit , String libelle , String marque){
        this.idProduit = idProduit ;
        this.libelle = libelle ;
        this.marque = marque ;
    }

    //3-creation de la methode afficher()
    public void afficher(){
        System.out.println("ID du produit: " + this.idProduit);
        System.out.println("Libelle : "+ this.libelle);
        System.out.println("Marque : " + this.marque);
        System.out.println("Prix : " + this.prix);
    }

    //4-creation des getter et setter
    public int getIdProduit() {
        return this.idProduit ;
    }
    public void setIdProduit(int idProduit) {
        this.idProduit = idProduit;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public double getPrix() {
        return this.prix;
    }

    public void setPrix(double prix) {
        if (prix>0)
            this.prix = prix;
        else
            System.out.println("Entrez une valeur positive");
    }

    public Date getDateExpiration(Date time){
        return dateExpiration ;
    }

    public void setDateExpiration(){
        this.dateExpiration = dateExpiration ;
    }

    //7-creation de la methode toString()
    public String toString() {
        return "ID produit = " + this.idProduit +
                ", libelle = " + this.libelle +
                ", marque = " + this.marque +
                 ", prix = " + this.prix ;
    }

    public boolean comparer1(Produit P) {
        if (this.idProduit == P.idProduit) {
            return true;
        }
        if (P.getLibelle().equals(this.getLibelle())) {
            return true ;
        }
        if (this.prix == P.prix) {
            return true ;
        }

        return false;
    }

}
