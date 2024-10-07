import Employe.Produit;
import Employe.ProduitFruit;

import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ProduitAlimentaire p0 = new ProduitAlimentaire(); // instanciation d'un objet vide à l'aide du constructeur non-paramétré
        //affectation des valeurs aux différents attributs de l'objet p0
        p0.idProduit = 123;
        p0.libelle = "Ordinateur";
        p0.marque = "Lenovo";
        p0.prix = 250_000;
        p0.dateExpiration= new Date("12/09/2024");
        System.out.println("Produit p0");
        //affichage des détails d'un objet à l'aide de la méthode afficher créer manuellement
        //p0.afficher();
        System.out.println("Affichage avec la méthode toString");
        //affichage des détails d'un objet avec la méthode toString
        System.out.println(p0);
        //création ou instanciation d'un objet p1 avec le constructeur paramétré à 3 paramètres
        ProduitAlimentaire p1 = new ProduitAlimentaire(1021,"Lait", "Delice");
        System.out.println("Produit p1");
        //p1.afficher();
        System.out.println("Produit p1 après affectation du prix");
        p1.prix = 0.7;
        p1.dateExpiration= new Date("12/10/2024");
        //p1.afficher();
        System.out.println("Affichage avec la méthode toString");
        System.out.println(p1);

        //création ou instanciation d'un objet p2 avec le constructeur paramétré à 3 paramètres
        ProduitAlimentaire p2 = new ProduitAlimentaire(2510, "Yaourt","Vitalait");
        p2.prix = 250;
        p2.dateExpiration= new Date("12/11/2024");
        System.out.println("Produit p2");
        //p2.afficher();
        System.out.println("Affichage avec la méthode toString");
        System.out.println(p2);
        //création ou instanciation d'un objet p3 avec le constructeur paramétré à 4 paramètres
        ProduitAlimentaire p3 = new ProduitAlimentaire(3250,"Tomate", "Sicam",1.2);
        p3.dateExpiration= new Date("12/12/2024");
        System.out.println("Produit p3");
        //p3.afficher();
        System.out.println("Affichage avec la méthode toString");
        System.out.println(p3);

        Magasin magasin1 = new Magasin(1,"TotalEnergie Nsimeyong");

        magasin1.ajouterProduit(p0);
        magasin1.ajouterProduit(p1);
        magasin1.ajouterProduit(p2);
        magasin1.ajouterProduit(p3);
        Employe responsable = new Responsable(1,"Emma", "Nsimeyong", 200,10_000);
        magasin1.ajouteremploye(responsable);
        System.out.println("Salaire responsable :" + ((Responsable) responsable).calculeSalaireResponsable());

        //création ou instanciation d'un objet p4 avec le constructeur paramétré à 4 paramètres
        ProduitAlimentaire p4 = new ProduitAlimentaire(3245,"Huile", "Mayor",1500);
        p4.setDateExpiration(new Date("12/12/2024"));
        magasin1.ajouterProduit(p4);

        magasin1.afficherMagasin();

        Magasin magasin2 = new Magasin(2,"Mvog-Mbi");

        System.out.println("Afficher Magasin avec nombre produits supérieur");

        System.out.println(Magasin.comparerNbProduitMagasin(magasin1,magasin2));

        System.out.println("Nombre total produit : " +magasin1.getNbProduit());


        //Création des differents produits

        Produit p1 = new ProduitFruit(1254, "Fruit", "Fraise", 12.3, "Mars");
        Produit p2 = new ProduitFruit(1224, "Fruit", "Pastèque", 50, "Juin");
        Produit p3 = new ProduitFruit(7896, "Fruit", "Mandarine", 25.6, "Decembre");
        Produit p4 = new ProduitFruit(8521, "Legume", "Artichauts", 14, "Janvier");







    }
}






