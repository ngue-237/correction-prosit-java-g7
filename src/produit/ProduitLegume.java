package produit;

public class ProduitLegume extends ProduitAgricole implements Critere{
    public ProduitLegume() {
        super();
    }

    public ProduitLegume(int idP, String lib, double qt, String type, String saison) {
        super(idP, lib, qt, type, saison);
    }

    @Override
    public boolean estFrais(String saison) {
        return false;
    }
}
