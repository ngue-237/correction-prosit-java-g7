package com.logonedigital.gestionmagasin.ProduitsAlimentaires;

public class ProduitsAgricoles extends Produit {
    private String saison ;

    public ProduitsAgricoles() {
        super();
    }

    public ProduitsAgricoles(int idProduit, String type, String libelle, double quantite, String saison) {
        super(idProduit , type , libelle ,quantite, saison ) ;
    }

    public String determinerTypePoduit(ProduitsAgricoles p) {
        if (p instanceof ProduitFruit)
            return "fruit" ;
        else if (p instanceof ProduitLegume)
            return "legume";
        else
            return "autre";
    }



}
