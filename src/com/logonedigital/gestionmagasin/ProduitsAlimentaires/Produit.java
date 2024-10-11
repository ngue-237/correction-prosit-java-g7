package com.logonedigital.gestionmagasin.ProduitsAlimentaires;

import java.util.Date;

public class Produit {
    private int idProduit ;
    private String libelle ;
    private String marque ;
    private double prix ;
    private String type ;
    private double quantite ;
    private String saison ;

    private Date dateExpiration ;

    //CREATION DES CONSTRUICTEURS

    //1-non parametre pour le produit vide P0
    public  Produit() {
    }

    //2-parametre à 4 parametres pour le produit P3
    public Produit(int idProduit , String libelle , String marque , double prix){
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

    public Produit(int idProduit, String type, String libelle, double quantite, String saison) {
        this.idProduit = idProduit;
        this.type = type;
        this.libelle = libelle;
        this.quantite = quantite;
        this.saison = saison ;
    }

    //3-creation de la methode afficher()
    public void afficher(){
        System.out.println("ID du produit: " + this.idProduit);
        System.out.println("Libelle : "+ this.libelle);
        System.out.println("Marque : " + this.marque);
        System.out.println("Prix : " + this.prix);
        System.out.println("Date expiration: " + this.dateExpiration);
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

    public void setDateExpiration(Date time){
        this.dateExpiration = time ;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getQuantite() {
        return quantite;
    }

    public double setQuantite() {
        this.quantite = quantite;
        return quantite;
    }
    public String getSaison() {
        return saison;
    }
    public  void setSaison(String saison) {
        this.saison = saison;
    }
    //7-creation de la methode toString()
    @Override
    public String toString() {
        return "Produit{" +
                "idProduit=" + idProduit +
                ", libelle='" + libelle + '\'' +
                ", marque='" + marque + '\'' +
                ", prix=" + prix +
                '}';
    }

    public boolean comparer(Produit P) {
        if (this.idProduit == P.idProduit)
        if (P.getLibelle().equals(this.getLibelle()))
        if (this.prix == P.prix)
            return true;

        return false;
    }

    public  Boolean comparer(Produit p1 , Produit p2) {
        if (p1.idProduit == p2.idProduit) {
            return true;
        }
        if (p1.getLibelle().equals(p2.getLibelle())) {
            return true ;
        }
        if (p1.prix == p2.prix) {
            return true ;
        }

        return false;
    }

    public String determinerTypePoduit(Produit p) {
        if (p instanceof ProduitFruit)
            return "fruit" ;
        else if (p instanceof ProduitLegume)
            return "legume";
        else
            return "autre";
    }

}
