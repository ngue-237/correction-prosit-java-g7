public class Produit {
private String nom ;
private double prix ;

    public Produit() {

    }

    public Produit(String nom , double prix) {
        this.nom = nom;
        this.prix = prix;
    }

    public String setNom(String nom){
        this.nom = nom ;
        return nom;
    }
    public String getNom() {
        return nom;
    }

    public double setPrix(double prix) {
        this.prix = prix;
        return prix;
    }

    public double getPrix() {
        return prix;
    }

    public String toString() {
    return "NOM : " + this.nom +
            " Prix : " + this.prix;
}

}
