public class Magasin {

    int identifiant;
    String adresse;
    int capacite;
    Produit produitMag = new Produit() ;


    public Magasin() {
    }

    public Magasin(int identifiant, String adresse, int capacite, Produit produitMag) {
        this.identifiant = identifiant;
        this.adresse = adresse;
        this.capacite = capacite;
        this.produitMag.nom = produitMag.nom;
        this.produitMag.prix=produitMag.prix;
    }

    public void  afficherCaractMag(int identifiant,String adresse, Produit[] produitMag){
       // int j;
        System.out.println("L'IDENTIFIANT DU MAGASIN EST : "+identifiant);
        System.out.println("L'ADRESSE DU MAGASIN EST : "+adresse);
        System.out.println("LA CAPACITÉ DU MAGASIN EST : "+capacite);
        System.out.println("LA CAPACITÉ DU MAGASIN EST : "+capacite);
        for (int j=0; j<produitMag.length; j++){
            System.out.println("LE MAGASIN A L'ADRESSE "+adresse+" POSSEDE LE PRODUIT AU NOM DE "+produitMag[j].nom+" AU PRIX DE "+produitMag[j].prix );

        }
        System.out.println("LE MAGASIN À L'ADRESSE "+adresse+" DISPOSE DE "+produitMag.length+"  PRODUITS");


    }

}
