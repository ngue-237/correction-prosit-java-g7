
public class Main {
    public static void main(String[] args) {
        ProduitAlimentaire p0 = new ProduitAlimentaire();
        System.out.println("Produit p0");
        p0.afficher();
        ProduitAlimentaire p1 = new ProduitAlimentaire(1021,"Lait", "Delice");
        System.out.println("Produit p1");
        p1.afficher();
        ProduitAlimentaire p2 = new ProduitAlimentaire(2510, "Yaourt","Vitalait");
        System.out.println("Produit p2");
        p2.afficher();
        ProduitAlimentaire p3 = new ProduitAlimentaire(3250,"Tomate", "Sicam",1.2);
        System.out.println("Produit p3");
        p3.afficher();


    }
}