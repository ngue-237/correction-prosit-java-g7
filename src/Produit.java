import java.util.Date;

public class Produit {
    protected int idProduit ;
    protected String libelle ;
    protected String marque ;
    protected double prix ;
    protected Date dateExpiration ;

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
        System.out.println("ID du oroduit: " + this.idProduit);
        System.out.println("Libelle : "+ this.libelle);
        System.out.println("Marque : " + this.marque);
        System.out.println("Prix : " + this.prix);
    }

    //4-creation des getter et setter
    public int getId(int i) {
        return this.idProduit ;
    }
    public void setIdProduit(int idProduit) {
        this.idProduit = idProduit;
    }

    public String getLibelle(String next) {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getMarque(String next) {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public double getPrix(double prix) {
        return this.prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    //7-creation de la methode toString()
    public String toString() {
        return "ID " + this.idProduit +
                " Libelle " + this.libelle +
                " Marque " + this.marque +
                " Prix " + this.prix ;
    }

    //8-creation du constructeur paramétré et de la methode contenants l'attribut dateExpiration
    public Produit(int id , String libelle , String marque , double prix , Date dateExpiration){
        this.idProduit = id ;
        this.libelle = libelle ;
        this.marque = marque ;
        this.prix = prix ;
        this.dateExpiration = dateExpiration ;
    }

    public void affichera(){
        System.out.println("ID : " + this.idProduit);
        System.out.println("Libelle : "+ this.libelle);
        System.out.println("Marque : " + this.marque);
        System.out.println("Prix : " + this.prix);
        System.out.println("Date Expiration : " + this.dateExpiration);
    }

}
