import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Double prixI;
        Scanner sc= new  Scanner(System.in);
        // nous allons créer un poduit vide c'est à dire sans initialisation nommé p0
        Produit p0=new Produit();
        // créons trois nouveaux produits avec les paramètres. nommé p1,p2 et p3
        Produit p1 = new Produit(1021,"lait","delice");
        Produit p2 = new Produit(2510,"Yaourt","Vitalait");
        Produit p3 = new Produit(3250,"Tomate","Sicam",1.200);
        p1.afficher();
        p2.afficher();
        p3.afficher();
        p1.prix=0.700;
        p1.afficher();
        // complètons les informations manquantes pour chaque produit
        System.out.println("Entrez un prix pour complèter le produit de marque Lait");
        prixI=sc.nextDouble();
        p1.prix=prixI;
        System.out.println("voici l'affichage du produit lait après avoir complèter l'information manquante");
        p1.afficher();
        System.out.println("Entrez un prix pour complèter le produit de marque Yaourt");
        prixI=sc.nextDouble();
        p2.prix=prixI;
        System.out.println("voici l'affichage du produit Yaourt après avoir complèter l'information manquante");
        p2.afficher();
        System.out.println("Entrez un prix pour complèter le produit de marque Tomate");
        prixI=sc.nextDouble();
        p3.prix=prixI;
        System.out.println("voici l'affichage du produit Tomate après avoir complèter l'information manquante");
        p3.afficher();
        //7. Afficher les produits déjà crées à l’aide de la méthode toString().
        System.out.println("voici l'affichage du produit à l'aide de la methode toString");
        System.out.println(p1.toString());

    }
}

