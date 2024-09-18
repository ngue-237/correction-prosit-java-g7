public class ProduitAlimentaire {
    int idProduit;
    String libelle;
    String marque;
    double prix;

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



}
