package employe;

public class Vendeur extends Employe{
    private double tauxVente;

    public Vendeur() {
        super();
    }

    public Vendeur(int idEmploye, String nom, String adresse, int nbHeures, double tauxVente) {
        super(idEmploye, nom, adresse, nbHeures);
        this.tauxVente = tauxVente;
    }

    public double getTauxVente() {
        return tauxVente;
    }

    public void setTauxVente(double tauxVente) {
        this.tauxVente = tauxVente;
    }
}
