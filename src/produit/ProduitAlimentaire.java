package produit;

import java.util.Date;

public class ProduitAlimentaire {
    private int idProduit;
    private String libelle;
    private String marque;
    private double prix;
    private Date dateExpiration ;

    /*
    on utilise le constructeur non paramétré pour instancier un objet
    lorsque les valeurs des différents attributs de cette objet ne sont pas
    connus au moment de l'instanciation (voir question 1 prosit 1)
    */

    //le constructeur non paramétré nous permettra de créer un produit vide
    public ProduitAlimentaire(){

    }

    /*
    on utilise le constructeur  paramétré pour instancier un objet
    lorsque les valeurs des différents attributs de cette objet  sont
    connus au moment de l'instanciation (voir question 2 prosit 1)
    */

    /*
    Ce constructeur paramétré à 3 paramètres nous permettra de créer
    les objets a et b dans la question 2 du prosit 1.
    Il est utilisé car la valeur de trois attributs est connue
     */
    public ProduitAlimentaire(int idP, String lib, String marq){
        this.idProduit = idP;
        this.libelle = lib;
        this.marque = marq;
    }

    /*
    Ce constructeur paramétré à 4 paramètres nous permettra de
    créer l'objet c dans la question 2 du prosit 1.
    Il est utilisé car la valeur de tous les paramètres est connues
    */
    public ProduitAlimentaire(int idP, String lib, String marq, double prx){
        this.idProduit=idP;
        this.libelle=lib;
        this.marque = marq;
        this.prix = prx;

    }

    /*
    Méthode permettant d'afficher les détails d'un projet
     */
    public void afficher(){
        System.out.println("Identifiant : "+this.idProduit);
        System.out.println("Libelle : " + this.libelle);
        System.out.println("Marque : "+this.marque);
        System.out.println("Prix : "+this.prix);
    }

    public int getIdProduit() {
        return idProduit;
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
        return prix;
    }

    public void setPrix(double prix) {
        if (prix>0)
            this.prix = prix;
        else
            System.out.println("Entrer une valeur positive");
    }

    public Date getDateExpiration() {
        return dateExpiration;
    }

    public void setDateExpiration(Date dateExpiration) {
        this.dateExpiration = dateExpiration;
    }

    /*
        Méthode permettant d'afficher les caractéristiques d'un projet
        à l'aide de la méthode toString issue d'un héritage implicite entre
        la classe produit.ProduitAlimentaire et la Super classe Object
         */
    @Override
    public String toString() {
        return "produit.ProduitAlimentaire{" +
                "idProduit=" + idProduit +
                ", libelle='" + libelle + '\'' +
                ", marque='" + marque + '\'' +
                ", prix=" + prix +
                ", dateExpiration=" + dateExpiration.toLocaleString() +
                '}';
    }

    public  boolean comparer(ProduitAlimentaire p){
        if(this.idProduit == p.idProduit)
            return true;
        if(this.libelle.equals(p.libelle))
            return true;
        if(this.prix == p.prix)
            return true;
        return false;
    }
    public boolean comparer(ProduitAlimentaire p1, ProduitAlimentaire p2){
        if(p1.idProduit == p2.idProduit)
            return true;
        if(p1.libelle.equals(p2.libelle))
            return true;
        if(p1.prix == p2.prix)
            return true;

        return false;
    }
}
