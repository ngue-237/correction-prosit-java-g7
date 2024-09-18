import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Produit prod = new Produit();
        Produit pr1 = new Produit(1021, "Lait","Delice");
        Produit pr2 = new Produit(2510, "Yaourt","Vitalait");
        Produit pr3 = new Produit(3250, "Tomate","Sicam", 1.200);


        //notion de DATE
        Date thisDate = new Date();
        System.out.println(thisDate);

        // ajout du prix 0.700
        pr1.setPrix(0.700);
        System.out.println(pr1.getPrix());


        //affichage du result/ apres la modification
        prod.afficher();
        pr1.afficher();
        pr2.afficher();
        pr3.afficher();

        // to string. on constat que lee string renvoi l'adresse de chaque produit.
        prod.affich2();
        pr1.affich2();
        pr2.affich2();
        pr3.affich2();

    }
}