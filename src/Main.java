import employe.Employe;
import employe.Responsable;
import magasin.Magasin;
import produit.ProduitAgricole;
import produit.ProduitAlimentaire;
import produit.ProduitFruit;
import produit.ProduitLegume;


import java.util.Date;

public class Main {
    public static void main(String[] args) {
        ProduitAlimentaire p0 = new ProduitAlimentaire(); // instanciation d'un objet vide à l'aide du constructeur non-paramétré
        //affectation des valeurs aux différents attributs de l'objet p0
        p0.setIdProduit(123);
        p0.setLibelle("Ordinateur");
        p0.setMarque("Lenovo");
        p0.setPrix(250_000);
        p0.setDateExpiration(new Date("12/09/2024"));

//        System.out.println("Produit p0");
        //affichage des détails d'un objet à l'aide de la méthode afficher créer manuellement
        //p0.afficher();
//        System.out.println("Affichage avec la méthode toString");
        //affichage des détails d'un objet avec la méthode toString
//        System.out.println(p0);
        //création ou instanciation d'un objet p1 avec le constructeur paramétré à 3 paramètres
        ProduitAlimentaire p1 = new ProduitAlimentaire(1021,"Lait", "Delice");
//        System.out.println("Produit p1");
        //p1.afficher();
//        System.out.println("Produit p1 après affectation du prix");
        p1.setPrix(0.7);
        p1.setDateExpiration(new Date("12/10/2024"));
        //p1.afficher();
//        System.out.println("Affichage avec la méthode toString");
//        System.out.println(p1);

        //création ou instanciation d'un objet p2 avec le constructeur paramétré à 3 paramètres
        ProduitAlimentaire p2 = new ProduitAlimentaire(2510, "Yaourt","Vitalait");
        p2.setPrix(250);
        p2.setDateExpiration(new Date("12/11/2024"));
//        System.out.println("Produit p2");
        //p2.afficher();
//        System.out.println("Affichage avec la méthode toString");
//        System.out.println(p2);
        //création ou instanciation d'un objet p3 avec le constructeur paramétré à 4 paramètres
        ProduitAlimentaire p3 = new ProduitAlimentaire(3250,"Tomate", "Sicam",1.2);
        p3.setDateExpiration(new Date("12/12/2024"));
//        System.out.println("Produit p3");
        //p3.afficher();
//        System.out.println("Affichage avec la méthode toString");
//        System.out.println(p3);

        Magasin magasin1 = new Magasin(1,"TotalEnergie Nsimeyong", "Carrefour");

        magasin1.ajouterProduit(p0);
        magasin1.ajouterProduit(p1);
        magasin1.ajouterProduit(p2);
        magasin1.ajouterProduit(p3);

        Employe responsable = new Responsable(1,"Emma", "Nsimeyong", 200,10_000);
        magasin1.ajouterEmploye(responsable);
//        System.out.println("Salaire responsable :" + ((Responsable) responsable).calculeSalaireResponsable());

        //création ou instanciation d'un objet p4 avec le constructeur paramétré à 4 paramètres
        ProduitAlimentaire p4 = new ProduitAlimentaire(3245,"Huile", "Mayor",1500);
        p4.setDateExpiration(new Date("12/12/2024"));
        magasin1.ajouterProduit(p4);

//        magasin1.afficherMagasin();

        Magasin magasin2 = new Magasin(2,"Mvog-Mbi", "Santa Lucia");

//        System.out.println("Afficher Magasin avec nombre produits supérieur");
//
//        System.out.println(Magasin.comparerNbProduitMagasin(magasin1,magasin2));
//
//        System.out.println("Nombre total produit : " +magasin1.getNbProduits());

        ProduitAgricole pf1 = new ProduitFruit(1254,"Fraise",12.3,"Fruit","Mars");

        ProduitAgricole pf2 = new ProduitFruit(1224,"Pastèque",50,"Fruit","Juin");
        ProduitAgricole pf3 = new ProduitFruit(7896,"Mandarine",25.6,"Fruit","Décembre");
        ProduitAgricole pl1 = new ProduitLegume(8521,"Artichauts",25.6,"Légumes","Janvier");

         magasin2.ajouterProduit(pf1);
        magasin2.ajouterProduit(pf2);
        magasin2.ajouterProduit(pf3);
        magasin2.ajouterProduit(pl1);

        magasin2.afficherMagasin();
        System.out.println(ProduitAlimentaire.determinerTypeProduit(pl1));
        System.out.println(ProduitFruit.calculeStock(magasin2));

        System.out.println(((ProduitFruit)pf1).estFrais("Mars"));

        //Prosit 6 Question 4
        /*
        Remarque : Lorsque on ajoute un nombre de produit supérieur à la taile
        du tableau il se produit un exception ArrayIndexOutOfBoundsException.
         */
    }
}