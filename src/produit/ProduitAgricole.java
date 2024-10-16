package produit;

public class ProduitAgricole extends ProduitAlimentaire{
    private String saison;

    public ProduitAgricole(){
        super();
    }

    public ProduitAgricole(int idP, String lib, double qt, String type, String saison){
        super(idP,lib,qt,type);
        this.saison = saison;
    }

    public String getSaison() {
        return saison;
    }

    public void setSaison(String saison) {
        this.saison = saison;
    }
}
