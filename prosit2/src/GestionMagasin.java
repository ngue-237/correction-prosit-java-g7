import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class GestionMagasin {
    public static void main(String[] args) {

Magasin magasin=new Magasin(101,"rue sepere",50);
        magasin.ajouterProduit(new ProduitAlimentaire(101,"fruit","pomme",20));
        magasin.ajouterProduit(new ProduitAlimentaire(102,"legume", "mangue",30));


        magasin.afficherDetails();
        System.out.println("Nombre total de produits: " + magasin.nombreTotalProduits());
    }
    }
