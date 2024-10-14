package com.logonedigital.gestionmagasin.ProduitsAlimentaires;

import com.logonedigital.gestionmagasin.Magasins.Magasin;

public class ProduitFruit extends ProduitsAgricoles implements Crittere{
    public ProduitFruit() {

    }

    public ProduitFruit(int idProduit, String type, String libelle, double quantite, String saison) {
        super(idProduit ,type ,libelle ,quantite , saison ) ;
    }

    @Override
    public boolean estFrais(String saison) {
        if (this.getSaison().equals(saison))
            return true;

        return false;
    }

    static public double calculStock(Magasin m) {
        double quantiteTotale = 0;
        for (Produit p : m.getProduitAlimentaire()) {
            if (Produit.determinerTypePoduit(p).equals("fruit"))
                quantiteTotale += p.getQuantite();
        }
        return quantiteTotale ;
    }

}
