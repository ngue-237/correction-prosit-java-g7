//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        // nous allons créer un poduit vide c'est à dire sans initialisation nommé p0
        Produit p0=new Produit();
        // créons trois nouveaux produits avec les paramètres. nommé p1,p2 et p3
        Produit p1 = new Produit(1021,"lait","delice",0.0);
        Produit p2 = new Produit(2510,"Yaourt","Vitalait",0.0);
        Produit p3 = new Produit(3250,"Tomate","Sicam",1.200);
        p1.afficher();
        p2.afficher();
        p3.afficher();
        p1.setPrix(0.700);
        p1.afficher();
        }
    }
