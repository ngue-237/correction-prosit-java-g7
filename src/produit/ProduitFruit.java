package produit;

import magasin.Magasin;

public class ProduitFruit extends ProduitAgricole implements Critere{
    public ProduitFruit() {
        super();
    }

    public ProduitFruit(int idP, String lib, double qt, String type, String saison) {
        super(idP, lib, qt, type, saison);
    }

    static public double calculeStock(Magasin m){

        double totalQtite = 0;
        for(ProduitAlimentaire p : m.getProduitAlimentaire()){
           if(ProduitAlimentaire.determinerTypeProduit(p).equals("Fruits")){
               totalQtite += p.qtite;
           }
        }
        return totalQtite;
    }


    @Override
    public boolean estFrais(String saison) {
        if(this.getSaison().equals(saison))
            return true;
        return false;
    }
}
