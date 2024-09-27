import java.util.Date;

public class ProduitAlimentaire {
    int idProduit;
    String libelle;
    String marque;
    double prix;
    Date dateExpiration ;

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
git init    Il est utilisé car la valeur de tous les paramètres est connues
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

    /*
    Méthode permettant d'afficher les caractéristiques d'un projet
    à l'aide de la méthode toString issue d'un héritage implicite entre
    la classe ProduitAlimentaire et la Super classe Object
     */
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
