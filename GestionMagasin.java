package logonedigital.gestionmagasin.model;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class GestionMagasin {
    public static void main(String[] args) throws MagasinPleinException {
        Magasin magasin1= new Magasin(1, "123 rue du commerce", 50);
        Magasin magasin2= new Magasin(2, "ruel 2", 50);

        Produit produit1= new Produit(1,"T-shirt", 15.99);
        Produit produit2= new Produit(2,"pantalon", 39.99);
        Produit produit3= new Produit(1,"T-shirt", 15.99);

        magasin1.ajouterProduit(produit1);
                magasin1.ajouterProduit(produit2);

                magasin2.ajouterProduit(produit1);
        magasin2.ajouterProduit(produit3);


        System.out.println(magasin1.chercherProduit(produit1));
        System.out.println(magasin1.chercherProduit(produit3));
        Magasin magasinAvecPlusDeProduit=
                Magasin.magasinAvecPlusDeProduit (magasin1, magasin2);

    }
}