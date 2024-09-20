import java.util.Date;

public class Produit {
    protected     int identifiant;
    private String libelle;
    private String marque;
    Double prix;
    private Date dateExpiration;

    public Produit(){

    }


    public Produit(int p_identifiant,String p_marque,String p_libelle,Double p_prix){
        System.out.println("création d'un nouveau produit avec les données");
        identifiant=p_identifiant;
        libelle=p_libelle;
        marque=p_marque;
        prix=p_prix;
    }

    public Produit(int identifiant, String libelle, String marque) {
        this.identifiant = identifiant;
        this.libelle = libelle;
        this.marque = marque;
    }

    public Produit(int identifiant, String libelle, String marque, Double prix, Date dateExpiration) {
        this.identifiant = identifiant;
        this.libelle = libelle;
        this.marque = marque;
        this.prix = prix;
        this.dateExpiration = dateExpiration;
    }

    public void afficher(){
        System.out.println("l'identifiant du produit est "+this.identifiant);
        System.out.println("Le libellé du produit est "+this.libelle);
        System.out.println("La marque du produit est "+this.marque);
        System.out.println("Le Prx du  produit est "+this.prix);

    }

    @Override
    public String toString() {
        return "Produit{" +
                "identifiant=" + identifiant +
                ", libelle='" + libelle + '\'' +
                ", marque='" + marque + '\'' +
                ", prix=" + prix +
                ", dateExpiration=" + dateExpiration +
                '}';
    }

}git