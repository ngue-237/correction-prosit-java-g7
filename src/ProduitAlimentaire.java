import java.util.Date;

public class ProduitAlimentaire {
    int idProduit;
    String libelle;
    String marque;
    double prix;
    Date dateExpiration ;

    public ProduitAlimentaire(){

    }

    public ProduitAlimentaire(int idP, String lib, String marq){
        this.idProduit = idP;
        this.libelle = lib;
        this.marque = marq;
    }

    public ProduitAlimentaire(int idP, String lib, String marq, double prx){
        this.idProduit=idP;
        this.libelle=lib;
        this.marque = marq;
        this.prix = prx;

    }

    public void afficher(){
        System.out.println("Identifiant : "+this.idProduit);
        System.out.println("Libelle : " + this.libelle);
        System.out.println("Marque : "+this.marque);
        System.out.println("Prix : "+this.prix);
    }

    @Override
    public String toString() {
        return "ProduitAlimentaire{" +
                "idProduit=" + idProduit +
                ", libelle='" + libelle + '\'' +
                ", marque='" + marque + '\'' +
                ", prix=" + prix +
                ", dateExpiration=" + dateExpiration.toLocaleString() +
                '}';
    }
}
