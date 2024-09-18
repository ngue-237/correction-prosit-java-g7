public class Produit {
    protected int identifiant;
    protected String libelle;
    protected String marque;
    protected double prix;

    public Produit() {

    }

    public Produit(int id, String lib, String marq) {
        this.identifiant = id;
        this.libelle = lib;
        this.marque = marq;
    }
    public Produit(int id, String lib, String marq, double prix) {
        this.identifiant = id;
        this.libelle = lib;
        this.marque = marq;
        this.prix = prix;
    }
    public void afficher(){
        System.out.println("*********************");
        System.out.println("Identifiant :" + this.identifiant);
        System.out.println("Libelle :" + this.libelle);
        System.out.println("Marque :" + this.marque);
        System.out.println("Le prix : " + this.prix);
        System.out.println("************");


    }


    public void affich2(){

        System.out.println(toString());
    }
    public double getPrix(){return this.prix;}

    public void setPrix(double prix){this.prix = prix;}

}
