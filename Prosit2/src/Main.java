//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Produit produit0= new Produit("banane",1500.0);

        Magasin mag0= new Magasin(785,"Yaoundé",120,produit0);
        mag0.afficherCaractMag(785,"Yaoundé",Produit[1] );
    }
}