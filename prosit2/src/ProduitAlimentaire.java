import java.util.Date;

public class ProduitAlimentaire {
    private int id;
    private String libelle;
    private String marque;
    private double prix;
    Date dateExpiration;



    public ProduitAlimentaire(int id, String marque, String libelle,double prix) {
        this.id = id;
        this.libelle=libelle;
        this.prix=prix;
        this.marque=marque;
        this.dateExpiration=dateExpiration;
    }

    public ProduitAlimentaire(String marque, double prix) {
    }

    public int getId() {
        return id;
    }

    public String getMarque() {
        return marque;
    }

    public double getPrix() {
        return prix;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
    @Override
    public String toString() {
        return "produit.ProduitAlimentaire{" +
                "idProduit=" + id +
                ", libelle='" + libelle + '\'' +
                ", marque='" + marque + '\'' +
                ", prix=" + prix +
                ", dateExpiration=" + dateExpiration.toLocaleString() +
                '}';
    }


    public void afficher(){
        System.out.println("Identifiant : "+this.id);
        System.out.println("Libelle : " + this.libelle);
        System.out.println("Marque : "+this.marque);
        System.out.println("Prix : "+this.prix);
    }
    public void setPrix() {
        if (prix < 0) {
            throw new IllegalArgumentException("Le prix ne peut pas être négatif.");
        }
        this.prix = prix;
    }

}
