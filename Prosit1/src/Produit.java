public class Produit {
    private    int identifiant;
    private String libelle;
    private String marque;
    private Double prix;


    public Produit(){
        System.out.println("création d'un nouveau produit vide");
        identifiant=0;
        libelle=" ";
        marque=" ";
        prix=0.0;

    }
    public Produit(int p_identifiant,String p_marque,String p_libelle,Double p_prix){
        System.out.println("création d'un nouveau produit avec les données");
        identifiant=p_identifiant;
        libelle=p_libelle;
        marque=p_marque;
        prix=p_prix;
    }
    public int getIdentifiant(){return this.identifiant;  }
    public void setIdentifiant(int p_identifiant){this.identifiant=p_identifiant;}
    public String getLibelle(){ return this.libelle;}
    public void  setLibelle(String p_libelle){this.libelle=p_libelle;}
    public String getMarque(){ return this.marque;}
    public void setMarque(String marque) {
        this.marque = marque;
    }
    public Double getPrix(){ return this.prix;}
    public void setPrix(Double p_prix){this.prix=p_prix;}

    public void afficher(){
        System.out.println("l'identifiant du produit est "+getIdentifiant());
        System.out.println("Le libellé du produit est "+getLibelle());
        System.out.println("La marque du produit est "+getMarque());
        System.out.println("Le Prx du  produit est "+getPrix());

    }
}
