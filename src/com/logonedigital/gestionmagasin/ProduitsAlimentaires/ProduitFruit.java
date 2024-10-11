package com.logonedigital.gestionmagasin.ProduitsAlimentaires;

import com.logonedigital.gestionmagasin.Magasins.Magasin;

public class ProduitFruit extends ProduitsAgricoles implements Crittere{

    public ProduitFruit(int idProduit, String type, String libelle, double quantite, String saison) {
        super(idProduit ,type ,libelle ,quantite , saison ) ;
    }

    @Override
    public boolean estFrais(String saison) {
        if (this.getSaison().equals(saison))
            return true;

        return false;
    }

}
