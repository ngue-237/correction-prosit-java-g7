package Employe;

public class Produit {
    protected int idProduit;
    protected String Type;
    protected String Libelle;
    protected double Quantite;
    protected String Saison;

    public Produit() {
    }

    public Produit(int idProduit, String type, String libelle, double quantite, String saison) {
        this.idProduit = idProduit;
        Type = type;
        Libelle = libelle;
        Quantite = quantite;
        Saison = saison;
    }

    public int getIdProduit() {
        return idProduit;
    }

    public void setIdProduit(int idProduit) {
        this.idProduit = idProduit;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getLibelle() {
        return Libelle;
    }

    public void setLibelle(String libelle) {
        Libelle = libelle;
    }

    public double getQuantite() {
        return Quantite;
    }

    public void setQuantite(double quantite) {
        Quantite = quantite;
    }

    public String getSaison() {
        return Saison;
    }

    public void setSaison(String saison) {
        Saison = saison;
    }




}
