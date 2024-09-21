//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Produit produit0= new Produit("banane",1500.0);
        Produit[] prod1= new Produit[4];
        String[] tabNomProduit={"riz mémé","tomate héléne","riz long graine","harico"};
        Double[] tabPrixProduit={27500.0,15500.0,23500.0,5500.0};
        for (int i=0;i<4;i++){
            Produit prod2=new Produit(tabNomProduit[i],tabPrixProduit[i]);
            prod1[i]=prod2;
            prod1[i].ajoutProduit(prod1[i].nom,prod1[i].prix);
        }
        Magasin mag0= new Magasin(785,"Yaoundé",120,produit0);
        //Magasin mag0= new Magasin();
        mag0.afficherCaractMag(785,"Yaoundé",prod1 );
    }
}