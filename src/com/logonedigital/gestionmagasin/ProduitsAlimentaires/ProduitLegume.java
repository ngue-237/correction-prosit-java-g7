 package com.logonedigital.gestionmagasin.ProduitsAlimentaires;

public class ProduitLegume extends ProduitsAgricoles implements Crittere{
    public ProduitLegume() {

    }

    public ProduitLegume(int idProduit, String type, String libelle, double quantite, String saison) {
        super(idProduit, type, libelle, quantite, saison);
    }

    @Override
    public boolean estFrais(String saison) {
        if (this.getSaison().equals(saison))
            return true;

        return false;
    }

}
