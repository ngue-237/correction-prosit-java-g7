import java.util.Date;

public class Main {
    public static void main(String[] args) {
        ProduitAlimentaire p0 = new ProduitAlimentaire();
        p0.idProduit = 123;
        p0.libelle = "Ordinateur";
        p0.marque = "Lenovo";
        p0.prix = 250_000;
        p0.dateExpiration= new Date("12/09/2024");
        System.out.println("Produit p0");
        //p0.afficher();
        System.out.println("Affichage avec la méthode toString");
        System.out.println(p0);
        ProduitAlimentaire p1 = new ProduitAlimentaire(1021,"Lait", "Delice");
        System.out.println("Produit p1");
        //p1.afficher();
        System.out.println("Produit p1 après affectation du prix");
        p1.prix = 0.7;
        p1.dateExpiration= new Date("12/10/2024");
        //p1.afficher();
        System.out.println("Affichage avec la méthode toString");
        System.out.println(p1);
        ProduitAlimentaire p2 = new ProduitAlimentaire(2510, "Yaourt","Vitalait");
        p2.prix = 250;
        p2.dateExpiration= new Date("12/11/2024");
        System.out.println("Produit p2");
        //p2.afficher();
        System.out.println("Affichage avec la méthode toString");
        System.out.println(p2);
        ProduitAlimentaire p3 = new ProduitAlimentaire(3250,"Tomate", "Sicam",1.2);
        p3.dateExpiration= new Date("12/12/2024");
        System.out.println("Produit p3");
        //p3.afficher();
        System.out.println("Affichage avec la méthode toString");
        System.out.println(p3);


    }
}